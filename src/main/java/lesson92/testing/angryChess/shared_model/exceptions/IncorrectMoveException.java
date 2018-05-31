package lesson92.testing.angryChess.shared_model.exceptions;

@SuppressWarnings ("serial")
public class IncorrectMoveException extends ChessModelException {

    public IncorrectMoveException(String message) {
        super(message);
    }

}
