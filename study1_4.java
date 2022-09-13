package study1;


class Data { int x;}

public class study1_4 {
	public static void maun(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x  = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
	}
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x );
	}
}
