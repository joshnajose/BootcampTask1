package Task2;

public class Inheritance {

	public static void main(String args[])
	{
		Laptop a=new Laptop(15,4,30,"enabled");
		a.PowerInput();
		System.out.println(a.getpower());
		a.UnitsTaken();
		System.out.println(a.getpower());
		a.Portablity();
		
		Computer c = new Computer();
		c.PowerInput();
		c.UnitsTaken();
	}
}
