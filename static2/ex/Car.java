package static2.ex;

public class Car {

	private  String name;
	private static int totalCars;
	
	public Car(String name) {
		System.out.println("���� ����, �̸� : " + name);
		this.name = name;
		totalCars++;
	}
	
	public static void showTotalCars() {
		System.out.println("������ ���� �� : " + totalCars);
	}
}