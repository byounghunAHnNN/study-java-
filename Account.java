package oop1.ex;

public class Account {
	
	int balance; // ภÜพื
	
	void deposit(int amount) {
		balance +=amount;
	}
	
	
	void withdraw(int amount) {
		if (balance >=amount) {
			balance -= amount;
		} else {
			System.out.println("ภÜพื บฮมท");
		}
	}
	
//	boolean result() {
//	
//		return balance;
//	}
}
