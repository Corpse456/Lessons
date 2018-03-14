package lesson08.massivy;

public class Massivy {
    public static void main(String[] args) {
	// объявление массивов:
	int a = 0, b = 1, c[];
	int[] d, e = { 1 };
	char[] f = "privet".toCharArray();
	// int[] dvoinoy[];
	// int[][] troinoy[];
	int[][] dvoinoy, dvoinoy2;
	int[][][] troinoy;

	// инициализация:
	int[] g = { 2, 3, 4, 17 };
	d = new int[10000]; // заполнен нулями
	boolean i[] = { true, true, true, false };
	boolean[] boolArray = new boolean[10];
	char[] charArray = new char[100];
	dvoinoy = new int[10][10];
	troinoy = new int[10][10][10];
	dvoinoy2 = new int[10][1];
	System.out.println(dvoinoy);
	System.out.println(dvoinoy2);
	System.out.println(troinoy);

	// чтение:
	System.out.println(boolArray[2]);
	System.out.println(charArray[1]);
	for (int k = 0; k < boolArray.length; k++) {
	    System.out.print(boolArray[k] + "|");
	}
	System.out.println();

	for (int k = 0; k < charArray.length; k++) {
	    System.out.print(charArray[k] + "|");
	}
	System.out.println();

	System.out.println(g[2]);
	System.out.println(d[2]);
	// System.out.println(c[2]); //нет массива, нечего выводить

	// запись:
	d[5000] = 100;
	i[2] = true;

	// определить длину
	System.out.println(d.length);
	System.out.println(boolArray.length);
	// System.out.println(c.length); //нет массива, нечего выводить

	// присваивание
	c = g;
	g = d; // ссылке g присваивается значение ссылки d
	g[1] = d[100];
	// g = i; - нельзя

	System.out.println(a + "" + b + "" + c + "" + e);
	System.out.println(f);
    }
}
