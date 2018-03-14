package lesson20.mariagShape.shapes;

public class Main2 {

    public static void main(String[] args) {
	Triangle t = new Triangle();
	t.privet();

	Treugolnik t2 = new Treugolnik();
	t2.privet();

	Triangle t3 = new Triangle();
	System.out.println(t3);

	System.out.println();
	Triangle t4 = new Triangle();
	System.out.println(t4);
	System.out.println();

	System.out.println("Jopa".toString());

	Object o = new Object();
	System.out.println(o.hashCode());
	System.out.println(o.getClass().getName());
    }
}
