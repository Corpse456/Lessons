package lesson53.streams_serial_java8_format_closes.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void main (String[] args) throws Exception {
        FileOutputStream fileOut = new FileOutputStream("objFile");
        ObjectOutputStream serialOut = new ObjectOutputStream(fileOut);

        FileInputStream fileIn = new FileInputStream("objFile");
        ObjectInputStream serialIn = new ObjectInputStream(fileIn);

        Product p = new Product();
        serialOut.writeObject(p);

        Object o = serialIn.readObject();
        Product p2 = null;
        if (o instanceof Product) {
            p2 = (Product) o;
        }
        System.out.println(p2);
        serialOut.close();
        serialIn.close();
    }
}
