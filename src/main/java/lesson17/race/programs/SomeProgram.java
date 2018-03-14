package lesson17.race.programs;

import lesson17.race.utils.Utils;

public class SomeProgram {

    public static void main(String[] args) {
	char[][] mass = Utils.createArray2d(new char[5][7]);

	System.out.println();
	Utils.printCharArray2d(mass);

	System.out.println();
	char[][] mass2 = mass;
	Utils.printCharArray2d(mass2);
    }

}
