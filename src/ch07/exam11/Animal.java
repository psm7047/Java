package ch07.exam11;

public abstract class Animal {
	//�߻� Ŭ���� : �ڽ� Ŭ������ ������ �������� �ʵ�� �޼ҵ带 ���� ����
	public String name;
	public String kind;
	
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}
	public void eat() {
		System.out.println("�Խ��ϴ�.");
	}
	//�߻�޼ҵ�
	public abstract void sound(); 
}
