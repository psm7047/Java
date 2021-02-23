package ch07.exam09;

public class Example {

	public static void main(String[] args) {
		//매개변수 다형성(bus,taxi 모두 vehicle의 자식 클래스)
		Driver driver = new Driver();
		driver.drive(new Vehicle());
		driver.drive(new Bus());
		driver.drive(new Taxi());

	}

}
