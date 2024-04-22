package poly.diamond;

public class Child implements InterfaceA, InterfaceB{

	@Override
	public void methodA() {
		System.out.println("Child.MethodA");
	}
	
	@Override
	public void methodB() {
		System.out.println("Child.MethodB");
	}
	
	@Override
	public void methodCommon() {

	System.out.println("Child.methodCommon");
	}
}
