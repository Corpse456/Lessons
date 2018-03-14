package lesson37.filesExceptions;

public class NotepadInternalException extends Exception {

    private static final long serialVersionUID = 1L;

    public NotepadInternalException() {
	
    }

    public NotepadInternalException(String message, Throwable cause, boolean enableSuppression,
	    boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }

    public NotepadInternalException(String message, Throwable cause) {
	super(message, cause);
    }

    public NotepadInternalException(String message) {
	super(message);
    }

    public NotepadInternalException(Throwable cause) {
	super(cause);
    }
}
