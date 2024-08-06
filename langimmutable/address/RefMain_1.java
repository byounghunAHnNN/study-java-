package langimmutable.address;

public class RefMain_1 {

	public static void main(String[] args) {		
		Address a = new Address("서울");
		Address b =a;
		
		 System.out.println("a = " + a);
		 System.out.println("b = " + b);
		 
		 b.setValue("부산"); //b의 값을 부산으로 변경해야함
		 
		 System.out.println("부산 -> b");
		 System.out.println("a = " + a); //사이드 이펙트 발생
		 System.out.println("b = " + b);
		
	}
}
