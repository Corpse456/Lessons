package lesson18.composition;

public class Wheel
{
	public String description = "R16";
	int bolts = 4;
	boolean casted = true;
	Tire tireOnThisWheel = null;

	public Wheel()
	{

	}
	
	public Wheel(String description, boolean putTireOn)
	{
		this.description = description;
		
		if(putTireOn)
		{
			tireOnThisWheel = new Tire("Tire of wheel " + description);
		}
	}
	
	public Wheel(boolean putTireOn)
	{
		if(putTireOn)
		{
			tireOnThisWheel = new Tire("Tire fo wheel " + description);
		}
	}
}
