package ch07.exam08;

public class Example {

	public static void main(String[] args) {
		//�ڵ� Ÿ�� ��ȯ
		Car car = new Car();
		car.run();		//t1~t4 TireŸ��
		System.out.println();
		
		car.t1 = new TireChild1();		//Ÿ�Ժ�ȯ (Tire�� �ڽ� TireChild1) �ڵ� Ÿ�� ��ȯ
		car.t2 = new TireChild2();		//Ÿ�Ժ�ȯ (Tire�� �ڽ� TireChild2) �ڵ� Ÿ�� ��ȯ
		
		car.run();
		

	}

}
