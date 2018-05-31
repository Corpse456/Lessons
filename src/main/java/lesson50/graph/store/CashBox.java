package lesson50.graph.store;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CashBox extends Thread {
    private final long SPEED = (long) (Math.random() * 3000 + 300);
    private final long SLEEP_TIME = (long) (Math.random() * 3000 + 3000);
    private static int ids = 0;
    private int id = ++ids;
    private Deque<Customer> queue = new LinkedList<>();
    private Store store;
    private int countOfBuyers = 0;

    public CashBox (Store store) {
        this.store = store;
    }

    @Override
    public void run () {
        while (store.isStoreOpen()) {
            Customer cust;
            cust = queue.poll();
            if (cust != null) service(cust);
            else {
                Print.println("Free cash " + id + "!");
                if (!store.isStoreOpen()) break;
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        Print.println("CashBox №" + getId() + " has " + getCountOfBuyers() + " buyers");
    }

    public synchronized int getQueueSize () {
        return queue.size();
    }

    public synchronized Customer getLastCustomer () {
        return queue.size() > 0 ? queue.getLast() : null;
    }

    public synchronized void addCustomerToQueue (Customer customer) {
        queue.addLast(customer);
    }

    public synchronized void removeCustomerFromQueue (Customer customer) {
        queue.remove(customer);
    }

    public void service (Customer cust) {
        cust.setServed();
        Print.println("Box " + id + " serves the buyer № " + cust.getId() + ". Не нas " + cust.itemsInCart()
                + " goods. After him in the queue are " + queue.size() + " buyers");
        Map<Product, Integer> goods = cust.getGoods();
        Set<Entry<Product, Integer>> set = goods.entrySet();
        for (Map.Entry<Product, Integer> me : set) {
            try {
                Thread.sleep(SPEED);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double earnings = me.getKey().getPrice() * me.getValue();
            synchronized (store) {
                store.revenue = store.revenue + earnings;
            }
        }
        synchronized (store.getCustomers()) {
            store.getCustomers().remove(cust);
        }
        ++countOfBuyers;
    }

    @Override
    public String toString () {
        return "№: " + id + ". Queue: " + getQueueSize();
    }

    public int getCountOfBuyers () {
        return countOfBuyers;
    }

    public Customer firstInQueue () {
        return queue.size() == 0 ? null : queue.element();
    }

    public long getId () {
        return id;
    }
}
