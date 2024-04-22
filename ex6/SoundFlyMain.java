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

		// AbstractAnimal 사용 가능
		private static void soundAnimal(AbstractAnimal animal) {
			System.out.println("동물 소리 테스트 시작");
			animal.sound();
			System.out.println("동물 소리 테스트 종료");
			System.out.println(" ");
	
	}
		private static void flyAnimal(Fly fly) {
			System.out.println("동물 테스트 시작");
			fly.fly();
			System.out.println("동물 테스트 종료");
			System.out.println(" ");
		}


}
