package lesson41.EnumGrafic.withoutEnums;

public class WithoutEnumsMy {

    public static void main(String[] args) {
	reacOnWeather(SeasonsConst.seasons[(int) (Math.random() * 4)]);
	reacOnWeather2((int) (Math.random() * 4 + 101));
	reacOnWeather3(Seasons.WINTER);
    }

    private static void reacOnWeather(String season) {
	switch (season) {
	case SeasonsConst.SUMMER: {
	    System.out.println("sunshine");
	    break;
	}
	case SeasonsConst.AUTUMN: {
	    System.out.println("raining");
	    break;
	}
	case SeasonsConst.WINTER: {
	    System.out.println("cold");
	    break;
	}
	case SeasonsConst.SPRING: {
	    System.out.println("nature is rising");
	    break;
	}
	}
    }

    private static void reacOnWeather2(int season) {
	switch (season) {
	case 103: {
	    System.out.println("sunshine");
	    break;
	}
	case 104: {
	    System.out.println("raining");
	    break;
	}
	case 101: {
	    System.out.println("cold");
	    break;
	}
	case 102: {
	    System.out.println("nature is rising");
	    break;
	}
	}
    }

    private static void reacOnWeather3(Seasons season) {
	if (Seasons.SUMMER.equals(season)) {
	    System.out.println("sunshine");
	}
	if (Seasons.AUTUMN.equals(season)) {
	    System.out.println("raining");
	}
	if (Seasons.WINTER.equals(season)) {
	    System.out.println("cold");
	}
	if (Seasons.SPRING.equals(season)) {
	    System.out.println("nature is rising");
	}
    }
}
