package ch06.exam11;

public class User {

	//field
	String id;
	String name;
	String password;
	static String nation = "�ѱ�";	//static: ��ü�� ������ �ʾƵ� ��� ����
	
	//constructor �ν��Ͻ� ���x
	User(String name) {
		this.name = name;
	}
	//method
	
	static void info() {	//static: ��ü�� ��� ����� �� �ִ� �޼ҵ�
		
		System.out.println("��� User�� �ѱ����Դϴ�.");
	}
	void login() {	//��ü�� �־�� ����� �� �ִ� �޼ҵ�
		System.out.println(name + "���� �α����մϴ�.");
	}
	
	void logout() {
		System.out.println(name + "���� �α׾ƿ��մϴ�.");
	}
	
}
