package ch06.exam06;

public class Korean {

	//field
	String nation = "대한민국";
	String name;
	String ssn;
	int age;

	//Constructor Over loading
	Korean() {
		this("아무개","00000-00000",1);	//'a' constructor로 이동
	}

	
	Korean(String name) {
		this(name,"00000-00000",1);		//'a' constructor로 이동
	}
	Korean(String name, String ssn) {
		
		this(name,ssn,1);				//'a' constructor로 이동
	}
	//a
	Korean(String name, String ssn, int age) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}
	
}
