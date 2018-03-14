package lesson40.streamsEnum;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Streams {

    public static void main(String[] args) {
	// Reader ... BufferedReader
	// Writrer ...  FileWriter
	//		OutputStreamWriter
	// OutputStream ... PrintStream
	// Writter ... PrintWriter
	
	// InputStream ... FilterInputStream
	//	  DataInputStream 	DataOutputStream
    }
    
    public void copy(InputStream in, OutputStream out) throws IOException {
	while(true) {
	    int val = in.read();
	    out.write(val);
	}
    }
    // Scanner
    // FileUtils
    // ioutils
    
    // В википедии URL и URI
    
    // new File("path");
    // someD/.../.../ 
    // ./someD/.../...
    // ..someD/.../...
}
