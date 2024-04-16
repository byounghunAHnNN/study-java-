package poly.overriding;

public class OverridingMain {

	
	public static void main(String[] args) {
		// 자식 변수가 자식 인스턴스를 참조
		Child child = new Child();
		System.out.println("Child -> child");
		System.out.println("value = " + child.value);
		child.method();
		
		// 부모 변수가 부모 인스턴스 참조
		Parent parent = new Parent();
		System.out.println("Parent -> parent");
		System.out.println("value = " + parent.value);
		parent.method();
		
		// 부모 변수가 자식 인스턴스를 참조 다형적 참조
		Parent poly = new Child();
		System.out.println("Parent -> Child ");
		System.out.println("Value = " + poly.value); //변수는 오버라이딩이 안되고
		poly.method();  // -> child.method나옴  , 메서드는 오버라이딩이 된다.
		
	}
}
