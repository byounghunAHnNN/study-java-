package lang.immutable.test;

public class ImmutableMyDateMain {

	public static void main(String[] args) {
		ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
		ImmutableMyDate date2 = date1;
		
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);

		
		System.out.println("2025 -> date1" );
//		date1.withYear(2025);
//		date2 = new ImmutableMyDate(2025, 1, 1);
		
		date1 = date1.withYear(2025); // with로 시작되면 수정사항 의미.
		
		
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
	}

}
