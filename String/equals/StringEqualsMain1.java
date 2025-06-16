package lang.String.equals;

public class StringEqualsMain1 {

	public static void main(String[] args) {
		
		String str1 = new String("hello"); // x001
		String str2 = new String("hello");	// x002 참조값이 다르다. 
		
		System.out.println("new String " + (str1 == str2));
		System.out.println(" equals ==>" + (str1.equals(str2)));
		
		
		String str3 = "hello";
		String str4 = "hello";
		
		System.out.println("리터럴 = " + (str3 == str4));
		System.out.println("리터럴 = " + (str3.equals(str4)));

		
	}
}
