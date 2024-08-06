package langimmutable.address;

public class RefMain_2 {

	public static void main(String[] args) {		
		ImmutableAddress a = new ImmutableAddress("서울");
		ImmutableAddress b = a;
		
		 System.out.println("a = " + a);
		 System.out.println("b = " + b);
		 
		 b = new ImmutableAddress("부산");	 // ImmutableAddress 새로운 객체를 만듬 
		 
		 System.out.println("부산 -> b");
		 System.out.println("a = " + a); 
		 System.out.println("b = " + b);
		
	}
	
	
}
