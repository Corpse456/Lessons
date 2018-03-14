package lesson22.newChess;

public class ChessMain {

    public static void main(String[] args) {
	
	Player white = new Player("Human");
	Player black = new Player("AI");
	
	Game newGame = new Game(white, black);
	newGame.start();
    }
}
