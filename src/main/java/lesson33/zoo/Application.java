package lesson33.zoo;

import lesson33.zoo.domain.*;

public class Application {

    public static void main(String[] args) {
	Zoo zoo = new Zoo();
	
	for (int i = 0; i < 20; i++) {
	    zoo.kupiSlona(new Slon("Elephant " + i%10));
	}
	
	zoo.nakormiSlonov();
    }
}
