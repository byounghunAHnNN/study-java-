package poly.overriding;

public class OverridingMain {

	
	public static void main(String[] args) {
		// �ڽ� ������ �ڽ� �ν��Ͻ��� ����
		Child child = new Child();
		System.out.println("Child -> child");
		System.out.println("value = " + child.value);
		child.method();
		
		// �θ� ������ �θ� �ν��Ͻ� ����
		Parent parent = new Parent();
		System.out.println("Parent -> parent");
		System.out.println("value = " + parent.value);
		parent.method();
		
		// �θ� ������ �ڽ� �ν��Ͻ��� ���� ������ ����
		Parent poly = new Child();
		System.out.println("Parent -> Child ");
		System.out.println("Value = " + poly.value); //������ �������̵��� �ȵǰ�
		poly.method();  // -> child.method����  , �޼���� �������̵��� �ȴ�.
		
	}
}
