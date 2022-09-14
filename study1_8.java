package study1;

class MyMath2 {
	long a,b; //iv인스턴스 변수 
	
	long add() { 
		return a+b; //  인스턴스 메서드 iv를 사용 
		//매게변수가 없어 iv값을 쓴다. iv값을 써서 lv가 필요없다. 
	}
	static long add( long a  , long b) { //long a , long b 는 지역변수로 유효범위가 존재한다. //lv
		return a+b;  // 가까운 쪽 변수를 따른다. 지역변수이다 그래서. (lv)
		//iv가 필요없다. 작업에 필요한 lv를 다 받아서 사용하기 떄문 
	}
}
public class study1_8 {

}
	class MyMathTest2{
	
	public static void main(String[] args) { //클래스이름.메서드이름()호출 
		System.out.println(MyMath2.add(200L,100L)); //클래스 메서드 호출 
		MyMath2 mm = new MyMath2(); //인스턴스 생성 
		mm.a = 200L; //iv
		mm.b= 100L;
		System.out.println(mm.add()); //인스턴스 메서드 호출 .
	}
} 	
	
	class TestClass2 {
		int iv; //인스턴스 변스 객체 생성후 사용 가능
		static int cv; //클래스 변수 언제나 사용가능
		
		void instanceMethod() {			//인스턴스 메서드 (객체가 이미 생성됐으니 호출가ㄴ능)
			System.out.println(iv); 	// 인스턴스 변수를 사용할 수 있다. 
			System.out.println(cv);	// 클래스 변수를 사용할 수 있다. 
		}
		
		static void staticMethod() { //static메서드는 객체 생성없이 호출이 가능. 
//			System.out.println(iv); // error 인스턴스 변수 사용할수 없다. static을 사용했기때문. 
			System.out.println(cv);// 클래스 변수는 사용할 수 있다. 
		}
//	class TestClass {
//		void instanceMethod() {}  //인스턴스 메서드
//		static void staticMethod() {}  //static메서드. 
//		
//		void instanceMethod2() { //인스턴스 메서드
//			instanceMethod();	//다른 인스턴스 메서드를호출한다.
//			staticMethod(); 	//static메서드를 호출한다. 항상 ok
//		}
////		static void staticMethod2() { //static메서드
////			instanceMethod();		// error! 인스턴스 메서드를 호출할 수 없다. iv로 작업하는 메서드로 객체가 필요핟. 
//			staticMethod();			// static메서드는 호출 할 수 있다. 
//		}
//	} //end of class
}
