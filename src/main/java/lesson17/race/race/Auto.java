package lesson17.race.race;

public class Auto
{
	static final int HORSE_TO_WATT = 735;
	static final double KILO_TO_METR = 3.6;

	int mass;
	double power;
	double maxSpeed, currentSpeed = 0;
	double distance;
	String driverName;

	public Auto(int mass, int power, int maxSpeed, String driverName)
	{
		this.mass = mass * 1000;
		this.power = power * HORSE_TO_WATT;
		this.maxSpeed = maxSpeed / KILO_TO_METR;
		this.driverName = driverName;
		distance = 0;
	}

	void updateStatusPerSecond(int powerUsePercent)
	{
		distance += currentSpeed / 3.6;

		currentSpeed = currentSpeed + (power * powerUsePercent / 100.0) / (mass * 0.2);

		currentSpeed = (currentSpeed > maxSpeed) ? maxSpeed : currentSpeed;
	}
}
