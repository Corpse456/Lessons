package lesson34.exceptNout.notebook;

import java.util.Scanner;

public class GetChoise {
    @SuppressWarnings("resource")
    public static int get() {
	Scanner take = new Scanner(System.in);

	String input = take.nextLine();

	while (!check(input)) {
	    System.out.println("Wrong Input. Retry >>");
	    input = take.nextLine();
	}
	// take.close();

	return Integer.parseInt(input);
    }

    public static boolean check(String input) {
	// если ничего не введено или длина больше максимальной длины для int
	if (!("3".equals(input) || "2".equals(input) || "1".equals(input))) {
	    return false;
	}
	return true;
    }

    public static String getString() {
	@SuppressWarnings("resource")
	Scanner take = new Scanner(System.in);

	String input = take.nextLine();

	while (input.length() < 1) {
	    System.out.println("Wrong Input. Retry >>");
	    input = take.nextLine();
	}
	// take.close();

	return input;
    }
}
