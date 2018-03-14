package lesson12.stringToNumber;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		Scanner take = new Scanner(System.in);
		long fact;
		do
		{
			System.out.print("Input number of factorial: ");
			fact = take.nextInt();
		}
		while (fact < 1 || fact > 20);

		System.out.println(fact(fact));
		take.close();
	}
	/**
	 * 
	 * @param 21 > n > 0
	 * @return factorial
	 */
	private static long fact(long n)
	{
		if (n == 1)
		{
			return 1;
		}
		return n * fact(n - 1);
	}
}
