package ch07.exam06_1.pack1;

public class Example {

	public static void main(String[] args) {
		//접근 제한자 protected
		Parent parent = new Parent();
		parent.field1 = 10;		//같은 패키지
		parent.parentMethod();

	}

}
