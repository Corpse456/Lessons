package lesson49.multithrading.scheduler;

public class ForexPlatfoem {

    public static void main (String[] args) {
        Action a = new ForexCalculationAction();
        final Scheduler sc = new Scheduler(a);

        new Thread() {
            @Override
            public void run () {
                sc.everyTen();
            }
        }.start();

        /*
         * new Runnable() { public void run() { sc.everyTen(); } };
         */

        sc.sayStatus();
    }
}
