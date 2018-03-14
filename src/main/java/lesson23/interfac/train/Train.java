package lesson23.interfac.train;

import java.util.Date;

public class Train {

    private final int TRAIN_SPEED;
    private int[] route;
    private long[] schedule;
    private final long HOUR = 3600000L;
    private final long H24 = HOUR * 24;

    public Train(int[] route, long[] schedule, int speed) {
	this.route = route;
	this.schedule = schedule;
	TRAIN_SPEED = speed;
    }

    public Train(String[] cities, int speed) {
	TRAIN_SPEED = speed;

	route = new int[(int) (Math.random() * (cities.length + 2)) + 2];
	for (int i = 0; i < route.length; i++) {
	    route[i] = (int) (Math.random() * cities.length);
	    if (i != 0 && route[i] == route[i - 1]) {
		i--;
	    }
	}

	schedule = new long[route.length];
	schedule[0] = System.currentTimeMillis() + (int) (Math.random() * H24);
	for (int i = 1; i < schedule.length; i++) {
	    schedule[i] = schedule[i - 1] + TrainMain.DISTANCE[route[i]][route[i - 1]] / TRAIN_SPEED * HOUR
		    + (int) (Math.random() * HOUR / 6);
	}
    }

    //находит имеются ли два города по маршруту поезда
    private boolean routFind(int cityA, int cityB) {
	boolean exist1 = false, exist2 = false;
	for (int i = 0; i < route.length; i++) {
	    if (route[i] == cityA) {
		exist1 = true;
	    }
	    if (route[i] == cityB) {
		exist2 = true;
	    }
	}
	return exist1 && exist2;
    }

    //возвращает кратчайщее расстояние между городами А и Б 
    public long routTime(int cityA, int cityB) {
	if (!routFind(cityA, cityB)) {
	    return 9223372036854775807L;
	}
	
	int a = -1, b = -1;
	for (int i = 0; i < route.length; i++) {
	    if (a == -1 && route[i] == cityA) {
		a = i;
	    }
	    if (b == -1 && route[i] == cityB) {
		b = i;
	    }
	}
	return (schedule[b] > schedule[a]) ? schedule[b] - schedule[a] : schedule[a] - schedule[b];
    }

    public int[] getRoute() {
	return route;
    }

    public void setRoute(int[] route) {
	this.route = route;
    }

    public long[] getSchedule() {
	return schedule;
    }

    public void setSchedule(long[] schedule) {
	this.schedule = schedule;
    }

    public int getTrainSpeed() {
	return TRAIN_SPEED;
    }

    @SuppressWarnings("deprecation")
    @Override
    public String toString() {
	String line1 = "Route:\t";
	String line2 = "Time:\t";

	for (int i = 0; i < route.length; i++) {
	    line1 += "  " + TrainMain.CITIES[route[i]] + "\t";
	    Date d = new Date(schedule[i]);
	    line2 += "July " + d.getDate() + " " + d.getHours() + ":" + d.getMinutes() + "\t";
	}
	return line1 + "\n" + line2;
    }
}
