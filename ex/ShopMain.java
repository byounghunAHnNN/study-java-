package extends1.ex;

public class ShopMain {

	public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("�ٹ�1", 15000,"seo");
        Movie movie = new Movie("��ȭ1", 18000,"����1", "���1");
        book.print();
        album.print();
        movie.print();
        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("��ǰ ������ ��: " + sum);
	}
}
