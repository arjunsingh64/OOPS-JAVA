class Bicycle
{
	//Declaring data types
	public int gear;
	public int speed;

	//dfining Constructor
	public Bicycle(int gear,int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}

	//Defining two methods
	public void applyBrake(int decrement)
	{
		speed = speed - decrement;
	}

	public void speedUp(int increment)
	{
		speed = speed + increment;	
	}

	public String toString()
	{
		return("Number of gears are : " + gear + "\n" + "Speed of bicycle is : " + speed);
	}
}

class MountainBike extends Bicycle
{
	public int weight;

	public MountainBike(int gear,int speed,int weight)
	{
		super(gear,speed);
		this.weight=weight;
	}

	public void IncreasedWeight(int value)
	{
		weight = value;
	}

	@Override
	public String toString()
	{
		return(super.toString() + "\nWeight of bicycle : " + weight);	
	}

	
}

public class Test
{
	public static void main(String [] args)
	{
		MountainBike obj = new MountainBike(7,50,10);
		System.out.println(obj.toString());	
	}
}
