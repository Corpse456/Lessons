package lesson50.graph;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Circle extends Ellipse2D {

    @Override
    public Rectangle2D getBounds2D () {
        return null;
    }

    @Override
    public double getX () {
        return 0;
    }

    @Override
    public double getY () {
        return 0;
    }

    @Override
    public double getWidth () {
        return 0;
    }

    @Override
    public double getHeight () {
        return 0;
    }

    @Override
    public boolean isEmpty () {
        return false;
    }

    @Override
    public void setFrame (double x, double y, double w, double h) {

    }
}
