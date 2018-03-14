package lesson24.innerClas;

public final class ExamplesFinal {
    //object filds
    @SuppressWarnings("unused")
    private final ExamplesFinal field;
    //static
    @SuppressWarnings("unused")
    private static final ExamplesFinal FIELD_2 = new ExamplesFinal();
    @SuppressWarnings("unused")
    private final int intProperty = 4;
    @SuppressWarnings("unused")
    private final int[] intArrayProperty = new int[10];
    public static final boolean FIGURE_IN_GAME = true;
    public static boolean stackIsNtFull;

    public ExamplesFinal() {
	field = new ExamplesFinal();
    }

    @SuppressWarnings("unused")
    public final void start(final ExamplesFinal f) {
	stackIsNtFull = true;
	
	final int i = 2;
	System.out.println("Game is over");
    }
}
