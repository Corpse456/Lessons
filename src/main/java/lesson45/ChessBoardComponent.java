package lesson45;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class ChessBoardComponent extends JComponent {

    public static final int WHITE_DOWN = 0;
    public static final int BLACK_DOWN = 1;

    @SuppressWarnings("unused")
    private int direction = WHITE_DOWN;
    @SuppressWarnings("unused")
    private Color lightColor = Color.WHITE;
    @SuppressWarnings("unused")
    private Color darkColor = Color.BLACK;
    
    public void setDirection(int dir) {
	direction = dir;
    }

    public void setColors(Color light, Color dark) {
	lightColor = light;
	darkColor = dark;
    }

    @Override
    public void paint(Graphics gr) {
	Graphics2D g = (Graphics2D) gr;
	g.fillRect(0, 0, this.getWidth(), this.getHeight());
	gr.setColor(getBackground());
    }
}
