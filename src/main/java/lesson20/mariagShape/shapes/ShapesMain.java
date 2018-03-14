package lesson20.mariagShape.shapes;

public class ShapesMain {

    public static void main(String[] args) {
	// Triangle t = new Triangle();
	// Square s = new Square();
	// Round r = new Round();
	// Shape sh = new Shape();

	// sh.print();
	// r.print();
	Shape[] shapes = new Shape[5];

	for (int i = 0; i < shapes.length; i++) {
	    shapes[i] = Math.random() > 0.5 ? new Square() : new Round();
	}

	for (int i = 0; i < shapes.length; i++) {
	    shapes[i].print();
	    if (shapes[i].getName().equals("Krug")) {
		System.out.println(((Round) shapes[i]).getRadius());
	    }
	    System.out.println();
	}

	Shape s = new Triangle();
	s.print();
	// s.getRadius;
	((Round) s).getRadius();
    }
}
