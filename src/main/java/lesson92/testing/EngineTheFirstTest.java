package lesson92.testing;

import lesson92.testing.angryChess.model.engine.EngineTheFirst;
import lesson92.testing.angryChess.persistence.Player;
import lesson92.testing.angryChess.shared_model.FigureType;
import lesson92.testing.angryChess.shared_model.IGame;
import lesson92.testing.angryChess.shared_model.IPlayer;
import lesson92.testing.angryChess.shared_model.exceptions.ChessModelException;

class EngineTheFirstTest {

    public static void main (String[] args) throws ChessModelException {
        /**
         * 1. Входные данные
         * 2. Ожидаеммый результат
         * 3. Выполняем то, что проверяем
         * 4. Проверяем совпдает ли дейсвительность с ожиданием
         */
        
        //1
        long id = 1L;
        IPlayer p1 = new Player("Mocart", 1200);
        IPlayer p2 = new Player("Black Masha", 12);
        
        //2
        // ожидаем, что чёрный будет equals "Black Masha" c рейтингом 12
        // ожидаем, что белый будет как у p1 "Mocart"
        //IGame expectedGame = new GameData(id, whitePlayer, blackPlayer)
        IPlayer expBlackPlayer = new Player("Black Masha", 12);
        String expWhitePlayerName = "Mocart";
        long expectedId = 1L;
        FigureType expectedFigure = FigureType.WHITE_ROOK;
        
        //3
        EngineTheFirst engine = new EngineTheFirst();
        IGame result = engine.createNewGame(id, p1, p2);
        
        System.out.println(result.getBlackPlayer().equals(expBlackPlayer));
        System.out.println(result.getWhitePlayer().getName().equals(expWhitePlayerName));
        System.out.println(result.getGameId() == expectedId);
        System.out.println(expectedFigure.equals(result.getCurrentPosition()[0][0]));
    }
}
