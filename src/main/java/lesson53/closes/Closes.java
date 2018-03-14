package lesson53.closes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Closes {

    public static void main (String[] args) {
        InputStream in = null;

        try {
            in = new FileInputStream("Mars");
        } catch (NullPointerException | FileNotFoundException e) {
            System.out.println("missing");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("missing 2");
                }
            }
        }

        // ---------------------

        try (InputStream in2 = new FileInputStream("Mars"); InputStream in3 = new FileInputStream("Venera")) {
        } catch (IOException e) {
            System.out.println("missing");
        }
    }
}
