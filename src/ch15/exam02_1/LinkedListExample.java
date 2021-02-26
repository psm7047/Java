package ch15.exam02_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
	
		List<String> list1 = new ArrayList<>();		//뒤<> 없으면 앞에 <>와 같은 타입
		List<String> list2 = new LinkedList<>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (end - start) + " ns");
		
		//LinkedList ArrayList보다 훨씬 빠름
		start = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (end - start) + " ns");
	}
}
