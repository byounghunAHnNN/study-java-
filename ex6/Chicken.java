package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{
	
	@Override
	public void sound() {
		System.out.println("²¿³¢¿À");
	}
	
	@Override 
	public void fly() {
		System.out.println("´ß ³¯±â ");
	}

	
}
