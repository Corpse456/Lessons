package lesson23.interfac.interfaces;

public class ConcreteAuto implements IAuto, SolidBody{

    @Override
    public void drive() {
	// TODO Auto-generated method stub
	
    }

    @Override
    public boolean isBroken() {
	// TODO Auto-generated method stub
	return false;
    }

    @Override
    public void setDriver(String driverName) {
	// TODO Auto-generated method stub
	
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Fuck";
    }

    @Override
    public double getWeight() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int getX() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int getY() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public int getZ() {
	// TODO Auto-generated method stub
	return 0;
    }
}
