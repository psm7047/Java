package ch07.exam02_1;

public class Child extends Parent{

	//field
	//constructor	
	public Child(String firstName) {
		super("��",firstName);		//�θ�ü�� �����ڰ� �Ű������� ������ ���� ��� super���
		System.out.println("Child ��ü ����");
	}
	//method
	public void method2() {
		System.out.println("method2()����");
	}
	
	
	
}
