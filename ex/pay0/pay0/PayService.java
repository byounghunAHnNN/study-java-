package poly.ex.pay0;

public class PayService {

	public void processPay(String option, int amount) {
		boolean result;
		
		System.out.println("������ �����մϴ�: option=" + option + ", amount=" + 
				amount);
		
		if (option.equals("kakao")) {
			KakaoPay kakaoPay = new KakaoPay();
			result = kakaoPay.pay(amount);
			
		} else if (option.equals("naver")) {
			NaverPay naverPay = new NaverPay();
			result = naverPay.pay(amount);
		} else {
			System.out.println("���� ������ �����ϴ�.");
			result = false;
		}
		
		if (result) {
			System.out.println("������ �����߽��ϴ�.");
		} else {
			System.out.println("������ �����߽��ϴ�.");
		}
	}
}
