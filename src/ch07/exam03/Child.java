package ch07.exam03;

public class Child extends Parent{

	//field
	//constructor
	public Child(String firstName) {
		super("��",firstName);	//�ڵ� 
		System.out.println("Child ��ü ����");
	}
	//method
	public void method2() {
		System.out.println("method2()����");
	}
	
	@Override
	public void sound() {
		System.out.println("�Ⱦ��~~~");
	}

}
