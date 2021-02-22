package ch06.exam13;

public class Singleton {
	
	//field
	private static Singleton singleton = new Singleton();
	//constructor
	private Singleton() {		//private : 선언된 클래스 안에서만 사용 가능
		
	}
	//method
	
	static Singleton getInstance() { //singleton이 가지고 있는 번지수
		return singleton;		//항상 똑같은 번지수 return
	}

}
