
public class Car extends Vehicle{
	
	private String name;
	private String color;
	private int speed;
	
	public void setName(String name){
		this.name= name;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public Car()
		
			{
		name = "Porsh";
		color = "red";
		
		}
	public Car(String newName, String newColor , int newSpeed)
	
	{
	name = newName;
	color = newColor;
	speed = newSpeed;
	
	}

	
	
	public String start()
	{
	return "the "+ color+ " "+name+" is starting ";
	}
	public String accelerate()
	{	
	return "the "+ color+ " "+name+" is accelerating ";
	}
	public String emission()
	{	
	return "the "+ color+ " "+name+" has stopped to have its emissions checked ";
	}
	public String eTest()
	{	
	return "the "+ color+ " "+name+" passes its emission test ";
	}
	public String speed()
	{	
	return "the "+ color+ " "+name+" is going "+" " + speed+" mph ";
	}
	public String stop()
	{	
	return "the "+ color+ " "+name+" is stopped ";
	}
	public String passed()
	{	
	return "the "+ color+ " "+name+" just passed the red Porsche ";
	}
	
	
		
	
	
}

