package lesson11.horses;

public class Matrix {
    private final static int MASSLINE = 3;
    private final static int MASSCOLUMN = 4;

    public static void main(String[] args) {
	int[][] array2D;
	array2D = new int[MASSLINE][MASSCOLUMN];

	for (int i = 0; i < MASSLINE; i++) {
	    for (int j = 0; j < MASSCOLUMN; j++) {
		array2D[i][j] = (int) (Math.random() * MASSCOLUMN * 20 - MASSCOLUMN * 10);
	    }
	}

	print2d(array2D);

	sort2dArraybyMaxElement(array2D);
	System.out.println();

	print2d(array2D);
    }

    public static void print2d(int[][] arrayToPrint) {
	for (int i = 0; i < arrayToPrint.length; i++) {
	    for (int j = 0; j < arrayToPrint[i].length; j++) {
		System.out.print(arrayToPrint[i][j] + " | ");
	    }
	    System.out.println();
	}
    }

    private static void sort2dArraybyMaxElement(int[][] array2d) {
	for (int j = 0; j < array2d.length; j++) {
	    boolean check = false;
	    for (int i = 0; i < array2d.length - 1; i++) {
		if (maxElement(array2d, i) > maxElement(array2d, i + 1)) {
		    swap2d(i, i + 1, array2d);
		    check = true;
		}
	    }
	    if (!check)
		break;
	}
    }

    private static void swap2d(int i, int j, int[][] array2d) {
	int[] change = array2d[i];
	array2d[i] = array2d[j];
	array2d[j] = change;
    }

    private static int maxElement(int[][] array2d, int i) {
	int max = array2d[i][0];
	for (int j = 1; j < array2d[i].length; j++) {
	    if (array2d[i][j] > max) {
		max = array2d[i][j];
	    }
	}
	return max;
    }
}
