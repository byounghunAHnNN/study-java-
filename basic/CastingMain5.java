package poly.basic;

public class CastingMain5 {
	
//	 Parent parent1 = new Parent();
//	 Parent parent2 = new Child();

	public static void main(String[] args) {
		
		Parent parent1 = new Parent();
		System.out.println("parent1 ȣ��");
		call(parent1);
		
		Parent parent2 = new Child();
		System.out.println("parent2 ȣ��");
		call(parent2);
		

	}
	
	private static void call(Parent parent) {
		parent.parentMethod();
		if (parent instanceof Child) {
			System.out.println("Child �ν��Ͻ��� ����");
			Child child = (Child) parent;
			child.childMethod();
		}
	}

}
