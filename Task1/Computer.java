package Task2;

public class Computer extends ElectronicDevice {
	public Computer() 
	{
		super();
	}
	public Computer(int power,int memory,int weight,String bluetooth)
	{
		super(power,memory,weight,bluetooth);
	}
public void UnitsTaken()
{
	power+=20;
	System.out.println("The power units consumed "+power);
}
}