package lesson53.streams_serial_java8_format_closes.formatt;

import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class Formatting {
    @SuppressWarnings ("resource")
    public static void main (String[] args) {
        int a = 1, b = 2, c = 3;
        float t = 5;
        System.out.println(a + " " + b + " " + c);
        System.out.printf("%d %d %d %.2f", a, b, c, t);
        Formatter fmt = new Formatter(Locale.JAPANESE);
        fmt.format("%t", new Date());
    }
}
