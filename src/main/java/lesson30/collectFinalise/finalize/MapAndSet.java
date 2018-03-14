/**
 * 
 */
package lesson30.collectFinalise.finalize;

/**
 * @author Alexander Neznaev
 *
 */
public class MapAndSet {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Object o = new Object() {
	    
	    @Override
	    public String toString() {
	        try {
		    this.finalize();
		} catch (Throwable e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		return "result";
	    }
	    
	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("bye");
	    }
	};
	
	o.toString();
	o.toString();
    }
}
