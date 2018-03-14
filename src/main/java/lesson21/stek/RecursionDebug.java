package lesson21.stek;

public class RecursionDebug {
    public static void main(String[] args) {
	System.out.println(sum(10));

	String fuck = new String();
	char a = 'a';
	char b = 'b';
	fuck += a;
	fuck += b;
	
	System.out.println(fuck);
    }

    public static int sum(int number) {
	if (number == 1) {
	    return 1;
	}
	return number + sum(--number);
    }
}
