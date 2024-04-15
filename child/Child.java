package extends1.access.child;

import extends1.access.parents.Parents;

public class Child extends Parents{
	public void call() {
		
		publicValue =1;
		protectedValue =1; //상속 관계 or 같은 패키지 
		// defaultValue =1;
		// privateValue =1;
		
		publicMethod();
		protectedMethod();
		
		printParent();
	}

}
