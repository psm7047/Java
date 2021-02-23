package ch08.exam04;

public class Car {
	//field
	public Tire t1;		//Tire는 인터페이스이기 떄문에 객체로 만들면 X Tire 인터페이스를 사용할 수 있는 객체들이 들어올 수 있음(implements Tire)
	public Tire t2;
	public Tire t3;
	public Tire t4;
	//constructor
	
	//method
	public void run() {
		t1.roll();
		t2.roll();
		t3.roll();
		t4.roll();
	}
	

}
