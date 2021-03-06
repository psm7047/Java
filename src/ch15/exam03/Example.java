package ch15.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("홍길동");
		set.add("감자바");
		set.add("홍길동");
		set.add("겨울이");
		System.out.println(set.size());
		//방법1 
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		//방법2
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
	}

}
