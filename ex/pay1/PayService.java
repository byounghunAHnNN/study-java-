package poly.ex.pay1;

public class PayService {

	public void processPay(String option, int amount) {
		System.out.println("(\"������ �����մϴ�: option=\" + option + \", amount=\" + \r\n"
				+ "amount");
		
		Pay pay = PayStore.findPay(option);
		boolean result = pay.pay(amount);
		
		if (result) {
			System.out.println("������ �����߽��ϴ�.");
		} else {
			System.out.println("������ �����Ͽ�����");
		}
	}
}
