package lesson34.exceptNout.notebook;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Note {
    private List<Long> id = new LinkedList<Long>();
    private List<Date> dateOfCreate = new LinkedList<Date>();
    private List<String> content = new LinkedList<String>();

    public void add(long id2, Date date, String note) {
	id.add(id2);
	dateOfCreate.add(date);
	content.add(note);
    }

    public boolean remove(long id2) {
	if (id.contains(id2)) {
	    dateOfCreate.remove(id.indexOf(id2));
	    content.remove(id.indexOf(id2));
	    id.remove(id.indexOf(id2));
	    return true;
	}
	return false;
    }

    @Override
    public String toString() {
	if (id.isEmpty()) {
	    return "There no notes yet";
	}

	String string = new String();
	for (int i = 0; i < id.size(); i++) {
	    string += "ID: " + id.get(i) + " / ";
	    string += dateOfCreate.get(i) + " / ";
	    string += "Content: " + content.get(i);
	    string += "\n";
	}
	return string;
    }
}
