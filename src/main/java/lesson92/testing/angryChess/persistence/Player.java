package lesson92.testing.angryChess.persistence;

import lesson92.testing.angryChess.shared_model.IPlayer;

/**
 * @author Alexander Neznaev
 */
public class Player implements IPlayer {

    private String name;
    private int rating;

    /**
     * Create a new Player object
     * 
     * @param name of the current player
     * @param rating of the current player 
     */
    public Player(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString () {
        return name + ", rating=" + rating;
    }

    @Override
    public int hashCode () {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + rating;
        return result;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Player other = (Player) obj;
        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) return false;
        if (rating != other.rating) return false;
        return true;
    }
}
