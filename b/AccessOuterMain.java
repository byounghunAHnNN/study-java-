package b;

import a.AccessData;

public class AccessOuterMain {

	public static void main(String[] args) {
		AccessData data = new AccessData();
		
		//public ȣǮ ����
		data.publicField =1;
		data.publicMethod();
		
		// ���� ��Ű�� default ȣ�� ����. �ٸ� ��Ű���� ȣ���� �Ұ�.
//		data.defaultField =2;
//		data.defaultMethod();
		
		//private ȣ��Ұ�
	//	data.privateField =3;
	//	data.privateMethod();
		
		data.innerAccess();
	}

	

}
