package lesson51.threads.problems;

public class ProblemExample extends Thread {

    static long sharedResource = 0;
    public static final Object GUARDIAN = new Object();

    public static void main (String[] args) throws InterruptedException {
        System.out.println("Start");
        Thread t1 = new ProblemExample();
        t1.start();
        Thread t2 = new ProblemExample();
        t2.start();
        for (long i = 0; i < 6000000000L; i++) {
            synchronized (GUARDIAN) {
                /*
                 * GUARDIAN.wait(); GUARDIAN.notify(); GUARDIAN.notifyAll();
                 */
                sharedResource++;
            }
        }
        t1.join();
        t2.join();

        System.out.println(sharedResource);
    }

    @Override
    public void run () {
        for (long i = 0; i < 60000000L; i++) {
            synchronized (GUARDIAN) {
                sharedResource++;
            }
        }
    }
}
