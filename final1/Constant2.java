package final1;

public class Constant2 {

	public static void main(String[] args) {
		System.out.println("���α׷� �ִ� ������ �� : " + Constant.MAX_USERS);
		
		int currentUserCount = 999;
		process(currentUserCount++);
		process(currentUserCount++);
		process(currentUserCount++);
		process(currentUserCount++);
		
	}
		private static void process(int currentUserCount) {
			System.out.println("������ �� : " + currentUserCount);
			
			if ( currentUserCount> Constant.MAX_USERS) {
				System.out.println(" ����ڷ� ����մϴ�.");
			} else {
				
			}
		}

}
