package lesson25.singleton.edinorog;

public class Main {

    public static void main(String[] args) {
	Singleton s = Singleton.getInstance();
	
	System.out.println(s);
	
	Singleton m = Singleton.getInstance();
	
	System.out.println(m);
    }
}
