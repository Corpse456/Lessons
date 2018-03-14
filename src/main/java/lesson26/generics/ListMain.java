package lesson26.generics;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListMain {

    private static class Elephant implements Comparator<Elephant> {
	public int hobot = (int) (Math.random() * 40);
	private int order = 1;

	public Elephant() {

	}

	public Elephant(int order) {
	    this.order = order;
	}

	@Override
	public int compare(Elephant o1, Elephant o2) {
	    if (o1.hobot > o2.hobot) {
		return 1 * order;
	    } else if (o1.hobot == o2.hobot) {
		return 0;
	    } else {
		return -1 * order;
	    }
	}

	@Override
	public String toString() {
	    return "Elephant hobot length: " + hobot;
	}
    }

    public static void main(String[] args) {
	List<Elephant> stado = new LinkedList<Elephant>();

	for (int i = 0; i < 10; i++) {
	    stado.add(new Elephant());
	}

	stado.sort(stado.get(0));
	stado.sort(new Elephant(1));

	Comparator<Elephant> c = new Comparator<Elephant>() {
	    @Override
	    public int compare(Elephant o1, Elephant o2) {
		return (int) (Math.random() * 10) - 5;
	    }
	};
	stado.sort(c);

	stado.sort(new Comparator<Elephant>() {
	    private int order = (int) (Math.random() * 10) - 5;

	    @Override
	    public int compare(Elephant o1, Elephant o2) {
		if (o1.hobot > o2.hobot) {
		    return 1 * order;
		} else if (o1.hobot == o2.hobot) {
		    return 0;
		} else {
		    return -1 * order;
		}
	    }
	});

	stado.sort((o1, o2) -> {
	    if (o1.hobot > o2.hobot) {
		return 1;
	    } else if (o1.hobot == o2.hobot) {
		return 0;
	    } else {
		return -1;
	    }
	});

	for (Elephant elephant : stado) {
	    System.out.println(elephant);
	}

	System.out.println(hobotSum(stado));
    }

    // получает любую коллекцию слонов или его потомков
    static int hobotSum(Iterable<? extends Elephant> stado) {
	int sum = 0;
	for (Elephant elephant : stado) {
	    sum += elephant.hobot;
	}
	return sum;
    }
}
