package lesson53.streams_serial_java8_format_closes.java8;

import java.util.function.Supplier;

public class Soldat2 {

    private static int idStat = 1;
    public int id = idStat++;

    public boolean executeOrder (Supplier<String> o) {
        String executeResult;

        if ((executeResult = o.get()) == null) return false;

        System.out.println("Soldier " + toString() + " " + executeResult);

        return true;
    }

    public int heloOfficerSom (MathFunction func, double val) {
        return (int) func.calculate(val);
    }

    @Override
    public String toString () {
        return id + "";
    }
}
