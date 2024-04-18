package poly.basic;

public class CastingMain6 {
	
//	 Parent parent1 = new Parent();
//	 Parent parent2 = new Child();

	public static void main(String[] args) {
		
		Parent parent1 = new Parent();
		System.out.println("parent1 호출");
		call(parent1);
		
		Parent parent2 = new Child();
		System.out.println("parent2 호출");
		call(parent2);
		

	}
	
	private static void call(Parent parent) {
		
		parent.parentMethod();
		/// Child 인스턴스인경우 ChildMethod() 실행
		if (parent instanceof Child ) {
			System.out.println("Child 인스턴스가 맞음");
			 Child child = (Child) parent;
			child.childMethod();
		}
	}

}
