package lesson39.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.URL;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {
	FileReader reader = new FileReader("resources/fileExmpl/primer.txt");
	LineNumberReader lreader = new LineNumberReader(reader);
	
	lreader.setLineNumber(5);
	System.out.println(lreader.getLineNumber());
	System.out.println(lreader.readLine());
	System.out.println(lreader.readLine());
	System.out.println(lreader.readLine());
	System.out.println(lreader.readLine());
	System.out.println(lreader.readLine());
	System.out.println(lreader.readLine());
	lreader.close();
	
	URL tutby = new URL("https://ya.ru");
	InputStream in = tutby.openConnection().getInputStream();
	BufferedReader bfreader = new BufferedReader(new InputStreamReader(in));
	
	while (Math.random() < 0.95) {
	    System.out.println(bfreader.readLine());
	}
    }
}
