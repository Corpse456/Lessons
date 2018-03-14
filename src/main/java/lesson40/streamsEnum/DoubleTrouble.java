package lesson40.streamsEnum;

public class DoubleTrouble {

    public static void main(String[] args) {
	double z = 0;
	
	for (int i = 0; i < 10; i++) {
	    z += 0.1;
	}
	System.out.println(z == 1.0);
	System.out.println(equalsD(z,1.0));
    }

    private static boolean equalsD(double z, double d ) {
	return Math.abs(z - d) < 0.0000001 ;
    }
}
