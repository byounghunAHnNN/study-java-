package oop1;

public class MusicPlayeMain2 {

	public static void main(String[] args) {
		MusicPlayerData data = new MusicPlayerData();
		
		
		int volume =0;
		boolean isOn =false;
		
		//���� �÷��̾� �ѱ� 
		on(data);
		
		//���� ����
		volumeUp(data);
		
		//���� ����
		volumeUp(data);
		
		//���� ����
		volumeDown(data);
		
		//���� �÷��̾� ����
		showStatus(data);
		
		//���� �÷��̾� ����
		off(data);
	}
		static void on(MusicPlayerData data ) {
			data.isOn = true;
			System.out.println("���� �÷��̾ �����մϴ� ");
		}
		
		static void off(MusicPlayerData data ) {
			data.isOn = true;
			System.out.println("���� �÷��̾ �����մϴ� ");
		}
		
		static void volumeUp(MusicPlayerData data) {
			data.volume++;
			System.out.println("���� �÷��̾� ���� + " + data.volume);
		}
		static void volumeDown(MusicPlayerData data) {
			data.volume--;
			System.out.println("���� �÷��̾� ���� + " + data.volume);
		}
		
		static void showStatus(MusicPlayerData data) {
			System.out.println("���� �÷��̾� ���� Ȯ��");
			if (data.isOn) {
				System.out.println("'���� �÷��̾� ON, ����" + data.volume);
			} else {
				System.out.println("���� �÷��̾� OFF");
			}
		}

}
