package ch07.exam10;

public class Example {

	public static void main(String[] args) {
		
		
		Parent parent = new Child();	//�ڵ� ����ȯ(��������ȯ�� ���� �ʿ���)
		parent.field1 = 5;
		parent.method1();
		parent.method2();	//child method2(�������̵�)
		
		Child child = (Child) parent;		//���� ����ȯ
		
		child.field1=5;
		child.field2=5;
		child.method1();
		child.method2();
		child.method3();

	
	}

}
