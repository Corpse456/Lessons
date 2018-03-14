package lesson35.notepad;

public class NotepadApp {

    public static void main(String[] args) {
	NotepadConsoleUI ui = new NotepadConsoleUI();
	try {
	    ui.start();
	} catch (RuntimeException e) {
	    NotepadConsoleUI ui2 = new NotepadConsoleUI();
	    ui2.setNotepad(ui.getNotepad());
	} catch (Exception e4) {
	    System.out.println("Fucking fuck");
	    System.exit(1);
	}
    }
}
