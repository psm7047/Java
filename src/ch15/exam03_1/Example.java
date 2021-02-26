package ch15.exam03_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();	//중복허용x, 인덱스 없음

		set.add("홍길동");
		set.add("감자바");
		set.add("홍길동");
		set.add("겨울이");
		System.out.println(set.size());		//3
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
