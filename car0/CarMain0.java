package poly.car0;

public class CarMain0 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		K3Car k3Car = new K3Car();
		driver.setK3Car(k3Car);
		driver.drive();
		
		
		Model3Car model3Car = new Model3Car(); // 
		driver.setK3Car(null);	// k3Car의 참조를 제거. 
		driver.setModel3Car(model3Car); // 새로운 model3Car 참조를 추가한다.
		driver.drive(); //호출 
	}

}
