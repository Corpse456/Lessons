package lesson18.composition;

public class Person
{
	public Auto auto = null;
	public String name = "One";
	
	public Person()
	{
	}
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public void buyAuto(String description, boolean buyTires)
	{
		auto = new Auto(description,buyTires);
	}
}
