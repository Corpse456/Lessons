package lesson18.composition;

public class Main
{

	public static void main(String[] args)
	{
		/*Wheel belshina = new Wheel("Artmotion", true);

		Wheel wheel = new Wheel();

		System.out.println(belshina.tireOnThisWheel.description);
		if (wheel.tireOnThisWheel != null)
		{
			System.out.println(wheel.tireOnThisWheel.description);
		}
		else
		{
			System.out.print(wheel.description + " without tire");
		}*/
		
		Person person = new Person("Alexey");
		
		person.buyAuto("Alexey's", true);
		
		System.out.println(person.auto.wheelOnThisCar[2].description);
	}
}
