package poly.ex2;

public class AnimalPolyMain3 {

	public static void main(String[] args) {
//		Animal dog = new Dog();
//		Animal cat = new Cat();
//		Animal caw = new Caw();
		Animal[] animalArr = {new Dog(), new Cat(),new Caw(), new Duck(), new Pig() };

		//������ �ʴ� �κ�
		for ( Animal animal : animalArr) {
			soundAnimal(animal);
		}
	}	
	
	//������ �ʴ� �κ�
	private static void soundAnimal(Animal animal) {
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		animal.sound();
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		System.out.println(" ");
		
	}
}
