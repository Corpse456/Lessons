package lesson19.dataStructures;

public class Elements {
    private int value;
    private Elements element;

    public void set(int value) {
	this.value = value;
    }

    public int get() {
	return value;
    }

    public void setNext(Elements ref) {
	element = ref;
    }

    public Elements getNext() {
	return element;
    }
}
