package lesson15.moreAboutString;

public class Methods
{
	public static void main(String[] args)
	{
		System.out.println(sum(2, 3));
		sum(1, 2, 3);
		System.out.println(sum(10, 5, 6, true));
		System.out.println(sum('a', 'b'));
	}

	private static int sum(int i, int j)
	{
		return i + j;
	}

	/* нельзя private static void sum(int i, int j) {
	 * return i+j;
	 * } */

	private static void sum(int i, int j, int k)
	{
		return;
	}

	private static int sum(int i, int j, int k, boolean b)
	{
		return i / j;
	}

	private static long sum(char i, int j)
	{
		return i + j;
	}
}
