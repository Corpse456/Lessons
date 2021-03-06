package lesson44.swingNoteAndPaint.app1.model;

public enum NoteEnum {
    ZAMETKA("ZAM"), ZADACHA("ZAD"), DEFAULT("");
    private String noteType;

    private NoteEnum(String noteType) {
	this.noteType = noteType;
    }

    public String getNoteType() {
	return noteType;
    }

    public NoteEnum getEnumByStr(String s) {
	NoteEnum en[] = NoteEnum.values();
	for (int i = 0; i < en.length; i++)
	    if (en[i].getNoteType() == s) return en[i];
	return DEFAULT;
    }
}
