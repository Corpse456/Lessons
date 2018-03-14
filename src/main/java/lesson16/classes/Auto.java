package lesson16.classes;

public class Auto
{
	String color;
	int HorsePower;
	static String classDescription = "this is auto class";

	public Auto()
	{
		if (Math.random() > 0.5)
		{
			color = "black";
		}
		else
		{
			color = "white";
		}
		HorsePower = (int) (Math.random() * 1200) + 1;
	}

	public Auto(String color, int initPower)
	{
		this.color = color;
		HorsePower = initPower;
	}

	public Auto(Auto original)
	{
		this.color = original.color;
		this.HorsePower = original.HorsePower;
	}
}
