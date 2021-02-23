package ch08.exam02;

public class Example{
	
	public static void method(RemoteControl rc) {		//implements RemoteControl을 하는 객체 (다형성)
		//인터페이스의 설명대로만 사용하는 코드
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

	public static void main(String[] args) {
		
		RemoteControl rc1 = new Television();	//인터페이스 리모트컨트롤을 가지고 텔레비전을 사용
		RemoteControl rc2 = new Audio();		//인터페이스 리모트컨트롤을 가지고 오디오를 사용
		
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(5);
		System.out.println();
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(100);
		System.out.println();
		
		method(new Television());
		System.out.println();
		method(new Audio());
		

	}

}
