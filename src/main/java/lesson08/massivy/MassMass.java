package lesson08.massivy;

public class MassMass {

    public static void main(String[] args) {
	int[] pervyMassiv = { 0, 1, 2, 3 };
	int[][] massiv = new int[2][];
	int n = 0;
	massiv[0] = pervyMassiv;
	massiv[1] = new int[3];
	massiv[1][0] = 6;
	massiv[1][1] = 7;
	massiv[1][2] = 8;

	for (int i = 0; i < 2; i++) {
	    for (int j = 0; j < 4; j++) {
		if (i == 1 && j == 3) {
		    continue;
		}
		System.out.print(massiv[i][j] + "!");
	    }
	}

	/*
	 * for (int i = 0; i < 2; i++) { for (int j = 0; j < 4; j++) { if (i ==
	 * 1 && j == 3) { continue; } massiv[i][j] = n; n++;
	 * System.out.print(massiv[i][j] + "!"); } }
	 */
	System.out.println(n);
	System.out.println();
    }
}
