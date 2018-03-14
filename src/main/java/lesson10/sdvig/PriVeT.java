package lesson10.sdvig;

public class PriVeT {

    public static void main(String[] args) {
	char[] mass = { 'A', 'b', 'C', 'D', 'e', 'f', 'g', 'h', 'I', 'J', 'k', 'l', 'M', 'N', 'o', 'p', 'q', 'r', 's',
		't' };

	print(mass);
	/*
	 * for(int i = 40; i < 128; i++) { System.out.println(i + " " +
	 * (char)i); }
	 */
	for (int k = 0; k < mass.length; k++) {
	    if (mass[k] >= 'a') {
		mass[k] -= 'a' - 'A';
	    }
	    /*
	     * if (mass[k] >= 97) { mass[k] -= 32; }
	     */

	}

	print(mass);
    }

    private static void print(char[] mass) {
	for (int k = 0; k < mass.length; k++) {
	    System.out.print(mass[k]);
	}
	System.out.println();
    }

}
