package lesson48.training;

public class Cat extends Animal {

    @Override
    StringBuilder pronounce (int count) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < count; i++) {
            out.append("meow ");
        }
        return out.append("\n");
    }
}
