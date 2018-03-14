package lesson08.massivy;

public class PereborGolov {

    public static void main(String[] args) {
	int headsNum = 50000;
	long sum = 0;
	long maxPower = -9999999L;
	long time = System.currentTimeMillis();
	for (int heads1 = 1; heads1 < headsNum - 2; heads1++) {
	    for (int heads2 = 1; heads2 < headsNum - 2; heads2++) {
		int heads3 = headsNum - heads1 - heads2;
		sum++;
		if (heads1 * heads2 * heads3 > maxPower) {
		    maxPower = heads1 * heads2 * heads3;

		}
	    }
	}
	System.out.println(sum);
	System.out.println(maxPower);
	System.out.println("Time - " + (System.currentTimeMillis() - time) / 1000f);
    }

}
