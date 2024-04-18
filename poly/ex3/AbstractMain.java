package poly.ex3;


public class AbstractMain {

	public static void main(String[] args) {
		
		// 추상 클래스 생성 불가?
		//  AbstractAnimal animal = new AbstractAnimal();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();
		
		cat.sound();
		cat.move();
		
		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(caw);
		
	
	}
	//변하지 않는 부분
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
		System.out.println(" ");
		
	}
}
