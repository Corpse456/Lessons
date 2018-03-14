package lesson12.stringToNumber;

public class Recursion
{

	public static void main(String[] args)
	{
		method(10);
		method(12);
		method(14);
		method2();
	}

	private static void method(int i)
	{
		System.out.println(i);
		if (i > 1)
		{
			method(i - 1);
		}
		System.out.println(i);
	}

	private static void method2()
	{
		method(16);
	}

}
