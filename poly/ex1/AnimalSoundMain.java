package poly.ex1;

public class AnimalSoundMain {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();
		
		
		
		
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		dog.sound();
		System.out.println("���� �Ҹ� �׽�Ʈ ����");

		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		cat.sound();
		System.out.println("���� �Ҹ� �׽�Ʈ ����");


		soundCaw(caw);
	}

	private static void soundCaw(Caw caw) {
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		caw.sound();
		System.out.println("���� �Ҹ� �׽�Ʈ ����");

	}

}
