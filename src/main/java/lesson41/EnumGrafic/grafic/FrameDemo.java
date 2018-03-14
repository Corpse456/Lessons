package lesson41.EnumGrafic.grafic;

import java.awt.Color;
//import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;

public class FrameDemo extends JFrame {

    private static final long serialVersionUID = 1L;

    private String msg = "Leha Windows-Application";

    public void paint(Graphics g) {
	int diam = 500;
	drawSphere(g, diam);
	g.drawString(msg, 0, 0);
	g.drawLine(59, diam / 2, 190, diam);
    }

    public void drawSphere(Graphics g, int diam) {
	int r = diam / 2;
	int alpha = 0;
	int k = 20;
	for (int i = 0; i < 4; i++) {
	    int width = (int) (r * Math.cos(Math.PI / 180 * alpha));
	    int height = (int) (r * Math.sin(Math.PI / 180 * alpha));
	    g.setColor(Color.MAGENTA);
	    g.drawArc(10 + r - width, r + height + i * 10, 2 * width, 80 - i * 20, 0, 180);
	    g.drawArc(10 + r - width, r - height + i * 10, 2 * width, 80 - i * 20, 0, 180);
	    g.setColor(Color.BLACK);
	    g.drawArc(10 + r - width, r + height + i * 10, 2 * width, 80 - i * 20, 0, -180);
	    g.drawArc(10 + r - width, r - height + i * 10, 2 * width, 80 - i * 20, 0, -180);
	    alpha += k;
	    k -= 1;
	}
	for (int i = 0; i < 4; i++) {
	    k = (i * i * 17);
	    g.drawOval(10 + k / 2, 40, diam - k, diam);
	}
    }
}
