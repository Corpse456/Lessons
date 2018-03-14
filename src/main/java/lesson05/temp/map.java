package lesson05.temp;

public class map {
    public static void main(String[] args) {
	double S = 0, begin = 2, end = 3, step = 0.01;
	// f(x) = sin (x) + 10

	for (double i = begin; i < end; i += step) {
	    double Sh;
	    // Площадь трапеции Sh = (a1 + a2)*h/2
	    Sh = (Math.sin(begin + step * i) + Math.sin(begin + step * (i + 1))) * step / 2;
	    S += Sh;
	}
	System.out.println(S);
    }
}
