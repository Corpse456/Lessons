package lesson17.race.utils;

public class Utils {

    /*
     * 
     */
    public static char[][] createArray2d(char array[][]) {
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[i].length; j++) {
		array[i][j] = (char) (Math.random() * 26 + 65);
		System.out.print(array[i][j] + " ");
	    }
	    System.out.println();
	}
	return array;
    }

    /***
     * 
     */
    public static void printCharArray2d(char[][] array) {
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array.length; j++) {
		System.out.print(array[i][j] + " ");
	    }
	    System.out.println();
	}
    }
}
