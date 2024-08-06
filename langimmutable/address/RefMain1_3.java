package langimmutable.address;

public class RefMain1_3 {

	public static void main(String[] args) {		
		Address a = new Address("서울");
		Address b = new Address("서울");
		
		 System.out.println("a = " + a);
		 System.out.println("b = " + b);
		 
		 change(b, "부산"); // 사이드이펙트 발생 
		 
		 System.out.println("a = " + a); 
		 System.out.println("b = " + b);

	}
	 
	private static void change(Address address, String changeAddress) {
		 System.out.println("주소 값을 변경합니다 -> " + changeAddress);
		        address.setValue(changeAddress);
		    }
	
	
}
