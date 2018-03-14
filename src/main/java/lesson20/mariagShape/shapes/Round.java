package lesson20.mariagShape.shapes;

public class Round extends Shape
{
	private double radius;

	public Round()
	{
		//super("Krug");
		System.err.println("Krug");
		radius = Math.random() * 10;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public String getName()
	{
		return "Krug";
	}

	public double getPerimeter()
	{
		return radius * Math.PI * 2;
	}
	
	public double getArea()
	{
		return radius * Math.PI * radius;
	}
	
	public String getColor()
	{
		return "White";
	}
	
	public void print()
	{
		super.print();
		System.out.println("My radius is " + radius);
	}
}
