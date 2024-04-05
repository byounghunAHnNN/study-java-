package a;

public class AccessData {
	
	public int publicField;
	int defaultField;
	private int privateField;
	
	public void publicMethod() {
		System.out.println("publicMethod ȣ��" + publicField);
	}
	
	void defaultMethod() {
		System.out.println("defaultMethod ȣ�� " + defaultField);
	}
	
	private void privateMedhod() {
		System.out.println("privateMetod ȣ�� " + privateField);
	}
	
	public void innerAccess() {
		System.out.println("����ȣ��");
		publicField =100;
		defaultField =200;
		privateField =300;
		
		publicMethod();
		defaultMethod();
		privateMedhod();
		
	}
	
}
