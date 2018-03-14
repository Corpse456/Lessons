package lesson48.training;

public class Dog extends Animal {

    @Override
    StringBuilder pronounce (int count) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < count; i++) {
            out.append("gav ");
        }
        return out.append("\n");
    }
}
