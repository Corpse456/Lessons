package lesson92.testing.angryChess.shared_model;

public class Coord {

    private int col;
    private int row;

    public Coord(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        return (row + 1) + "-" + letters[col];
    }

}
