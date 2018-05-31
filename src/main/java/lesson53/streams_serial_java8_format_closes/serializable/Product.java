package lesson53.streams_serial_java8_format_closes.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
//import java.io.Serializable;
import java.util.HashSet;

public class Product implements /* Serializable */Externalizable {
    private static HashSet<Integer> codes = new HashSet<>();
    private int vendorCode;
    private transient double price;
    private double weigth;

    public Product () {
        do {
            vendorCode = (int) (Math.random() * 1000000);
        } while (!codes.add(vendorCode));

        price = (int) ((Math.random() * 10 + 0.5) * 100) / 100.0;
        weigth = (int) ((Math.random() * 10 + 0.1) * 100) / 100.0;
    }

    public int getVendor () {
        return vendorCode;
    }

    public double getPrice () {
        return price;
    }

    public double getWeigth () {
        return weigth;
    }

    @Override
    public String toString () {
        return "Product № " + vendorCode + ". Price: " + price;
    }

    @Override
    public void writeExternal (ObjectOutput out) throws IOException {
        // out.write(new byte[100]);
    }

    @Override
    public void readExternal (ObjectInput in) throws IOException, ClassNotFoundException {
        // @SuppressWarnings("unused")
        // int i = in.readInt();
    }
}
