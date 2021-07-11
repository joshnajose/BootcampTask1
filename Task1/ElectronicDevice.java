package Task2;

public class ElectronicDevice
{
int power,memory,weight;
String bluetooth;
public ElectronicDevice()
{
	
}
ElectronicDevice(int power, int memory, int weight,String bluetooth)
{
	this.power = power;
	this.memory = memory;
	this.weight = weight;
	this.bluetooth = bluetooth;
}
public int getpower() 
{
	return power;
}
public void setpower(int power) 
{
	this.power=power;
}
public int getmemory() 
{
	return memory;
}
public void setmemory(int memory) 
{
	this.memory=memory;
}
public int getweight() 
{
	return weight;
}
public void setweight(int weight) 
{
	this.weight=weight;
}
public String getbluetooth() 
{
	return bluetooth;
}
public void setbluetooth(String bluetooth) 
{
	this.bluetooth=bluetooth;
}

public void PowerInput()
{
	power=power*10;
	System.out.println("Power - "+power);
}
}
