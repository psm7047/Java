package ch11.exam06_1;

import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		//��ȭ��ȣ üũ		���Խ� ǥ��
		String regExp = "010-\\d{3,4}-\\d{4}";
		String data = "010-23-1234";
		boolean result = Pattern.matches(regExp, data);	//pattern �޼ҵ�
		if(result) {
			System.out.println("��ȿ�� ������");
		}else {
			System.out.println("�߸��� ������");
		}
		
		//Ư������, ����, ���ڰ� �� 8~15����
		String regExp2 = ".*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*";
		String passwd = "a#123456";
		boolean result2 = Pattern.matches(regExp2, passwd);
		System.out.println(result2);
		
	}

}
