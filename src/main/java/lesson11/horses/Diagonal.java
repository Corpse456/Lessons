package lesson11.horses;

public class Diagonal {
    private final static int MASSLENGTH = 5;

    public static void main(String[] args) {
	int[][] array2D;
	array2D = new int[MASSLENGTH][MASSLENGTH];

	for (int i = 0; i < MASSLENGTH; i++) {
	    for (int j = 0; j < MASSLENGTH; j++) {
		array2D[i][j] = (int) (Math.random() * 100 - 50);
	    }
	}

	print2d(array2D);

	int s = 0;
	for (int i = 0; i < MASSLENGTH; i++) {
	    s += array2D[i][i];
	}
	System.out.println(s);
    }

    public static void print2d(int[][] arrayToPrint) {
	for (int i = 0; i < arrayToPrint.length; i++) {
	    for (int j = 0; j < arrayToPrint[i].length; j++) {
		System.out.print(arrayToPrint[i][j] + " | ");
	    }
	    System.out.println();
	}
    }

}
