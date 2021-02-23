package ch08.exam03_1;

public class Example {
	
	public static void use1(Shipable shipable) {
		shipable.sailing();
		shipable.anchor();
	}
	
	public static void use2(Flyable flyable) {
		flyable.takeOff();
		flyable.fly();
		flyable.land();
	}

	public static void main(String[] args) {
		Car myCar = new Car();		//shipable, flyable 인터페이스를 사용하는 car
		use1(myCar);
		System.out.println();
		use2(myCar);

	}

}
