package lesson50.graph;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

@SuppressWarnings ("serial")
public class GraphicsPanel extends JPanel {

    private Line line;

    public GraphicsPanel () {
        line = new Line(25, 150, 78, 2);
    }

    @Override
    protected void paintComponent (Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        g2.draw(line);
    }
}
