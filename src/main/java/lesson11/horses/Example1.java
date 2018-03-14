package lesson11.horses;

import java.util.Scanner;

public class Example1 {
    public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	char[] pancake = s.toCharArray();
	System.out.println(s);
	System.out.println(pancake[0]);
	scan.close();
    }
}
