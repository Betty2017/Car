
public class CarApp {

	

	public static void main(String[] args) {
		Car c = new Car();
		
		Car ca = new Car("Jetta", "blue" , 90 );
		
		c.setSpeed(50);
		
		Plane p = new Plane();
		Boot b = new Boot();
		
		System.out.println(p.fly());
		
		System.out.println(c.start());	
		System.out.println(ca.start());
		
		
		System.out.println(b.flooting());

}
}