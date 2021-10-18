package Inheritance;
public class Automatic extends Inheritance implements Fly 
{
	void autoStart() 
	{
		System.out.println("Started Automatically");
	}
	public void fly() 
	{
		System.out.println("Car can fly now");
	}
}
