package ch11.exam05_1;

import java.util.StringTokenizer;

public class String2 {

	public static void main(String[] args) {
		
		//� ��ġ�� ���� 1���� ���
		String ssn = "123456-1234567";
		char sex = ssn.charAt(7);
		if(sex == '1' && sex =='3') {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
		//���ڿ� �߶󳻱� : ���1
		String first = ssn.substring(0,6);	//0~5��°
		String second = ssn.substring(7);	//7�������� �� ��
		System.out.println(first);
		System.out.println(second);
		
		//���ڿ� �߶󳻱� : ���2
		String[] parts = ssn.split("-");
		System.out.println(parts[0]); 	//"-" ��
		System.out.println(parts[1]);  	//"-" ��
		
		//���ڿ� �и��ϱ� : ���3
		StringTokenizer st = new StringTokenizer(ssn,"-");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		//���� ���� : ���1
		String content = "�̰��� �ڹ� å�Դϴ�.";
		boolean result = content.contains("�ڹ�");
		System.out.println(result);
		
		//���� ���� : ���2
		int index = content.indexOf("�ڹ�");
		if(index != -1) {
			System.out.println("�ڹ� ���� å�̱���");
		}else {
			System.out.println("�ڹ� ���� å�� �ƴϱ���.");
		}
		
		//����
		int length = content.length();
		System.out.println(length);
		
		//��ġ�ϱ�
		String content2 = content.replace("�ڹ�", "java");	//���ο� String�� ����
		System.out.println(content2);
		
		
		

	}

}
