package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		
		//User user = null; -> nullPointerException
		
		//�ν��Ͻ� ���(�ʵ�, �޼ҵ�)�� �ݵ��
		//��ü ���� ������ ���ؼ� ����
		User user = new User("ȫ�浿");
		
		System.out.println(user.name);
		user.login();
		user.logout();
		
		//���� ���(�ʵ�, �޼ҵ�)�� ��ü�� ���̵� ��� ����
		System.out.println(User.nation);//Ŭ������ ������ ����
		User.info();

	}

}
