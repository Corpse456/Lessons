package lesson13.compare;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };

		int find = 18;

		System.out.println(search(find, 0, array.length - 1, array));
	}

	public static int search(int find, int start, int end, int[] array)
	{
		if (start > end)
		{
			System.out.println("Not found");
			System.exit(0);
		}
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
