package lesson32.Tree;

import java.util.Comparator;

public class Application {

    public static void main(String[] args) {
	Comparator<Integer> comp = new Comparator<Integer>() {
	    @Override
	    public int compare(Integer o1, Integer o2) {
	        return Integer.compare(o1, o2);
	    }
	};
	
	ShagoSet<Integer> fuck = new ThreeShagoSet<Integer>(comp);
	
	for (int i = 0; i < 1000; i++) {
	    fuck.add((int) (Math.random() * 1000));
	}
	
	System.out.println(fuck);
    }
}
