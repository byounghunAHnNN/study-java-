package extends1.super2;

public class ClassB extends ClassA{

	public ClassB(int a) {
		super(); //�⺻ ������ ���� ����
		System.out.println("ClassB ������ a=" + a);
		
	}
	
	public ClassB(int a, int b) {
		super();
		System.out.println("ClassB ������ a="+ a + " b= " + b );
	}
}