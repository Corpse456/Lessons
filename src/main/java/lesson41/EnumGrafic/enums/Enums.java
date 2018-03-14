package lesson41.EnumGrafic.enums;

public class Enums {

    public static void main(String[] args) {
	reacOnWeather3(SeasonEnum.WINTER);
	
	SeasonEnum.valueOf("SPRING");
	SeasonEnum.valueOf(SeasonEnum.class, "SPRING");
	
	for (SeasonEnum s : SeasonEnum.values()) {
	    System.out.println(s);
	}
	
	System.out.println();
	SeasonEnum someSeason = SeasonEnum.AUTUMN;
	SeasonEnum otherSeason = SeasonEnum.SPRING;
	someSeason.compareTo(otherSeason); //AUTUMN > SPRING
	someSeason.equals(otherSeason);
	System.out.println(someSeason.name());
	System.out.println(someSeason.toString()); //то же, что name
	System.out.println(someSeason.ordinal());
	String weather = someSeason.sayWeather();
	System.out.println(weather);
    }

    private static void reacOnWeather3(SeasonEnum season) {
	if (SeasonEnum.SUMMER.equals(season)) {
	    System.out.println("sunshine");
	}
	if (SeasonEnum.AUTUMN.equals(season)) {
	    System.out.println("raining");
	}
	if (SeasonEnum.WINTER.equals(season)) {
	    System.out.println("cold");
	}
	if (SeasonEnum.SPRING.equals(season)) {
	    System.out.println("nature is rising");
	}
    }
}
