package ch08.exam01;

public class Example{

	public static void main(String[] args) {
		
		RemoteControl rc1 = new Television();	//인터페이스 리모트컨트롤을 가지고 텔레비전을 사용
		RemoteControl rc2 = new Audio();		//인터페이스 리모트컨트롤을 가지고 오디오를 사용
		
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(5);
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(5);
		
		

	}

}
