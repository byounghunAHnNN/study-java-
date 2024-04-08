package access;

public class BankAccount {

	private int balance;

	public BankAccount() {
		balance = 0;

	}

	// public �޼��� : deposiit
	public void deposit (int amount ) {
		if (isAmountValid(amount)) {
			balance += amount;
		} else {
			System.out.println("��ȿ���� ���� �ݾ��Դϴ�.");
		}		
	}
	
	public void withdraw(int amount) {
		if (isAmountValid(amount) && balance - amount >=0) {
			balance -=amount;
		} else {
			System.out.println("�������� ���� �ݾ��̰ų� �ܾ��� �����մϴ�.");
		}
	}
	
	public int getBalance() {
		return balance;
	}

	private boolean isAmountValid(int amount) {
		// �ݾ��� 0���� Ŀ���Ѵ�.
		return amount>0;
	}
}
