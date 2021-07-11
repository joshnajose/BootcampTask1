package Task2;

public class Main {
public static void main(String args[])
{
	Main obj=new Main();
	ElectronicDevice computer=new Computer();
	ElectronicDevice laptop=new Laptop();
	ElectronicDevice phone=new Phone();
	
	obj.properties(computer);
	obj.properties(laptop);
	obj.properties(phone);

}
public void properties(ElectronicDevice a)
{
	a.PowerInput();
	
	if(a instanceof Computer)
	{
		Computer c = (Computer)a;
		c.UnitsTaken();
	}
	if(a instanceof Phone)
	{
	}
}
}
