package construct.ex;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.displayInfo();
		
		//title, author���� �Ű������� �޴� ������
		Book book2 = new Book("Hello java", "Seo");
		book2.displayInfo();
		
		//title, author���� �Ű������� �޴� ������
		Book book3 = new Book("JPA ���α׷���", "Kim", 700);
		book3.displayInfo();
		
		
		

	}

}
