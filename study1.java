package study1;
// 하나의 소스파일에는 하나의 클래스만 작성하는것이 좋다.
 class study1 { // 소스파일의 이름은 public class 이름과 일치 해야한다.

	public static void main(String[] args) {
		 Tv t; //Tv인스턴스를 참조하기 위한 변수t선언
		 t= new Tv(); //Tv인스턴스 생성
		 t.channel = 7; //Tv인스턴스 멤버변수 channel 값을 7로 호출
		 t.channelUp(); //Tv인스턴스 메서드 channelDown()을 호출
		System.out.println("현재 채널은" + t.channel + "입니다.");
	}

}
 class Tv {
	 //Tv속성 (멤버변수)
	 String color; //색상 
	 boolean power; //전원상태 on/off
	 int channel;  // 채널
	 
	 void power() { power =! power;}
	 void channelUp( ) { ++channel;}
	 void channelDown() { --channel;}
 }