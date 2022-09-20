package study1;


class Data_1 {
	int value;
	// Data_1 () { } 기본생성자를 추가해야하지만 컴파일러가 생성자가 없을때 자동추가. 
 }

class Data_2 {
	int value;
	
	Data_2() {}
	// Data_2() { } 기본 생성자를 추가해 줘야 한다. 
	
	Data_2(int x) {
		value =x;
	}
}

public class study1_10 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1(); //ok
		Data_2 d2 = new Data_2(); // compile error 발생 

	}
}

class StaticBlockTest {
	static int [] arr = new int[10];
	static { //클래스 초기화 블럭 - 배열 arr을 난수로 채운다.
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
	}
}

class InitTest{
	static int cv = 1; //명시적 초기화 
	int iv =1;			// 명시적 초기화 
	
	static {
		cv = 2;	} // 클래스 초기화 블럭
	{iv =2;}		// 인스턴스 초기화 블럭
	
	InitTest( ) { //생성자
		iv =3;
	}
}
