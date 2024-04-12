package extends1.ex3;


public class CarMain {

	public static void main(String[] args) {
		ElectricCar ecelictCar = new ElectricCar();
		ecelictCar.move();
		ecelictCar.charge();
		ecelictCar.openDoor();
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillup();
		gasCar.openDoor();
		
		HydrogenCar hydrpgenCar = new HydrogenCar();
		hydrpgenCar.move();
		hydrpgenCar.fillHydrogen();
		hydrpgenCar.openDoor();
	}
}
