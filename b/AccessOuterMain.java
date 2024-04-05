package b;

import a.AccessData;

public class AccessOuterMain {

	public static void main(String[] args) {
		AccessData data = new AccessData();
		
		//public 호풀 가능
		data.publicField =1;
		data.publicMethod();
		
		// 같은 패키지 default 호출 가능. 다른 패키지라 호출이 불가.
//		data.defaultField =2;
//		data.defaultMethod();
		
		//private 호출불가
	//	data.privateField =3;
	//	data.privateMethod();
		
		data.innerAccess();
	}

	

}
