package ch07.exam_01;

public class Example {

	public static void main(String[] args) {
		
		//�ڽ� ��ü�� �θ� ��ü ��� ��� ����
		Child ch = new Child();
		//�θ� ��ü�� �ڽ� ��ü ��� X
		Parent pa = new Parent();
		
		ch.field1 = 10;
		ch.field2 = 10;
		ch.method();
		ch.method2();
	
	}

}
