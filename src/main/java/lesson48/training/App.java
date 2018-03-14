package lesson48.training;

public class App {

    public static void main (String[] args) {
        Window win = new Window();

        Animal cat = new Cat();
        Animal dog = new Dog();

        win.getOut().setText(cat.trainingAnswer(5, 8));
        win.getOut().setText(win.getOut().getText() + "\n" + dog.trainingAnswer(1, 9));
    }
}
