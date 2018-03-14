package lesson05.temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class temp {
    public static void main(String[] args) throws IOException, ParseException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String date = reader.readLine();
	SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");

	Date y = s.parse(date);
	SimpleDateFormat a = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

	System.out.println(a.format(y).toUpperCase());
    }
}
