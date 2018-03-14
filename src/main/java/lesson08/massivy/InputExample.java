package lesson08.massivy;

import java.util.Scanner;

public class InputExample
{
	public static void main(String[] args)
	{
		int inInt;
		double inDouble;
		
		System.out.println("Error");
		System.out.println();
		System.err.println("Error");
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Input double: ");
		inDouble = scanner.nextDouble();
		System.out.print("Input int: ");
		inInt = scanner.nextInt();
		System.out.println("Your int: " + inInt);
		System.out.println("Your double: " + inDouble);
		scanner.close();
	}
}
