package poly.basic;

public class PolyMain {

	public static void main(String[] args) {
		
		System.out.println("parent -> parent");
		Parent parent =  new Parent();
		parent.parentMethod();
		
		
		// �ڽ� ������ �ڽ� �ν��Ͻ� ����
		System.out.println("Child -> child");

		Child child = new Child();
		child.parentMethod();
		child.childMethod();
		
		// �θ� ������ �ڽ� �ν��Ͻ��� ����(������ ����) 
		System.out.println("Parents -> child"); 
		Parent poly = new Child(); // �θ� �ڽ��� ������ �ִ�.
		poly.parentMethod(); 
		
		 // Child child1 = new Pareht(); �ڽ��� �θ� ������ ����.
		
		//�ڽ��� ����� ȣ���� �� ����.
		// poly.childMethod();
		
		
	}

}
