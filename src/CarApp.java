
public class CarApp {

	

	public static void main(String[] args) {
		Car c = new Car();
		
		Car ca = new Car("Jetta", "blue" , 90 );
		
		c.setSpeed(50);
		
		System.out.println(c.start());	
		System.out.println(ca.start());
		
		System.out.println(c.accelerate());
		System.out.println(ca.accelerate());
		
		System.out.println(ca.emission());
		System.out.println(ca.eTest());
		
		System.out.println(c.speed());
		System.out.println(ca.speed());
		
		System.out.println(c.stop());
		System.out.println(ca.passed());
		

}
}