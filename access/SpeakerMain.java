package access;

public class SpeakerMain {
	
	public static void main(String[] args) {
		Speaker speaker = new Speaker(90);
		speaker.ShowVolume();
		
		speaker.volumeUp();
		speaker.ShowVolume();
		
		speaker.volumeUp();
		speaker.ShowVolume();
	
//		// �ʵ忡 ���� ���� private���� �ش� Ŭ���� ���ο����� ���� �����ϵ��� ����.
//		System.out.println("Volume �ʵ� ���� ���� ����");
//		speaker.volume = 200;
//		speaker.ShowVolume();
	}
}
