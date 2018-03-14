package lesson35.notepad;

import java.util.Scanner;
import java.util.Set;

public class NotepadConsoleUI {

    private Notepad notepad;
    private Scanner sc = new Scanner(System.in);
    
    public void setNotepad(Notepad notepad) {
        this.notepad = notepad;
    }

    
    public Notepad getNotepad() {
	return notepad;
    }

    public NotepadConsoleUI() {
	notepad = new Notepad();
    }

    public NotepadConsoleUI(Notepad notepad) {
	this.notepad = notepad;
    }

    public void start() {
	mainMenu();
    }

    private void mainMenu() {
	while (true) {
	    System.out.println();
	    System.out.println("=================================================");
	    System.out.println("ГЛАВНОЕ МЕНЮ");
	    System.out.println("=================================================");
	    System.out.println("Выбирай:");
	    System.out.println("1. Записи");
	    System.out.println("2. Памятки");
	    System.out.println("3. До свидания");
	    String choice = sc.nextLine();
	    switch (choice) {
	    case "1":
		noteMenu();
		break;
	    case "2":
		reminderMenu();
		break;
	    default:
		return;
	    }
	}
    }

    private void noteMenu() {
	while (true) {
	    System.out.println();
	    System.out.println("=================================================");
	    System.out.println("МЕНЮ ЗАМЕТОК");
	    System.out.println("=================================================");
	    System.out.println("Чё делать с заметками:");
	    System.out.println("1. добавить");
	    System.out.println("2. удалить");
	    System.out.println("3. В главное меню");
	    System.out.println("4. Вывести на экран");
	    String choice = sc.nextLine();
	    switch (choice) {
	    case "1":
		addNote();
		break;
	    case "2":
		removeNote();
		break;
	    case "3":
		return;
	    case "4":
		printAllNotes();
		break;
	    default:
		return;
	    }
	}
    }

    private Note removeNote() {
	System.out.println("Введите ID");
	long id;
	int daun = 0;
	while (true) {
	    try {
		if (Math.random() < 0.03) {
		    throw new NullPointerException("loser");
		}
		if (Math.random() < 0.03) {
		    // обрабатывать бесполезно
		    throw new OutOfMemoryError("loser2");
		}
		if (Math.random() < 1.33) {
		    // обрабатывать здесь же невозможно
		    throw new RuntimeException("Notebook disconnect");
		}
		String idAsString = sc.nextLine();
		id = Long.parseLong(idAsString);
		break;
	    } catch (NumberFormatException e) {
		if (++daun > 5) {
		    System.out.println("Даун");
		    return null;
		}
		System.out.println("Введи правильный id");
	    } catch (NullPointerException e2) {
		System.out.println(e2.getMessage());
	    } catch (RuntimeException e3) {
		System.out.println(e3.getMessage());
		System.out.println("NotepadUI прощается с вами");
		throw e3;
	    }
	}
	/*
	 * норм способ if (!(notepad.getRecordByID(id) instanceof Note)) {
	 * System.out.println("Дурак, это памятка, а не заметка"); return null;
	 * }
	 */
	Note note = (Note) notepad.getRecordByID(id);
	System.out.println(note);
	System.out.println("Ты уверен?");
	String answer = sc.nextLine();
	if ("YES".equals(answer)) {
	    notepad.removeRecord(id);
	}
	return note;
    }

    private void addNote() {
	System.out.println("Введите текст");
	Note note = new Note(sc.nextLine());
	notepad.addRecord(note);
    }

    private void reminderMenu() {
	while (true) {
	    System.out.println();
	    System.out.println("=================================================");
	    System.out.println("МЕНЮ НАПОМИНАНИЙ");
	    System.out.println("=================================================");
	    System.out.println("Чё делать с напоминаниями:");
	    System.out.println("1. добавить");
	    System.out.println("2. удалить");
	    System.out.println("3. В главное меню");
	    System.out.println("4. Вывести на экран");
	    String choice = sc.nextLine();
	    switch (choice) {
	    case "1":
		addReminder();
		break;
	    case "2":
		removeReminder();
		break;
	    case "3":
		return;
	    case "4":
		printAllReminders();
		break;
	    default:
		return;
	    }
	}
    }

    private void removeReminder() {
	System.out.println("Введите ID");
	String idAsString = sc.nextLine();
	long id = Long.parseLong(idAsString);
	notepad.removeRecord(id);
    }

    private void addReminder() {
	System.out.println("Введите текст");
	Reminder reminder = new Reminder(sc.nextLine());
	System.out.println("Когда это надо?");
	reminder.setReminderDate(sc.nextLine());
	notepad.addRecord(reminder);
    }

    private void printAllNotes() {
	Set<Note> set = notepad.getAllNotes();
	for (Note note : set) {
	    System.out.println(note);
	}
    }

    private void printAllReminders() {
	Set<Reminder> set = notepad.getAllReminders();
	for (Reminder rem : set) {
	    System.out.println(rem);
	}
    }
}
