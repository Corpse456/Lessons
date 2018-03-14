package lesson38.PotokiVvvodaVyvoda;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

public class URLF {

    public static void main(String[] args) throws IOException {
	URL tutby = new URL("https://tut.by");
	InputStream in = tutby.openConnection().getInputStream();

	byte[] textBuffer = new byte[1000000];
	int i = 0;
	while (true) {
	    textBuffer[i] = (byte) in.read();
	    if (textBuffer[i++] == -1) break;
	}
	
	String text = new String(textBuffer, Charset.forName("UTF-8"));
	System.out.println(text);
    }
}
