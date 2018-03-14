package lesson27.collectionExample;

import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
	List<String> a = new LinkedList<String>();
	LinkedList<Integer> b = new LinkedList<Integer>();
	
	System.out.println(a + " " + b);
    }
}
