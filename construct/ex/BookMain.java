package construct.ex;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.displayInfo();
		
		//title, author만을 매개변수로 받는 생성자
		Book book2 = new Book("Hello java", "Seo");
		book2.displayInfo();
		
		//title, author만을 매개변수로 받는 생성자
		Book book3 = new Book("JPA 프로그래밍", "Kim", 700);
		book3.displayInfo();
		
		
		

	}

}
