package lesson57.webChat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class TutByClient2 {

    public static void main (String[] args) throws IOException {
        URL tutByUrl = new URL("https://tut.by");
        // HttpURLConnection httpClient = new HttpURLConnection();
        URLConnection urlConnection = tutByUrl.openConnection();
        HttpURLConnection httpClient = (HttpURLConnection) urlConnection;
        InputStream in = httpClient.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = "";

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
