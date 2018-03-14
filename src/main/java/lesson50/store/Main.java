package lesson50.store;

public class Main {

    public static void main (String[] args) throws InterruptedException {
        Print.create();
        Store evroopt = new Store(5, 100);
        evroopt.start();
        System.out.println(evroopt.getStatus());

        for (int i = 0; i < 100; i++) {
            evroopt.customerCameIn();
        }
    }
}
