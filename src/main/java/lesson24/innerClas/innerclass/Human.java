package lesson24.innerClas.innerclass;

public class Human {
    private char sex;
    public String name;
    protected Human whoHeLikes;
    private static int someStaicInt = 4;

    public static class Soul{
	void anyMethod() {
	    System.out.println(someStaicInt);
	}
    }

    @SuppressWarnings("unused")
    private class Body  {
	
    }

    protected class Head {
	public Head() {
	    System.out.println(sex);
	}
    }
}
