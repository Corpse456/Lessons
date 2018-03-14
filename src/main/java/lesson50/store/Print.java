package lesson50.store;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.util.Date;

public class Print {

    // private static FileWorks f = new FileWorks();
    static final DateFormat FORMAT = new SimpleDateFormat("HH:mm:ss");

    public static void create () {
        // f.createFile("c:/Result.txt");
    }

    public static void print (String text) {
        write(text);
    }

    public static void print (int text) {
        write(text + "");
    }

    public static void println (String text) {
        write(text + "\n");
    }

    public static void println (int text) {
        write(text + "\n");
    }

    private static void write (String text) {
        // f.write(FORMAT.format(new Date()) + text);
        System.out.print(text);
    }

    public static void close () {
        // f.close();
    }
}
