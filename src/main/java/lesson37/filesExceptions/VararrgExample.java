package lesson37.filesExceptions;

public class VararrgExample {

    public static void main(String[] args) {
	sum(1,2,3,4);
	sum(1,2,3,4,5,6,7);
	sum(1,2);
	sum(1.0,2,3);
    }
    
    static void sum (double b, int ...a) {
	double sum = 0;
	sum -= b;
	for (int i : a) {
	    sum += i;
	}
	System.out.println(sum);
    }
    
    static void sum (int ...a) {
	int sum = 0;
	for (int i : a) {
	    sum += i;
	}
	System.out.println(sum);
    }
}
