package lesson37.filesExceptions;

import java.io.File;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExmpl {
    public static FileOutputStream out;
    public static void main(String[] args) throws IOException {
	File f = new File("resources/fileExmpl/primer.txt");
	System.out.println(f.getAbsolutePath());
	/*.delete();
	f.createNewFile();*/
	
	//InputStream inputStream = new FileInputStream(f);
	out = new FileOutputStream(f, true);
	
	out.write(66);
    }
}
