package study1;

public class study1_2 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height); //cv자동생성
        
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7; //c1, c2는 iv이다. 객체가 만들떄마다 생김. 
        
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        Card.width = 50;
        Card.height = 80; //cv 이며 클래스 객체를 모두 공유된 그런, 
        
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");

	}
}
class Card {
	String kind;
	int number;
	static int width =100;
	static int height = 250;
}

