package lesson12.stringToNumber;

public class StringtoNumbers
{

	public static void main(String[] args)
	{
		String asInt = "127";
		String asInt2 = "true";
		int i = Integer.parseInt(asInt);
		System.out.println(i);
		long i2 = Long.parseLong(asInt);
		System.out.println(i2);
		double i3 = Double.parseDouble(asInt);
		System.out.println(i3);
		float i4 = Float.parseFloat(asInt);
		System.out.println(i4);
		boolean i5 = Boolean.parseBoolean(asInt2);
		System.out.println(i5);
		byte i6 = Byte.parseByte(asInt);
		System.out.println(i6);
		char[] i7 = asInt.toCharArray();
		System.out.println(i7);
		
		//обратное преобразование
		
		Integer.toString(i);
		System.out.println(i);
		Long.toString(i2);
		System.out.println(i2);
		Double.toString(i3);
		System.out.println(i3);
		Float.toString(i4);
		System.out.println(i4);
		Boolean.toString(i5);
		System.out.println(i5);
		Byte.toString(i6);
		System.out.println(i6);
		System.out.println(i7);
		//i7.toString();
		System.out.println(i7);
		System.out.println(Character.toString('A'));
	}

}
