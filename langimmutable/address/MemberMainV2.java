package langimmutable.address;

public class MemberMainV2 {

	public static void main(String[] args) {
		ImmutableAddress address = new ImmutableAddress("서울");
		
		MemberV2 memberA = new MemberV2("회원", address);
		MemberV2 memberB = new MemberV2("회원", address);

		
		System.out.println("memberA = " + memberA);
		System.out.println("memberB = " + memberB);
		
	//	memberB.getAddress().setValue("부산");
		
		// 회원 B의 주소를 부산으로 변경
		
		memberB.setAddress(new ImmutableAddress("부산"));
		
		System.out.println("부산 -> memberB.addess");
		System.out.println("memberA = " + memberA);
		System.out.println("memberB = " + memberB);
		
		
	}

}
