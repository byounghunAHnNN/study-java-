package poly.basic;

public class CastingMain1 {

	public static void main(String[] args) {
		Parent poly = new Child();
		poly.parentMethod();
		// poly.childMethod();
		
		// �ٿ�ĳ���� �θ�Ÿ��-> �ڽ�Ÿ������ ����
		Child child = (Child)poly; //poly�� ������ Child�� �ٲ㼭 ���Խ�Ų��.
		child.childMethod();
	}

}
