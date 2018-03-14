package tetris2;

import java.util.Scanner;

public class UserChoise {
    
    @SuppressWarnings("resource")
    public static int get() {
	Scanner take = new Scanner(System.in);
	while (true) {
	    try {
		String input = take.nextLine();
		return Integer.parseInt(input);
	    } catch (Exception e) {
		System.out.println("Wrong Input. Retry >>");
	    }
	}
    }
}
