package a;

public class AccessInnerMain {

	public static void main(String[] args) {
		AccessData data = new AccessData();
		
		//public ȣǮ ����
		data.publicField =1;
		data.publicMethod();
		
		// ���� ��Ű�� default ȣ�� ����.
		data.defaultField =2;
		data.defaultMethod();
		
		//private ȣ��Ұ�
	//	data.privateField =3;
	//	data.privateMethod();
		
		data.innerAccess();
	}

}
