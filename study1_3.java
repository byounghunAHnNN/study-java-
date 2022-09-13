package study1;

public class study1_3 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result = mm.max(5, 3); //둘중 큰 값을 반환하는 메서드 반환했음. 
		long result5 = mm.low(5,3);
		long result1 = mm.add(5L, 3L); //add 메서드 호출
		long result2 = mm.subtract(5L, 3L); //subtract메서드 호출
		long result3 = mm.multiply(5L, 3L); 
		double result4 =  mm.divide(5L, 3L);
		mm.printGugudan(3); //구구단 3단 출력
		
		System.out.println("low(5L,3L) = " + result5);
		System.out.println("max(5L,3L) = " + result);
		System.out.println("add(5L,3L) = " + result1);
		System.out.println("subtract(5L,3L) = " + result2);
		System.out.println("multiply(5L,3L) = " + result3);
		System.out.println("divide(5L,3L) = " + result4);
	}

}
class MyMath {
	void printGugudan(int dan) {
		if(!(2<=dan && dan <=9)) 
			return; //입력받은 단이 2~9가 아니면 메서드 종료하고 돌아가기.
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan , i , dan * i);
		}
	}
	long add(long a, long b) {
		long result = a+b;
		return result;
		// return a + b; 위 두 줄이 이와 같이 한줄로 간단히 할 수도 있다.
	}
	//두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
	long max(long a, long b) {
		long result =0;
		if (a>b) {
			result = a;
		}else {
			result =b;
		}
		return result;
	}
	
	long low(long a, long b) {
		long result5 = 0;
		if(a<b) {
			result5 = a;
	} else {
		result5 =b;
		
	}
	return result5;
}
	long subtract(long a, long b) { return a-b;}
	long multiply (long a , long b ) {return a * b; }
	double divide(double a, double b) { return a/b;}
}