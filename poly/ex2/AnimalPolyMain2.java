package poly.ex2;

public class AnimalPolyMain2 {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal caw = new Caw();
		Animal duck = new Duck();

		Animal[] animalArr = {dog, cat, caw, duck };

		//������ �ʴ� �κ�
		for ( Animal animal : animalArr) {
			System.out.println("���� �Ҹ� �׽�Ʈ ����");
			animal.sound();
			System.out.println("���� �Ҹ� �׽�Ʈ ����");
			System.out.println(" ");
		}
	}	
}
