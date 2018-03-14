package lesson38.PotokiVvvodaVyvoda;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.SortedMap;
import java.io.OutputStream;

public class StreamExample {

    static InputStream in;
    static OutputStream out;

    public static void main(String[] args) throws IOException {
	File f = new File("resources/fileExmpl/primer.txt");

	out = new FileOutputStream(f,true);
	out.write(69);

	in = new FileInputStream(f);
	byte[] textBuffer = new byte[(int) f.length()];
	for (int i = 0; i < textBuffer.length; i++) {
	    textBuffer[i] = (byte) in.read();
	}
	
	String text = new String(textBuffer, Charset.forName("windows-1251"));
	System.out.println(text);
	
	SortedMap<String, Charset> map = Charset.availableCharsets();
	for (String b : map.keySet()) {
	    System.out.println(b);
	}
    }
}
