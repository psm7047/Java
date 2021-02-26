package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		//객체 저장
		list.add("홍길동");
		list.add(3);
		list.add(new Board());
		System.out.println(list.size());
		//객체 얻기
		String name = (String)list.get(0);
		int value = (Integer)list.get(1);	//강제 타입 변환 후 오토언박싱
		Board board = (Board) list.get(2);
		
		//객체 제거
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());
		
		
		
	}

}
