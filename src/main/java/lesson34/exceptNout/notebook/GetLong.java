package lesson34.exceptNout.notebook;

import java.util.Scanner;

public class GetLong {
    @SuppressWarnings("resource")
    public static long get() {
	Scanner take = new Scanner(System.in);
	String input = take.nextLine();

	while (!check(input)) {
	    System.out.println("Wrong Input. Retry >>");
	    input = take.nextLine();
	}

	// take.close();
	return Long.parseLong(input);
    }

    public static boolean check(String input) {
	if (input.length() < 1 || input.length() > 20) {
	    return false;
	}

	for (int i = 0; i < input.length(); i++) {
	    if (i == 0 && input.charAt(i) == '-') {
		if (input.length() > 1) {
		    continue;
		} else {
		    return false;
		}
	    }
	    boolean exist = false;
	    for (char j = '0'; j <= '9'; j++) {
		if (j == input.charAt(i)) {
		    exist = true;
		    break;
		}
	    }
	    if (!exist) {
		return false;
	    }
	}

	if (input.length() > 18) {
	    Double one = Double.parseDouble(input);

	    if (one < -9223372036854775808D || one > 9223372036854775807D) {
		return false;
	    }
	}
	return true;
    }
}
