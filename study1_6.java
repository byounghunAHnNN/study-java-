package study1;

class Data2 { int x;

}

public class study1_6 { //참조형 매개변수. 
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x +=" +d.x);
	}
		static void change(Data2 d) { //참조형 매개변수 d의 값을 change값을 대입한것. 
			d.x=1000;					//change 참조변수d도 x를 가르킨것. 1000이다 그래서. 
			System.out.println("change() : x = " +d.x);
		}

}
