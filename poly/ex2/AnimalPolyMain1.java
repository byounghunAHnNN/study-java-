package poly.ex2;

public class AnimalPolyMain1 {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal caw = new Caw();

		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(caw);
	}

	private static void soundAnimal(Animal animal) {
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		animal.sound();
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		System.out.println(" ");
	
	}
}
