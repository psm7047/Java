package ch06.exam13;

public class Singleton {
	
	//field
	private static Singleton singleton = new Singleton();	//�ܺο��� ���� �Ұ���
	//constructor
	private Singleton() {		//private : ����� Ŭ���� �ȿ����� ��� ����
		
	}
	//method
	
	static Singleton getInstance() { //singleton�� ������ �ִ� ������
		return singleton;		//�׻� �Ȱ��� ������ return
	}

}
