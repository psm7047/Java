package ch10.exam07_1;

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
			
			if(message.contains("0001")) {
				//....
			}else {
				//....
			}
		}


	}
	public static void method() throws NoAccountException{
		throw new NoAccountException("0001 �Ա� ���°� ����");

	}

}