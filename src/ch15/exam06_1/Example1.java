package ch15.exam06_1;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		
		//treeset에 검색기능과 관련된 메소드 존재
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("홍길동");
		set.add("감자바");
		set.add("방돌이");
		set.add("박길순");
		
		//자동으로 오름차순 출력
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		
		//treeSet이 가지고 있는 정렬 메소드(Navigable타입)
		NavigableSet<String> nset = set.descendingSet();
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		
		NavigableSet<String> sset = set.subSet("가", false, "방돌이", true);
		for(String item : sset) {
			System.out.println(item);
		}
	}
}
