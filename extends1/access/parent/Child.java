package extends1.access.parent;


import extends1.access.parent.Parent;

public class Child extends Parent{
	
	public void call() {
		publicValue = 1;
		protectedValue =1;
		// defaultValue =1;
		// privatedValue =1;
		
		publicMethod();
		
	}
}
