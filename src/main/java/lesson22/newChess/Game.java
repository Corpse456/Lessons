package lesson22.newChess;

public class Game {
    private Board board;
    private Player playerWhite;
    private Player playerBlack;
    
    public Game(Player white, Player black) {
	board = new Board();
	playerWhite = white;
	playerBlack = black; 
	System.out.print(board);
    }

    public void start() {
	System.out.println(playerWhite);
	System.out.println(playerBlack);
    }
}
