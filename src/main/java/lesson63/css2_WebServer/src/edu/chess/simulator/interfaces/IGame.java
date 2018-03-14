package lesson63.css2_WebServer.src.edu.chess.simulator.interfaces;

import java.util.ArrayList;

public interface IGame {

    IPlayer getPlayerToMove (); // (null if finished)

    GameResultType getGameResult ();

    FigureType[][] getCurrentPosition ();

    IPlayer getWhitePlayer ();

    IPlayer getBlackPlayer ();

    ArrayList<String> getHistoryLog ();

}
