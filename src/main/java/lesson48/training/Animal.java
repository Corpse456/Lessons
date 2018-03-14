package lesson48.training;

public abstract class Animal {

    public String trainingAnswer (int i, int j) {
        StringBuilder out = new StringBuilder();
        int count = calculate(i, j);
        out.append(pronounce(count));
        out.append(wag());
        return out.toString();
    }

    private String wag () {
        return "The " + this.getClass().getSimpleName() + " wags its tail";
    }

    private int calculate (int i, int j) {
        return i + j;
    }

    abstract StringBuilder pronounce (int count);
}
