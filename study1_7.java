package study1;


class Data3 {int x; }
public class study1_7 { //참조형 반환타입 
	public static void main(String[] args){
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x=" +d.x);
		System.out.println("d2.x="+d2.x);
		System.out.println("Hello world222");
	}
	static Data3 copy(Data3 d ) { //static메서드는 객체 생성없이 호출이 가능하다. 
								//ex> study1_7 a = new study1_7(); 처럼 객체를 생성 했어야 한다. 
		Data3 tmp = new Data3(); //새로운 객체 tmp를 생성한다. 
		
		tmp.x = d.x; //d.x의 값을 tmp.x에 복사한다.
		
		return tmp; //복사한 객체의 주소를 반환한다. 
	}
}
