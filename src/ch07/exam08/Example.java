package ch07.exam08;

public class Example {

	public static void main(String[] args) {
		//자동 타입 변환
		Car car = new Car();
		car.run();		//t1~t4 Tire타입
		System.out.println();
		
		car.t1 = new TireChild1();		//타입변환 (Tire의 자식 TireChild1) 자동 타입 변환
		car.t2 = new TireChild2();		//타입변환 (Tire의 자식 TireChild2) 자동 타입 변환
		
		car.run();
		

	}

}
