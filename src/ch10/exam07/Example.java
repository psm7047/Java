package ch10.exam07;

public class Example {

	public static void main(String[] args) {
		try {
		method();
		}catch(Exception e){
			//���� �޽������� ���� ó���� �� �� ���
			String message = e.getMessage();
			System.out.println(message);
			//������� �� ����� �� �ִ� ���� ����
			System.out.println(e.toString());
			e.printStackTrace();
			
			//���� �߻� �ڵ忡 ���� ó��
			if(message.contains("0001")) {
				//....
			}else {
				//....
			}
		}


	}
	//ȣ��� ������ ����ó��
	public static void method() throws NoAccountException{
		//���� �߻� �ڵ�
		throw new NoAccountException("0001 �Ա� ���°� ����");

	}

}