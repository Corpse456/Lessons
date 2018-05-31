package lesson92.testing.angryChess.model.engine;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

import lesson92.testing.angryChess.persistence.Player;
import lesson92.testing.angryChess.shared_model.IGame;
import lesson92.testing.angryChess.shared_model.IPlayer;
import lesson92.testing.angryChess.shared_model.exceptions.ChessModelException;

class EngineTheFirstTest {

    @Test
    public void PlayerAreTheSame () throws ChessModelException {
        //when 
        long id = 1L;
        IPlayer p1 = new Player("Mocart", 1200);
        IPlayer p2 = new Player("Black Masha", 12);
        //expect
        IPlayer expBlackPlayer = new Player("Black Masha", 12);
        String expWhitePlayerName = "Mocart";
        //execute
        EngineTheFirst engine = new EngineTheFirst();
        IGame result = engine.createNewGame(id, p1, p2);
        
        Assert.assertEquals(result.getBlackPlayer(), expBlackPlayer);
        Assert.assertEquals(result.getPlayerToMove().getName(), expWhitePlayerName);
    }
    
    @Test
    public void FigureAtAStartingPosition () {
        //то же самое по сути, только тест другой
    }
    
    @Test
    public void exceptionTest () {
        
    }
}
