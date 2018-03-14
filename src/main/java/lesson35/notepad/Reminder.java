package lesson35.notepad;

public class Reminder extends Record {
    private String reminderDate;

    public Reminder(String message) {
	super(message);
    }

    public String getReminderDate() {
	return reminderDate;
    }

    public void setReminderDate(String string) {
	this.reminderDate = string;
    }
}
