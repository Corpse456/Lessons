package lesson34.exceptNout.exeptions;

public class ExeptExample2 {

    private static final int DEFAULT = 100;

    public static void main(String[] args) {
	int[] exampleArray = new int[10];
	int[] exampleArray2 = null;
	int element;
	for (int i = 0; i < 10; i++) {
	    exampleArray[i] = (int) (Math.random() * 100);
	}

	try {
	    element = get(exampleArray, 4);
	    element = get(exampleArray2, 10);
	} catch (Exception e) {
	    System.out.println("Some exeption");
	    System.out.println("Exeption is " + e.getClass());
	    element = DEFAULT;
	}

	System.out.println(element);
    }

    private static int get(int[] array, int i) throws Exception {
	try {
	    return array[i];
	} catch (ArrayIndexOutOfBoundsException e) {
	    throw new Exception("Wrong index");
	}
    }
}
