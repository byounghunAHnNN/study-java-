package poly.basic;

public class PolyMain {

	public static void main(String[] args) {
		
		System.out.println("parent -> parent");
		Parent parent =  new Parent();
		parent.parentMethod();
		
		
		// 자식 변수가 자식 인스턴스 참조
		System.out.println("Child -> child");

		Child child = new Child();
		child.parentMethod();
		child.childMethod();
		
		// 부모 변수가 자식 인스턴스를 참조(다형적 참조) 
		System.out.println("Parents -> child"); 
		Parent poly = new Child(); // 부모가 자식을 담을수 있다.
		poly.parentMethod(); 
		
		 // Child child1 = new Pareht(); 자식은 부모를 담을수 없다.
		
		//자식의 기능을 호출할 순 없다.
		// poly.childMethod();
		
		
	}

}
