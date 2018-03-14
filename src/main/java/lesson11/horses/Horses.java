package lesson11.horses;

public class Horses {

    public static void main(String[] args) {
	int N = 1;
	int D = 2;
	double[] speeds = { 10000 };
	double[] positions = { 1 };

	double maxTime = 0;

	for (int i = 0; i <= N - 1; i++) {
	    if ((D - positions[i]) / speeds[i] > maxTime) {
		maxTime = (D - positions[i]) / speeds[i];
	    }
	}
	System.out.println("Скорость девушки должна быть " + D / maxTime);
    }
}
