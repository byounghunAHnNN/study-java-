package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		PayService payService = new PayService();
		
		while (true) {
			System.out.println("���� ������ �Է��ϼ���.");
			String payOption = scanner.nextLine();
			
			if (payOption.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
			System.out.println("���� �ݾ��� �Է��ϼ���:");
			int amount = scanner.nextInt();
			scanner.nextLine();
			
			payService.processPay(payOption, amount);
		}

	}

}
