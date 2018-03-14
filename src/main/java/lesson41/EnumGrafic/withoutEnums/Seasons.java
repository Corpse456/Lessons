package lesson41.EnumGrafic.withoutEnums;

public class Seasons {
    
    public final static Seasons SPRING = new Seasons(1);
    public final static Seasons SUMMER = new Seasons(2);
    public final static Seasons AUTUMN = new Seasons(3);
    public final static Seasons WINTER = new Seasons(0);
    
    int uniqIdentifier;

    Seasons(int season) {
	uniqIdentifier = season;
    }
}
