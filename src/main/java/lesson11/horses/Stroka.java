package lesson11.horses;

public class Stroka {
    public static void main(String[] args) {
	String s = "abc" + "ab" + 3 + true + 8.2;
	System.out.println(s);
	int f = s.length();
	System.out.println(f);
	System.out.println(args);
	printArgs(args);
    }

    private static void printArgs(String[] args) {
	for (int k = 0; k < args.length; k++) {
	    System.out.print(args[k] + "|");
	}
	System.out.println();
    }

    /*
     * private static void print(String args) { for (int k = 0; k <
     * args.length(); k++) { System.out.print(args[k] + "|"); }
     * System.out.println(); }
     */
}
