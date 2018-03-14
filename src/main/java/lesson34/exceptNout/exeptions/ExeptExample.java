package lesson34.exceptNout.exeptions;

public class ExeptExample {

    public static void main(String[] args) {
	int[] exampleArray = new int[10];
	for (int i = 0; i < 10; i++) {
	    exampleArray[i] = (int) (Math.random() * 100);
	}
	
	System.out.println(get(exampleArray, 10));
    }

    private static int get(int[] array, int i) {
	try {
	    return array[i];
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.err.println("Over size\n");
	    return array[array.length - 1];
	}
    }
}
