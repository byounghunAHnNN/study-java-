package poly.basic;


// upcasting vs downcasting
public class CastingMain3 {

	public static void main(String[] args) {

		Child child = new Child();
		Parent parent1 = (Parent) child; // �ٸ� Ÿ������ ������ ĳ������ �ؾ��ϳ� ��ĳ������ ���� ����(����)
		Parent parent2 = child; //Upcasting ���� 

		parent1.parentMethod();
		parent2.parentMethod();
 
	}
}
