package lesson12.stringToNumber;

public class SortByAlphabet
{

	public static void main(String[] args)
	{
		String bySort = "dfjefinvcbuiqwmjbdhiuqipouqeoiacvbmzxbviuxzghipqueyhfiuqregkjsdabvvbiulgvqkjbdvkjbmnsdgibniucgnvqmhfcjuy";
		
		char[] arrayForSort = bySort.toCharArray();
		
		System.out.println(arrayForSort);
		sort (arrayForSort);
		System.out.println(arrayForSort);
		
		String stroka = new String(arrayForSort);
		System.out.println(stroka);
		
		char[] hitro = "Privet".toCharArray();
		System.out.println(hitro);
	}

	private static void sort(char[] array)
	{
		boolean check = false;
		for (int i = 0; i < array.length - 1; i++)
		{
			if (array[i] > array[i + 1])
			{
				swap(i, i + 1, array);
				check = true;
			}
		}
		//существенно снижает время, если архив почти отсортирован и время равно 0, если полностью
		if (check)
		{
			sort(array);
		}
	}
	
	private static void swap(int i, int j, char[] array)
	{
		char change = array[i];
		array[i] = array[j];
		array[j] = change;
	}
}
