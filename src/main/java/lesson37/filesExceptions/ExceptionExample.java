package lesson37.filesExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {

    public static void main(String[] args) throws Exception {
	/*try {
	    throw new Exception("Special exception");
	} catch (Exception e) {
	    e.printStackTrace();
	    System.out.println(e.getMessage());
	    System.out.println(e.getCause());
	    System.out.println(e.getLocalizedMessage());
	    System.out.println();
	    for (StackTraceElement el : e.getStackTrace()) {
		System.out.println(el);
		System.out.println("Jopa");
	    }
	    System.out.println();
	    e.printStackTrace(System.out);
	    try {
		throw new Exception("exception while catch other exception", e);
	    } catch (Exception e2) {
		System.out.println();
		System.out.println(e2.getMessage());
		System.out.println(e2.getCause());
		System.out.println(e2.getLocalizedMessage());
	    } finally {
		System.out.println("V lubom sluchae vypolnitsia");
		System.out.println(9/0);
	    }
	}

	try {
	    noFile();
	} catch (FileNotFoundException e1) {
	    System.out.println("There is no file, can't work");
	    //new NotepadInternalException("Obratites v podderjku i rasskajite im ob etoi prichine", e1);
	    new NotepadInternalException(e1.getMessage(), e1);
	    
	}*/
	zagadka();
    }

    /**
     * @throws FileNotFoundException
     * 
     */
    @SuppressWarnings("unused")
    private static void noFile() throws Exception {
	throw new FileNotFoundException("No file");
    }
    
    private static void zagadka() throws Exception{
	try {
	    if (Math.random() < 0.5) {
		throw new FileNotFoundException("in try file");
	    } else {
		new NotepadInternalException("in try notepad");
	    }
	} catch (IOException e) {
	    // TODO: handle exception
	} catch (Exception e2) {
	    
	} finally {
	   System.out.println("in finally");
	}
    }
}
