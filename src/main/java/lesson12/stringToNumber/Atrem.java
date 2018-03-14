package lesson12.stringToNumber;

public class Atrem
{

	public static void main(String[] args)
	{
		int n = 5;
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = (int) (Math.random() * 10);
		}
		int d = 1;
		System.out.print(d + "::  \t");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + "\t");
		}
		System.out.println();

		while (Set(array, n) == true)
		{
			System.out.print((d + 1) + "::  \t");
			for (int j = 0; j < array.length; j++)
			{
				System.out.print(array[j] + "\t");
			}
			System.out.println();
			d++;
		}

	}

	public static boolean Set(int[] array, int n)
	{
		int i = n - 2;
		while (i != -1 && array[i] >= array[i + 1])
		{
			i--;
		}
		if (i == -1)
		{
			return false;
		}

		int m = n - 1;
		while (array[i] >= array[m])
		{
			m--;
		}

		int temp = array[i];
		array[i] = array[m];
		array[m] = temp;

		int b = i + 1;
		int c = n - 1;

		while (b < c)
		{
			int temp2 = array[b];
			array[b] = array[c];
			array[c] = temp2;
			b++;
			c--;
		}

		return true;

	}
}
