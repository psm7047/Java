package ch08.exam01;

public class Example{

	public static void main(String[] args) {
		
		RemoteControl rc1 = new Television();	//�������̽� ����Ʈ��Ʈ���� ������ �ڷ������� ���
		RemoteControl rc2 = new Audio();		//�������̽� ����Ʈ��Ʈ���� ������ ������� ���
		
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(5);
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(5);
		
		

	}

}
