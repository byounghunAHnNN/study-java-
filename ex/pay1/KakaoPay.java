package poly.ex.pay1;

public class KakaoPay implements Pay{

	@Override
	public boolean pay(int amount) {
		System.out.println("īī������ �ý��۰� �����մϴ�.");
		System.out.println(amount + "�� ������ �õ��մϴ�.");
		return true;
	}

}