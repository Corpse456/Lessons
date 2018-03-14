package lesson16.classes;

public class MainWithCounstructors
{
	public static void main(String[] args)
	{
		Auto veryPowerfulAuto, veryWeakAuto;
		
		veryPowerfulAuto = new Auto("black", 1200);
		veryWeakAuto = new Auto("pink", 35);
		
		Auto oneMoreAuto = new Auto();
		System.out.println(oneMoreAuto.HorsePower);
		
		System.out.println(veryPowerfulAuto.color);
		System.out.println(veryPowerfulAuto.HorsePower);
		System.out.println(veryWeakAuto.color);
		System.out.println(veryWeakAuto.HorsePower);
		
		Auto autoFourth = new Auto(veryWeakAuto);
		System.out.println(autoFourth.color);
		
		//создать 50 авто со случайой мощностью, отсортировать и распечатать
		Auto[] autoPark = new Auto[50];
		
		init(autoPark);
		
		print(autoPark);
		sort(autoPark);
		print(autoPark);
		
	}

	private static void init(Auto[] autoPark)
	{
		for(int i = 0; i < autoPark.length; i++)
		{
			autoPark[i] = new Auto();
		}
	}
	
	private static void sort(Auto[] autoPark)
	{
		boolean check = false;
		for (int i = 0; i < autoPark.length - 1; i++)
		{
			if (autoPark[i].HorsePower > autoPark[i + 1].HorsePower)
			{
				swap(i, i + 1, autoPark);
				check = true;
			}
		}
		//существенно снижает время, если архив почти отсортирован и время равно 0, если полностью
		if (check)
		{
			sort(autoPark);
		}
	}
	
	private static void swap(int i, int j, Auto[] autoPark)
	{
		Auto change = autoPark[i];
		autoPark[i] = autoPark[j];
		autoPark[j] = change;
	}
	
	private static void print(Auto[] autoPark)
	{
		int counter = 0;
		for (int k = 0; k < autoPark.length; k++)
		{
			System.out.print(autoPark[k].HorsePower + "|");
			System.out.print(autoPark[k].color + "|");
			counter++;
			if (counter % 25 == 0)
			{
				System.out.println();
			}
		}
		System.out.println();
	}
}
