package extends1.access.child;

import extends1.access.parents.Parents;

public class Child extends Parents{
	public void call() {
		
		publicValue =1;
		protectedValue =1; //��� ���� or ���� ��Ű�� 
		// defaultValue =1;
		// privateValue =1;
		
		publicMethod();
		protectedMethod();
		
		printParent();
	}

}
