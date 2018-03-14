/**
 * 
 */
package lesson31.HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/**
 * @author Alexander Neznaev
 *
 */
public class HashSett {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Set<?> se = new HashSet<Object>();
	System.out.println(se);

	Map<?, ?> ma = new HashMap<Object, Object>();
	System.out.println(ma);

	Map<String, String> m = System.getenv();
	Set<String> s = m.keySet();
	Iterator<String> i = s.iterator();
	
	while (i.hasNext()) {
	    String currentKey = i.next();
	    String value = m.get(currentKey);
	    System.out.println(currentKey + " : " + value);
	}
    }
}
