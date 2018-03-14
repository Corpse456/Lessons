package lesson33.zoo;

import lesson33.zoo.domain.Slon;

public class Zoo {
    
    BeastSet<Slon> elephants = new SlonoSet<Slon>();
    
    public void kupiSlona (Slon slon) {
	elephants.add(slon);
    }
    
    public void nakormiSlonov () {
	int size = elephants.getSize();
	
	for (int i = 0; i < size; i++) {
	    Slon slon = elephants.next();
	    System.out.println(slon.getName() + " eating");
	}
    }
}
