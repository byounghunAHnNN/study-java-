package oop1;

public class MusicPlayer {

	int volume;
	boolean isOn = false;
	

	void on() {
		isOn = true;
		System.out.println("���� �÷��̾ �����մϴ� ");
	}
	
	void off() {
		isOn = true;
		System.out.println("���� �÷��̾ �����մϴ� ");
	}
	
	void volumeUp() {
		volume++;
		System.out.println("���� �÷��̾� ���� + " + volume);
	}
	void volumeDown() {
		volume--;
		System.out.println("���� �÷��̾� ���� + " + volume);
	}
	
	 void showStatus() {
		System.out.println("���� �÷��̾� ���� Ȯ��");
		if (isOn) {
			System.out.println("'���� �÷��̾� ON, ����" + volume);
		} else {
			System.out.println("���� �÷��̾� OFF");
		}
	}

}
