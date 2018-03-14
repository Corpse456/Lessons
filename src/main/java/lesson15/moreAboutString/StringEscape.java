package lesson15.moreAboutString;

public class StringEscape
{
	// специальынй символ \
	static String s = "\"stroka novaya  \u03FA";

	public static void main(String[] args)
	{
		System.out.println(s);
		System.out.println("\u2655");
	}

}
