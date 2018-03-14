package lesson42.graph;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Components {
    public static void main(String[] args) throws InterruptedException {
	JFrame window = new JFrame();
	window.setVisible(true);
	while (true) {
	    Thread.sleep(400);
	    window.setSize(new Dimension((int) (Math.random() * 300 + 100),
		    (int) (Math.random() * 300 + 100)));
	}
    }
}
