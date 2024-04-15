package extends1.super2;

public class ClassC extends ClassB{
	
	public ClassC() {
		super(10, 20); // 기본생성자인 경우만 생략가능, 지금처럼 정의가 되어있으면 직접 해야하나.
		System.out.println("Class C 생성자 ");
	}

}
