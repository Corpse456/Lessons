package lesson48.threads_streams.streams;

import lesson48.threads_streams.training.Window;

public class Thread2 extends Thread {
    Window win;

    public Thread2 (Window win) {
        this.win = win;
    }

    @SuppressWarnings ("static-access")
    @Override
    public void run () {
        Thread.currentThread().yield();
        int count = 0;
        while (count < 10) {
            if (true) {// Math.random() < 0.00000001) {
                // System.out.println("Main 2 thread is alive");
                win.getOut().append("Main 2 thread is alive\n");
                count++;
            }
        }
        // System.out.println("The end 2");
        win.getOut().append("The end 2");
    }
}
