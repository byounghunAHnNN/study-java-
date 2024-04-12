package extends1.ex2;


public class CarMain {

	public static void main(String[] args) {
		ElectricCar ecelictCar = new ElectricCar();
		ecelictCar.move();
		ecelictCar.charge();
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillup();
	}
}
