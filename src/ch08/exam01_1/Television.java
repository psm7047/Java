package ch08.exam01_1;

public class Television implements RemoteControl{
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	public void setVolume(int volume) {
		System.out.println("TV ������ " + volume + "�� �����մϴ�.");
	}

}
