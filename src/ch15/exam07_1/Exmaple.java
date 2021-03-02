package ch15.exam07_1;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Exmaple {

	public static void main(String[] args) {
		
		TreeSet<Person> set = new TreeSet<>();
		
		set.add(new Person("홍길동",27));
		set.add(new Person("감자바",30));
		set.add(new Person("박자바",28));
		
		//Person에서 재정의한 compareTo 메소드로 인해 나이 기준으로 오름차순 정렬
		for(Person p : set) {
			System.out.println(p.name + ", " + p.age);
		}
		System.out.println();
		
		TreeMap<Person, Integer> map = new TreeMap<>();
		map.put(new Person("홍길동",27), 95);
		map.put(new Person("감바자",30), 80);
		map.put(new Person("박자바",28), 90);
		
		//Person에서 재정의한 compareTo 메소드로 인해 Person의 나이 기준으로 오름차순 정렬
		Set<Person> keys = map.keySet();
		for(Person p : keys) {
			System.out.println(p.name + ", " + p.age + " : " + map.get(p));
		}
	}

}
