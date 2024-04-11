package static2;

public class DecoData {

	private int instanceValue;
	private static int staticValue;

	public static void staticCall() {
		// instanceValue++; //�ν��Ͻ� ���� ����, compile error
		// staticMethod();  // �ν��Ͻ� �޼��� ����, compile error


		staticValue++; // ���� ���� ����
		staticMethod(); // ���� �޼��� ���� 
	}
	
	public void instanceCall(DecoData data) {
		instanceValue++; //�ν��Ͻ� ���� ����
		instanceMethod(); //�ν��Ͻ� �޼��� ����
		staticValue++; //���� ���� ����
		staticMethod(); //���� �޼��� ����
		
		//	data.instanceValue++;
		//	data.instanceMethod();
	}

	private void instanceMethod() {
		System.out.println("instanceValue =" + instanceValue);
	}

	private static void staticMethod() {
		System.out.println("staticValue = " + staticValue);
	}


}
