package poly.car1;

public class CarMain1 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Car k3Car = new K3Car();
		driver.setCar(k3Car);
		driver.drive();
		
		Car model3Car = new Model3Car();
		driver.setCar(model3Car);
		driver.drive();
		
		NewCar newCar = new NewCar();
		driver.setCar(newCar);
		driver.drive();
	}
}
