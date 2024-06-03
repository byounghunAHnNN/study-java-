package object.poly;

public class ObjectPolyExample1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Car car  = new Car();
		
		Object o = dog;
		
		action(dog);
		action(car);

	}
	
	private static void action(Object obj) {
		  //	obj.sound(); //컴파일 오류 object는 sound가 없다.
		//	/obj.move();
		
	//	 다운캐스팅 java version 16 이상부터 
		 if (obj instanceof Dog dog) {
			 dog.sound();
		 } else if (obj instanceof Car car) {
		car.movie();
	}
		
	}

}
