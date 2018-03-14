package lesson32.Tree;

import java.util.Comparator;

public class ThreeShagoSet<OTHER_TYPE> implements ShagoSet<OTHER_TYPE> {

    private Comparator<OTHER_TYPE> comparator;
    private Node<OTHER_TYPE> root = null;
    private int size = 0;

    public ThreeShagoSet(Comparator<OTHER_TYPE> comparator) {
	this.comparator = comparator;
    }

    public int size() {
	return size;
    }

    @Override
    public void add(OTHER_TYPE element) {
	Node<OTHER_TYPE> newNode = new Node<OTHER_TYPE>(element);

	if (root == null) {
	    root = newNode;
	    size++;
	    return;
	}

	Node<OTHER_TYPE> current = root;
	while (true) {
	    if (comparator.compare(element, current.value) == 0) {
		return;
	    }

	    if (comparator.compare(element, current.value) > 0) {
		if (current.right == null) {
		    current.right = newNode;
		    size++;
		    break;
		}
		current = current.right;
	    } else {
		if (current.left == null) {
		    current.left = newNode;
		    size++;
		    break;
		}
		current = current.left;
	    }
	}
    }

    @Override
    public void remove(OTHER_TYPE element) {

    }

    @Override
    public boolean contains(OTHER_TYPE element) {
	return false;
    }
    
    @Override
    public String toString() {
	return toString(root);
    }

    private String toString(Node<OTHER_TYPE> current) {
	if (current == null) {
	    return "";
	}
	
	return toString(current.left) + " " + current.value + toString(current.right);
    }

    private static class Node<OTHER_TYPE> {
	public OTHER_TYPE value;
	public Node<OTHER_TYPE> left;
	public Node<OTHER_TYPE> right;

	public Node(OTHER_TYPE value) {
	    this.value = value;
	}
    }
}
