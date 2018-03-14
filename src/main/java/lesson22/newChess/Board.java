package lesson22.newChess;

import lesson22.newChess.pieces.*;

public class Board {

    private static Piece[][] chessBoard;
    private char white = 'W';
    private char black = 'B';
    public static final String[] PIECESWHITE = { "WP", "WR", "WH", "WB", "WQ", "WK", "WB", "WH", "WR" };
    public static final String[] PIECESBLACK = { "BP", "BR", "BH", "BB", "BQ", "BK", "BB", "BH", "BR" };

    public Board() {
	chessBoard = new Piece[8][8];
	for (int i = 0; i < 8; i++) {
	    chessBoard[1][i] = new Pawn(black);
	    chessBoard[6][i] = new Pawn(white);
	}
	chessBoard[0][0] = chessBoard[0][7] = new Rook(black);
	chessBoard[7][0] = chessBoard[7][7] = new Rook(white);
	chessBoard[0][1] = chessBoard[0][6] = new Horse(black);
	chessBoard[7][1] = chessBoard[7][6] = new Horse(white);
	chessBoard[0][2] = chessBoard[0][5] = new Bishop(black);
	chessBoard[7][2] = chessBoard[7][5] = new Bishop(white);
	chessBoard[0][3] = new Queen(black);
	chessBoard[7][3] = new Queen(white);
	chessBoard[0][4] = new King(black);
	chessBoard[7][4] = new King(white);
    }

    public void makeMove() {

    }

    @Override
    public String toString() {

	String string = new String();
	string += letter();
	for (int i = 0; i < 8; i++) {
	    string += "\n\t    ";
	    string += cellEmpty(i);
	    string += "\n\t" + (8 - i) + "   "; // цифры слева
	    string += cellFig(i);
	    string += "   " + (8 - i) + "\n\t    "; // цифры справа
	    string += cellEmpty(i);
	}
	string += letter();
	return string;
    }

    private String letter() {
	String string = new String();
	string += "\n\n";
	string += "\t\t";
	for (int i = 'A'; i <= 'H'; i++) {
	    string += (char) i + "\t";
	}
	string += "\n";
	return string;
    }

    private String cellFig(int i) {
	String string = new String();
	for (int j = 0; j < 8; j++) {
	    if ((i + j) % 2 != 0) {
		if (chessBoard[i][j] == null) {
		    string += "||||||||";
		} else {
		    string += "|| " + chessBoard[i][j] + " ||";
		}
	    } else {
		if (chessBoard[i][j] == null) {
		    string += "        ";
		} else {
		    string += "   " + chessBoard[i][j] + "   ";
		}
	    }
	}
	return string;
    }

    private String cellEmpty(int black) {
	String string = new String();
	if (black % 2 == 1) {
	    for (int k = 0; k < 4; k++) {
		string += "||||||||        ";
	    }
	} else {
	    for (int k = 0; k < 4; k++) {
		string += "        ||||||||";
	    }
	}
	return string;
    }
}
