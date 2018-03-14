package lesson20.mariagShape.shapes;

public class Triangle extends Shape {
    int length;

    @Override
    public String toString() {
	return "I'm " + getName() + ". Color is " + getColor() + ".\nArea is " + getArea() + ". Perimetr is "
		+ getPerimeter() + ".";
    }

    @Override
    public double getPerimeter() {
	// TODO Auto-generated method stub
	return 5.7;
    }

    @Override
    public boolean equals(Object o) {
	if (!o.getClass().equals(this.getClass())) {
	    return false;
	}
	/*
	 * if (o instanceof Triangle) { }
	 */
	Triangle oAsTr = (Triangle) o;

	if (oAsTr.getName() != this.getName() && oAsTr.getColor() != this.getColor()) {
	    return false;
	}

	return true;
    }

    @Override
    public double getArea() {
	// TODO Auto-generated method stub
	return 0;
    }
}
