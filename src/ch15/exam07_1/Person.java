package ch15.exam07_1;
//비교를 위해 comparable 사용
public class Person implements Comparable {
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Person temp = (Person) o;
		if(age < temp.age) {
			return -1;
		}
		else if(age == temp.age) {
			return 0;
		}
		else {
			return 1;
		}
	}
}
