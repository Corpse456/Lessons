package lesson57.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;

public class TutByClient {

    public static void main (String[] args) throws IOException {
        /**
         * IP [178.172.160.5] == tut.by TCP Установить соединение Прочитать всё,
         * что вам сказали
         */
        InetAddress ipV4 = Inet4Address.getByName("178.172.160.5");
        System.out.println(ipV4.isReachable(9000));

        Socket client = new Socket("178.172.160.5", 80);
        InputStream in = client.getInputStream();
        OutputStream out = client.getOutputStream();
        out.write("GET /HTTP/1.0\r\n Host: alexey\r\n\r\n".getBytes(Charset.forName("ASCII")));

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = "";

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        client.close();
    }

    @SuppressWarnings ("resource")
    public static void main2 (String[] args) throws Exception {
        // IP [178.172.160.4]
        // TCP
        // Установить соединение
        // Прочитать всё, что нам сказали
        // InetAddress ipV4 = Inet4Address.getByName("127.0.0.1");
        InetAddress ipV4 = Inet4Address.getByName("178.172.160.4");
        System.out.println(ipV4.isReachable(4000));

        // Socket client = new Socket("178.172.160.4", 80);
        Socket client = new Socket("lurkmore.to", 80);
        InputStream in = client.getInputStream();
        OutputStream out = client.getOutputStream();
        out.write("GET /index.html HTTP/1.0\r\n Host: alexey\r\n\r\n".getBytes(Charset.forName("ASCII")));
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
