package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {

	public static void main(String[] args) {
	
		System.out.println("1. ���� ȣ��");
		DecoData.staticCall();
		
		staticCall();
		
		System.out.println("2. �ν��Ͻ� ȣ��1");
		DecoData data1 = new DecoData();
		data1.instanceCall(data1);
		
		System.out.println("3. �ν��Ͻ� ȣ��2");
		DecoData data2 = new DecoData();
		data2.instanceCall(data2);
		
		//�ν��Ͻ��� ���� ����
		DecoData data3 = new DecoData();
		data3.staticCall();
		
		
		//Ŭ������ ���� ����
		DecoData.staticCall(); 
		
	}

}
