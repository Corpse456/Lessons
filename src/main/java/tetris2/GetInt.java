package tetris2;

import java.util.Scanner;

public class GetInt {
    @SuppressWarnings("resource")
    public static int get() {
	Scanner take = new Scanner(System.in);
	String input = take.nextLine();
	
	while (true) {
	    try {
		input = take.nextLine();
		return Integer.parseInt(input);
	    } catch (Exception e) {
		System.out.println("Wrong Input. Retry >>");
	    }
	}
    }
}
