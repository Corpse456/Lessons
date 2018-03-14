package lesson33.zoo;

import lesson33.zoo.domain.Beast;
import lesson33.zoo.domain.Slon;

public class SlonoSet<T extends Beast> implements BeastSet<Slon> {

    private Slon[] stall = new Slon[1000];
    private int lastReturnedSlonIndex = -1;
    private int size = 0;

    public int getSize() {
	return size;
    }

    @Override
    public void add(Slon element) {
	if (contains(element)) {
	    System.out.println("Already exist");
	    return;
	}

	for (int i = 0; i < stall.length; i++) {
	    if (stall[i] == null) {
		stall[i] = element;
		size++;
		return;
	    }
	}

	System.out.println("To much elephant");
    }

    @Override
    public void remove(Slon element) {
	if (element == null) {
	    return;
	}

	for (int i = 0; i < stall.length; i++) {
	    if (element.equals(stall[i])) {
		stall[i] = null;
		size--;
	    }
	}
    }

    @Override
    public boolean contains(Slon element) {
	for (Slon slon : stall) {
	    if (element == null || element.equals(slon)) {
		return true;
	    }
	}
	return false;
    }

    @Override
    public Slon next() {
	for (int i = lastReturnedSlonIndex + 1; i < stall.length; i++) {
	    if (stall[i] != null) {
		lastReturnedSlonIndex = i;
		return stall[i];
	    }
	}

	for (int i = 0; i < stall.length; i++) {
	    if (stall[i] != null) {
		lastReturnedSlonIndex = i;
		return stall[i];
	    }
	}
	return null;
    }
}
