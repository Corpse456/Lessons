package lesson34.exceptNout.notebook;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
	boolean exit = false;
	Note notes = new Note();
	Reminder reminders = new Reminder();

	while (!exit) {
	    System.out.println("1. Notes\n2. Reminders\n3. Exit");
	    switch (GetChoise.get()) {
	    case 1: {
		System.out.println("1. Show all notes\n2. Add\n3. Remove\n4. Upper");
		switch (GetChoise.get()) {
		case 1: {
		    System.out.println(notes);
		    break;
		}
		case 2: {
		    System.out.println("Please, input ID");
		    long id = GetLong.get();

		    System.out.println("Please, input content");
		    String content = GetChoise.getString();

		    notes.add(id, new Date(), content);
		    break;
		}
		case 3: {
		    System.out.println("Please, input ID");
		    long id = GetLong.get();
		    if (notes.remove(id)) {
			System.out.println("note " + id + " deleted");
		    } else {
			System.out.println("There is no reminder with ID " + id);
		    }
		    break;
		}
		default:
		    break;
		}
		break;
	    }
	    case 2: {
		System.out.println("1. Show all reminders\n2. Add\n3. Remove\n4. Upper");
		switch (GetChoise.get()) {
		case 1: {
		    System.out.println(reminders);
		    break;
		}
		case 2: {
		    System.out.println("Please, input ID");
		    long id = GetLong.get();

		    System.out.println("Please, input content");
		    String content = GetChoise.getString();

		    System.out.println("Please, input date");
		    String date = GetChoise.getString();

		    reminders.add(id, date, content);
		    break;
		}
		case 3: {
		    System.out.println("Please, input ID");
		    long id = GetLong.get();
		    if (reminders.remove(id)) {
			System.out.println("Reminder " + id + " deleted");
		    } else {
			System.out.println("There is no reminder with ID " + id);
		    }
		    break;
		}
		default:
		    break;
		}
		break;
	    }
	    case 3: {
		exit = true;
		break;
	    }
	    default:
		break;
	    }
	}
    }
}
