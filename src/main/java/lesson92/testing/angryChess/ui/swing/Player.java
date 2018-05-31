package lesson92.testing.angryChess.ui.swing;

import lesson92.testing.angryChess.shared_model.IPlayer;

public class Player implements IPlayer {
    private String name = "";
    private int rating = 0;
    
    public Player() {
        
    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
