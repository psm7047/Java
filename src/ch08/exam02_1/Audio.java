package ch08.exam02_1;

public class Audio implements RemoteControl{

	//field
	private int volume;
	
	//method
	@Override
	public void turnOn() {
		System.out.println("Audio �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		System.out.println("Audio ������ " + this.volume + "�� �����մϴ�.");
		
	}
	
	

}
