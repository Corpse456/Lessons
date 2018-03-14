package lesson50.store;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Store extends Thread {
    private List<CashBox> boxes;
    private Stock range;
    private List<Customer> customers;
    private boolean customerInside = false;
    public double revenue = 0;
    private boolean storeOpen = true;

    /**
     * @param cashBoxAmount - количество касс
     * @param rangeVariety - разнообразие ассортимента в единицах
     */
    public Store (int cashBoxAmount, int rangeVariety) {
        boxes = new ArrayList<>();
        for (int i = 0; i < cashBoxAmount; i++) {
            CashBox box = new CashBox(this);
            boxes.add(box);
            box.start();
        }
        range = new Stock(rangeVariety);
        customers = new CopyOnWriteArrayList<Customer>();
    }

    @Override
    public void run () {
        while (storeOpen) {
            if (customerInside && customers.size() == 0) {
                storeOpen = false;
                revenuePrint();
                Print.println("Store closed");
                break;
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Print.println(getStatus());
        Print.close();
    }

    /**
     * 
     */
    private void revenuePrint () {
        revenue *= 100;
        revenue = Math.round(revenue);
        Print.println("total revenue: " + revenue / 100.0);
    }

    public void customerCameIn () {
        Customer c = new Customer(range, boxes);
        customers.add(c);
        c.start();
        if (!customerInside) customerInside = true;
    }

    public boolean isEmpty () {
        return range.isEmpty();
    }

    public String getStatus () {
        String out = "Customers:\n" + customers.toString() + "\n";
        out += "CashBoxes:\n" + boxes.toString() + "\n";
        return out + "\n" + range.toString();
    }

    public List<Customer> getCustomers () {
        return customers;
    }

    public List<CashBox> getBoxes () {
        return boxes;
    }

    public Stock getRange () {
        return range;
    }

    public boolean isStoreOpen () {
        return storeOpen;
    }
}
