package lesson22.newChess.pieces;

public class Piece {

    public char color;
    public char name;
    public int letter;
    public int digit;
    
    @Override
    public String toString() {
	String temp = new String();
	temp += color;
	temp += name;
        return temp;
    }
}
