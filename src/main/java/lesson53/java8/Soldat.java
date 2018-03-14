package lesson53.java8;

public class Soldat {

    private static int idStat = 1;
    private int id = idStat++;

    public boolean executeOrder (Order o) {
        String executeResult;

        if ((executeResult = o.execute()) == null) return false;

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
