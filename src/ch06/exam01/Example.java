package ch06.exam01;

public class Example {

	public static void main(String[] args) {
		
		Student s1 = new Student();		
		Student s2 = new Student();				//s1�� �ٸ� new ��ü
		Student s3 = s1;
		
		if(s1 == s3) {
			System.out.println("���� ��ü");		//s1 s3�� ���� ��ü
		}else {
			System.out.println("�ٸ� ��ü");		//s1 s2�� �ٸ� ��ü
		}
	}
}
