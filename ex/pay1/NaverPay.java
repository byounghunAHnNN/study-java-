package poly.ex.pay1;

public class NaverPay implements Pay{

	@Override
	public boolean pay(int amount) {
		System.out.println("���̹����� �ý��۰� �����մϴ�.");
		System.out.println(amount + "�� ������ �õ��մϴ�.");
		return true;
	}


}
