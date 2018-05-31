package lesson50.graph.store;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Customer extends Thread {
    private static int ids = 0;
    private final long decisionMaking = (long) (Math.random() * 3000 + 500);
    private int maxWeight = (int) (Math.random() * 20 + 10);
    private double cash = Math.random() * 100;
    private int id = ++ids;
    private Stock range;
    private List<CashBox> boxes;
    private Map<Product, Integer> goods = new HashMap<Product, Integer>();
    private CashBox chosenBox;
    private boolean served;

    public Customer (Stock stock, List<CashBox> boxes) {
        range = stock;
        this.boxes = boxes;
    }

    @Override
    public void run () {
        chooseGoods();
        try {
            Thread.sleep(decisionMaking);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chooseCashBox();
        while (!served) {
            try {
                Thread.sleep(decisionMaking);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (this.equals(chosenBox.getLastCustomer()) && chosenBox.getQueueSize() > 1) {
                chooseCashBox();
            }
        }
    }

    private void chooseGoods () {
        double amount = Math.random() * range.size();
        for (int i = 0; i < amount; i++) {
            try {
                Thread.sleep(decisionMaking);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            getRandomProduct();
            if (cash < 1) break;
            if (maxWeight < 0.2) break;
        }
    }

    private void getRandomProduct () {
        int amount = (int) (Math.random() * 5 + 1);

        Iterator<Product> it = range.keySet().iterator();
        Product result = null;

        if (!it.hasNext()) return;
        while (it.hasNext()) {
            try {
                result = it.next();
            } catch (ConcurrentModificationException e) {
                return;
            }
            if (Math.random() < 0.1) break;
        }
        if (result == null) return;

        int number = range.get(result);
        if (number == 0) return;

        while (!buyerIsAble(result, amount)) {
            amount--;
        }
        if (amount < 1) return;

        if (number < amount) {
            range.remove(result);
            buy(number, result);
        } else {
            range.put(result, number - amount);
            buy(amount, result);
        }
    }

    /**
     * @param amount
     * @param result
     */
    private void buy (int amount, Product result) {
        goods.put(result, amount);
        cash -= result.getPrice() * amount;
        maxWeight -= result.getWeigth() * amount;
    }

    private boolean buyerIsAble (Product result, int amount) {
        if (cash < result.getPrice() * amount) { return false; }
        if (maxWeight < result.getWeigth() * amount) { return false; }
        return true;
    }

    private void chooseCashBox () {
        int min = 0;
        for (int i = 1; i < boxes.size(); i++) {
            if (boxes.get(i).getQueueSize() < boxes.get(min).getQueueSize()) min = i;
        }
        if (!boxes.get(min).equals(chosenBox)) {
            if (chosenBox != null) chosenBox.removeCustomerFromQueue(this);
            chosenBox = boxes.get(min);
            chosenBox.addCustomerToQueue(this);
        }
    }

    @Override
    public String toString () {
        return "№: " + id + ". Items in the cart: " + itemsInCart();
    }

    public int itemsInCart () {
        Collection<Integer> amount = goods.values();
        int sum = 0;
        for (Integer i : amount) {
            sum += i;
        }
        return sum;
    }

    public long getId () {
        return id;
    }

    public Map<Product, Integer> getGoods () {
        return goods;
    }

    public void setServed () {
        served = true;
    }
}
