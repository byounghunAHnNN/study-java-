package final1;

public class Constant1 {

	public static void main(String[] args) {
		System.out.println("���α׷� �ִ� ������ �� : " + 1000);
		
		int currentUserCount = 999;
		process(currentUserCount++);
		process(currentUserCount++);
		process(currentUserCount++);
		process(currentUserCount++);
		
	}
		private static void process(int currentUserCount) {
			System.out.println("������ �� : " + currentUserCount);
			
			if ( currentUserCount>1000) {
				System.out.println(" ����ڷ� ����մϴ�.");
			} else {
				
			}
		}

}
