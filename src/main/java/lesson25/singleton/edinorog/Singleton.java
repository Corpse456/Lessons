package lesson25.singleton.edinorog;

public class Singleton {
    private int value;
    private static Singleton instance = null;

    private Singleton() {
	value = (int) Math.random() * 10;
    }

    public static Singleton getInstance() {
	if (instance == null) {
	    instance = new Singleton();
	}
	return instance;

    }

    public int getValue() {
	return value;
    }

    public void setValue(int value) {
	this.value = value;
    }
}
