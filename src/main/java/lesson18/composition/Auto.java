package lesson18.composition;

public class Auto
{
	public Wheel[] wheelOnThisCar = { new Wheel(), null, null, null };
	public String description = "Great car";
	
	public Auto()
	{
		
	}

	public Auto(String description, boolean buyTires)
	{
		this.description = description;
		for (int i = 0; i < wheelOnThisCar.length; i++)
		{
			wheelOnThisCar[i] = new Wheel("Wheel " + (i + 1) + " for car " + description, buyTires);
		}
	}
}
