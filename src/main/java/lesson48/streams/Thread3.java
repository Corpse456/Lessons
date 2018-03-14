package lesson48.streams;

import lesson48.training.Window;

public class Thread3 extends Thread {
    Window win;

    public Thread3 (Window win) {
        this.win = win;
    }

    @Override
    public void run () {
        int count = 0;
        while (count < 10) {
            if (true) {// Math.random() < 0.00000001) {
                // System.out.println("Main 2 thread is alive");
                win.getOut().append("Main 3 thread is alive\n");
                count++;
            }
        }
        // System.out.println("The end 2");
        win.getOut().append("The end 3");
    }
}
