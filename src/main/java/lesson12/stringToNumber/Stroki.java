package lesson12.stringToNumber;

public class Stroki
{
	private final static int MASSLENGTH = 2;
	public static void main(String[] args)
	{
		String stroka = "Hello world";
		int[] a  = { 1,2 };
		int[] b = a.clone();
		b[0] = 6;
		System.out.println(a[0]);
		int length = stroka.length();
		System.out.println(length);
		char[] mass = stroka.toCharArray();
		char simvol = stroka.charAt(1); //'e'
		System.out.println(simvol);

		String strokaIzMassiva = new String(mass);
		System.out.println(strokaIzMassiva);
		
		//добавляем восклицательный знак в конце:
		char[] exclamation = new char [stroka.length() + 1];
		for (int i = 0; i < stroka.length(); i++)
		{
			exclamation[i] = stroka.charAt(i);
		}
		exclamation[exclamation.length - 1] = '!';
		
		print(exclamation);
		
		String newStroka = new String(exclamation);
		System.out.println(newStroka);
		
		/**			типы данных:
		 * примитивные			объектные
		 * 						- особый случай массив
		 * 						- особый случай String
		 * 						- особый случай объект обёртки
		 * 						Integer
		 * 						Double
		 * 						Character
		 * 						Byte
		 * 						...
		 */
		int z = 0;
		System.out.println(z);
		long time = System.currentTimeMillis();
		for (int i = 0; i < 2000000000L; i++)
		{
			z += a.length;
		}
		System.out.println("Time - " + (System.currentTimeMillis() - time) / 1000f);
		
		time = System.currentTimeMillis();
		for (int i = 0; i < 2000000000L; i++)
		{
			z += MASSLENGTH;
		}
		System.out.println("Time - " + (System.currentTimeMillis() - time) / 1000f);
	}
	
	private static void print(char[] array)
	{
		for (int k = 0; k < array.length; k++)
		{
			System.out.print(array[k] + "");
		}
		System.out.println();
	}

}
