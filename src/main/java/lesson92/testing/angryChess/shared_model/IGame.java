package lesson92.testing.angryChess.shared_model;

import java.util.ArrayList;

public interface IGame {

	long getGameId();

	GameStatusType getGameStatus();

	FigureType[][] getCurrentPosition();

	IPlayer getPlayerToMove();

	IPlayer getWhitePlayer();

	IPlayer getBlackPlayer();

	ArrayList<String> getHistoryLog();

	default boolean isFinished() {
		return getPlayerToMove() == null;
	};

}
