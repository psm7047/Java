package ch06.exam06;

public class Korean {

	//field
	String nation = "���ѹα�";
	String name;
	String ssn;
	int age;

	//Constructor Over loading
	Korean() {
		this("�ƹ���","00000-00000",1);	//'a' constructor�� �̵�
	}

	
	Korean(String name) {
		this(name,"00000-00000",1);		//'a' constructor�� �̵�
	}
	Korean(String name, String ssn) {
		
		this(name,ssn,1);				//'a' constructor�� �̵�
	}
	//a
	Korean(String name, String ssn, int age) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	
}
