package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
	
	@Override
	public void sound() {
		System.out.println("Â±¤‹");
	}
	
	@Override 
	public void fly() {
		System.out.println("»õ ³¯±â ");
	}

}
