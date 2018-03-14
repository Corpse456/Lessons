package lesson23.interfac.interfaces;

public interface SolidBody {

    public final static double G = 9.8;
    
    double getWeight();
    
    int getX();
    int getY();
    int getZ();
}
