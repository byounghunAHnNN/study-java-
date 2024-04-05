package a;

public class AccessData {
	
	public int publicField;
	int defaultField;
	private int privateField;
	
	public void publicMethod() {
		System.out.println("publicMethod 호출" + publicField);
	}
	
	void defaultMethod() {
		System.out.println("defaultMethod 호출 " + defaultField);
	}
	
	private void privateMedhod() {
		System.out.println("privateMetod 호출 " + privateField);
	}
	
	public void innerAccess() {
		System.out.println("내부호출");
		publicField =100;
		defaultField =200;
		privateField =300;
		
		publicMethod();
		defaultMethod();
		privateMedhod();
		
	}
	
}
