package lesson16.classes;

public class JustMain
{

	public static void main(String[] args)
	{
		Auto veryPowerfulAuto, veryWeakAuto;
		
		System.out.println(Auto.classDescription);
		
		veryPowerfulAuto = new Auto();
		veryWeakAuto = new Auto();
		
		veryPowerfulAuto.color = "black";
		veryWeakAuto.color = "green";
		
		System.out.println("veryPowerfulAuto color = " + veryPowerfulAuto.color);
		System.out.println("veryWeakAuto color = " + veryWeakAuto.color);
		
		//задание значений в объекте
		
		veryPowerfulAuto.HorsePower = 1200;
		veryWeakAuto.HorsePower = 35;
		
		System.out.println(veryPowerfulAuto == veryWeakAuto);
		
		System.out.println("veryPowerfulAuto power = " + veryPowerfulAuto.HorsePower);
		System.out.println("veryWeakAuto power = " + veryWeakAuto.HorsePower);
		
		Auto oneMoreAuto;
		oneMoreAuto = veryPowerfulAuto;
		System.out.println(oneMoreAuto == veryPowerfulAuto);
		
		oneMoreAuto.HorsePower = 1250;
		System.out.println("veryPowerfulAuto power = " + veryPowerfulAuto.HorsePower);
	
	}
}
