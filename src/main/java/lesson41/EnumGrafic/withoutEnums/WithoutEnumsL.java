package lesson41.EnumGrafic.withoutEnums;

public class WithoutEnumsL {

    public static void main(String[] args) {
	long time = System.nanoTime();
	for (int i = 0; i < SeasonsConst.OPER; i++) {
	    reacOnWeather(SeasonsConst.seasons[(int)(Math.random() * 4)]);
	}
	System.out.println((System.nanoTime() - time) / 1000000.0);
    }

    private static void reacOnWeather(String season) {
	if (SeasonsConst.SUMMER.equals(season)) {
	    //System.out.println("sunshine");
	}
	if (SeasonsConst.AUTUMN.equals(season)) {
	    //System.out.println("raining");
	}
	if (SeasonsConst.WINTER.equals(season)) {
	    //System.out.println("cold");
	}
	if (SeasonsConst.SPRING.equals(season)) {
	    //System.out.println("nature is rising");
	}
    }
}
