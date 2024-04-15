package poly.basic;


// upcasting vs downcasting
public class CastingMain3 {

	public static void main(String[] args) {

		Child child = new Child();
		Parent parent1 = (Parent) child; // 다른 타입으로 들어갈때는 캐스팅을 해야하나 업캐스팅은 생략 가능(권장)
		Parent parent2 = child; //Upcasting 생략 

		parent1.parentMethod();
		parent2.parentMethod();
 
	}
}
