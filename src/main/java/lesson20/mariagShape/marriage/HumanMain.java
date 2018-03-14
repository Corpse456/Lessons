package lesson20.mariagShape.marriage;

public class HumanMain {
    public static void main(String[] args) {
	Human[] people = new Human[4];

	for (int i = 0; i < people.length; i++) {
	    people[i] = new Human();
	}

	for (int i = 0; i < people.length; i++) {
	    people[i].print();
	}

	for (int i = 0; i < people.length; i++) {
	    int random = (int) (Math.random() * people.length);
	    if (people[i].getSex() == people[random].getSex()) {
		i--;
		continue;
	    }
	    people[i].setWhoHeLikes(people[random]);
	}

	System.out.println("-----------------------");
	for (int i = 0; i < people.length; i++) {
	    people[i].print();
	}
    }
}
