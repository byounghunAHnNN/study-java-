package poly.ex6;

import poly.ex5.InterfaceAnimal;

public class SoundFlyMain {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Bird bird =  new Bird();
		Chicken chicken = new Chicken();

		soundAnimal(dog);
		soundAnimal(bird);
		soundAnimal(chicken);

		//		moveAnimal(dog);
		//		moveAnimal(bird);
		//		moveAnimal(chicken);
		//		

		flyAnimal(bird);
		flyAnimal(chicken);

	}

		// AbstractAnimal ��� ����
		private static void soundAnimal(AbstractAnimal animal) {
			System.out.println("���� �Ҹ� �׽�Ʈ ����");
			animal.sound();
			System.out.println("���� �Ҹ� �׽�Ʈ ����");
			System.out.println(" ");
	
	}
		private static void flyAnimal(Fly fly) {
			System.out.println("���� �׽�Ʈ ����");
			fly.fly();
			System.out.println("���� �׽�Ʈ ����");
			System.out.println(" ");
		}


}
