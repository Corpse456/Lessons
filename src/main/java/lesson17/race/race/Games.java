package lesson17.race.race;

public class Games {
    public static void main(String[] args) {
	Auto auto1 = new Auto(1436, 170, 195, "Player");
	Auto auto2 = new Auto(1100, 220, 170, "Gamer");

	while (auto1.distance < 10000 && auto2.distance < 10000) {
	    auto1.updateStatusPerSecond((int)(Math.random()*100 - 20));
	    auto2.updateStatusPerSecond((int)(Math.random()*100 - 20));
	    
	    System.out.printf("%.0f\t%.0f\n",auto1.distance,auto2.distance);
	}
    }
}

//1/3,6
