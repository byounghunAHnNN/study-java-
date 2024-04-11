package static2;

public class DecoData {

	private int instanceValue;
	private static int staticValue;

	public static void staticCall() {
		// instanceValue++; //인스턴스 변수 접근, compile error
		// staticMethod();  // 인스턴스 메서드 접근, compile error


		staticValue++; // 정적 변수 접근
		staticMethod(); // 정적 메서드 접근 
	}
	
	public void instanceCall(DecoData data) {
		instanceValue++; //인스턴스 변수 접근
		instanceMethod(); //인스턴스 메서드 접근
		staticValue++; //정적 변수 접근
		staticMethod(); //정적 메서드 접근
		
		//	data.instanceValue++;
		//	data.instanceMethod();
	}

	private void instanceMethod() {
		System.out.println("instanceValue =" + instanceValue);
	}

	private static void staticMethod() {
		System.out.println("staticValue = " + staticValue);
	}


}
