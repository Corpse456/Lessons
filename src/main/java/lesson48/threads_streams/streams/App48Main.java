package lesson48.threads_streams.streams;

import lesson48.threads_streams.training.Window;

public class App48Main {
    static Window win = new Window();

    public static void main (String[] args) {
        Thread t2 = new Thread2(win);
        Thread t3 = new Thread3(win);
        Thread t4 = new Thread(new MyRunnable());
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run () {
                int count = 0;
                while (count < 10) {
                    if (true) {// Math.random() < 0.00000001) {
                        // System.out.println("Main thread is alive");
                        win.getOut().append("Main 5 thread is alive\n");
                        count++;
                    }
                }
                // System.out.println("The end");
                win.getOut().append("The end 5");
            }
        });
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        int count = 0;
        while (count < 10) {
            if (true) {// Math.random() < 0.00000001) {
                // System.out.println("Main thread is alive");
                win.getOut().append("Main thread is alive\n");
                count++;
            }
        }
        // System.out.println("The end");
        win.getOut().append("The end");
    }

    public static class MyRunnable implements Runnable {

        @Override
        public void run () {
            int count = 0;
            while (count < 10) {
                if (true) {// Math.random() < 0.00000001) {
                    // System.out.println("Main 2 thread is alive");
                    win.getOut().append("Main 4 thread is alive\n");
                    count++;
                }
            }
            // System.out.println("The end 2");
            win.getOut().append("The end 4");
        }
    }
}
