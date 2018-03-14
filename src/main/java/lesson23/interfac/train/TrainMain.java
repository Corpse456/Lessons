package lesson23.interfac.train;

public class TrainMain {

    public final static String[] CITIES = { "Minsk   ", "Brest   ", "Gomel   ", "Grodno  ", "Vitebsk ", "Mogilev ",
	    "Bobruisk" };
    // public static int[][] DISTANCE = new int[CITIES.length][CITIES.length];
    public final static int[][] DISTANCE = { { 0, 348, 309, 280, 294, 199, 145 }, { 348, 0, 531, 236, 633, 533, 479 },
	    { 309, 531, 0, 595, 337, 180, 156 }, { 280, 236, 595, 0, 571, 485, 431 },
	    { 294, 633, 337, 571, 0, 158, 276 }, { 199, 533, 180, 485, 158, 0, 117 },
	    { 145, 479, 156, 431, 276, 117, 0 } };
    public static final int TRAINS_NUMBER = 10;
    public static Train[] trains = new Train[TRAINS_NUMBER];

    public static void main(String[] args) {

	for (int i = 0; i < trains.length; i++) {
	    trains[i] = new Train(CITIES, (int) (Math.random() * 50) + 70);

	    System.out.println(
		    "\n\t\t\t\tTrain №" + (i + 1) + ". Speed is " + trains[i].getTrainSpeed() + "\n" + trains[i]);
	}

	int city1 = (int) (Math.random() * CITIES.length);
	int city2 = (city1 + 3) % CITIES.length;

	System.out.println(findShortestTime(city1, city2));

    }

    /**
     * @param cityA
     * @param cityB
     * @return Minimum time from city A to city B or absence message
     */
    public static String findShortestTime(int city1, int city2) {
	long min = 9223372036854775807L;
	int train = -1;

	for (int i = 0; i < trains.length; i++) {
	    if (min > trains[i].routTime(city1, city2)) {
		min = trains[i].routTime(city1, city2);
		train = i;
	    }
	}
	
	if (train != 1) {
	    return "\nA shortest way from " + CITIES[city1] + " to " + CITIES[city2]
		    + "or in the opposite direction on train №" + (train + 1) + ":\n" + trains[train];
	} else {
	    return "No communication between stations";
	}
    }
}
