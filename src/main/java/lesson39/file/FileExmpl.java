package lesson39.file;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExmpl {

    public static void main(String[] args) {
	File f = new File("resources/fileExmpl/primer.txt");

	FileOutputStream out = null;

	try {
	    out = new FileOutputStream(f, true);
	    out.write(66);
	} catch (FileNotFoundException e) {

	} catch (IOException e) {

	} finally {
	    closeQuietly(out);
	}
    }

    /**
     * @param out
     */
    private static void closeQuietly(FileOutputStream out) {
	if (out != null) {
	    try {
		out.close();
	    } catch (IOException e) {
		System.err.println("Can't close stream");
	    }
	}
    }
}
