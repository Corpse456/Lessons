package lesson20.mariagShape.shapes;

public class Square extends Shape {
    private double side;

    public Square() {
	super("Kvadrat");
	side = Math.random() * 10;
    }

    public double getPerimeter() {
	return side * 4;
    }

    public double getArea() {
	return side * side;
    }

    public String getColor() {
	return "Blue";
    }
}
