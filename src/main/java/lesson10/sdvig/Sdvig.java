package lesson10.sdvig;

public class Sdvig {

    public static void main(String[] args) {
	// int[] mass = { 0, 1, 90, 4, 5, 7, -50290, 9, 56, 67, 95, 74, -50,
	// 12589, -35, 8, 19, 1561, 35748, 48 };

	int[] mass = new int[10];

	for (int i = 0; i < mass.length; i++) {
	    mass[i] = i;
	}
	print(mass);

	int k = 2;
	sdvig2(mass, k);

	while (k > 0) {
	    sdvig(mass);
	    k--;
	}

	print(mass);

    }

    private static void sdvig2(int[] mass, int k) {
	int[] mass2 = new int[mass.length];
	for (int i = 0; i < mass.length; i++) {
	    mass2[i] = mass[(i + k) % mass.length];
	}
	print(mass2);
    }

    private static void print(int[] array) {
	for (int k = 0; k < array.length; k++) {
	    System.out.print(array[k] + "|");
	}
	System.out.println();
    }

    private static void sdvig(int[] array) {
	int temp = array[array.length - 1];
	for (int i = array.length - 2; i >= 0; i--) {
	    array[i + 1] = array[i];
	}
	array[0] = temp;
    }
}
