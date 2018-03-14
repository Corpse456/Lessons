package lesson26.generics;

public class MainGeneric<Z> {

    public static void main(String[] args) {
	int a = 4;
	long b = 5;
	Integer c = 7;
	
	System.out.println(min(a, b, c));
    }

    static <TT extends Number> TT min(TT a, TT b, TT c) {
	return c;
    }
}
