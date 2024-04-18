package poly.ex3;

public class Dog extends AbstractAnimal{
	
	@Override //자식이 구현한거. 불완전한 메서드를
	public void sound() {
		System.out.println("멍멍");
	}
	
	
}
