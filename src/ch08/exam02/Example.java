package ch08.exam02;

public class Example{
	
	public static void method(RemoteControl rc) {		//implements RemoteControl�� �ϴ� ��ü (������)
		//�������̽��� �����θ� ����ϴ� �ڵ�
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

	public static void main(String[] args) {
		
		RemoteControl rc1 = new Television();	//�������̽� ����Ʈ��Ʈ���� ������ �ڷ������� ���
		RemoteControl rc2 = new Audio();		//�������̽� ����Ʈ��Ʈ���� ������ ������� ���
		
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
