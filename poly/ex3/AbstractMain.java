package poly.ex3;


public class AbstractMain {

	public static void main(String[] args) {
		
		// �߻� Ŭ���� ���� �Ұ�?
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
	//������ �ʴ� �κ�
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		animal.sound();
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		System.out.println(" ");
		
	}
}
