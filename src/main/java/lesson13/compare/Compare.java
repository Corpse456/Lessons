package lesson13.compare;

public class Compare
{
	private final static int MASSLENGTH = 30000;
	private static int count = 0;

	public static void main(String[] args)
	{
		int[] mass = new int[MASSLENGTH];

		for (int i = 0; i < MASSLENGTH; i++)
		{
			mass[i] = (int) (Math.random() * MASSLENGTH);
		}

		//print(mass);

		long time = System.currentTimeMillis();
		sort(mass);
		long time2 = System.currentTimeMillis();

		print(mass);

		System.out.println("Time - " + (time2 - time) / 1000f);

		time = System.currentTimeMillis();
		sort(mass);
		System.out.println("Time - " + (System.currentTimeMillis() - time) / 1000f);
		
		int find = 29999;
		System.out.println(search(find, 0, mass.length - 1, mass));
		System.out.println(count);
	}

	private static void sort(int[] array)
	{
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] < array[i - 1])
			{
				int j = i - 1;
				int buff = array[i];
				while (j >= 0 && buff < array[j])
				{
					array[j + 1] = array[j];
					j--;
				}
				array[j + 1] = buff;
			}
		}
	}

	private static void print(int[] array)
	{
		int counter = 0;
		for (int k = 0; k < array.length; k++)
		{
			System.out.print(array[k] + "|");
			counter++;
			if (counter % 25 == 0)
			{
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static int search(int find, int start, int end, int[] array)
	{
		if (start > end)
		{
			System.out.println("Not found");
			System.exit(0);
		}
		count++;
		int middle = (start + end) / 2;

		if (find > array[middle])
		{
			return search(find, middle + 1, end, array);
		}
		else if (find < array[middle])
		{
			return search(find, start, middle-1, array);
		}
		else
		{
			return middle;
		}
	}
}
