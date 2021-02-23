package ch07.exam06_1.pack2;

import ch07.exam06.pack1.Parent;

public class Child extends Parent{

	//field
	//constructor
	//method
	public void method() {
		field1 = 10;
		parentMethod();		//Protected이기 떄문에 다른 패키지이지만 자식 클래스인 Child에서 사용 가능
	}


}
