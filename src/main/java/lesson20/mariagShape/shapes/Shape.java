package lesson20.mariagShape.shapes;

abstract public class Shape {
    private String color = "red";
    private String name = "Shape-father";
    protected String accesableByChildren = "Hello from Father";

    public Shape() {
	System.err.println("Inside shape construktor");
    }

    public Shape(String name) {
	System.err.println("Inside shape construсtor with parametr");
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }

    public void print() {
	System.out.println("I'm " + getName() + ". Color is " + getColor() + ".\nArea is " + getArea()
		+ ". Perimetr is " + getPerimeter() + ".");
    }

    protected void privet() {

    }
}
