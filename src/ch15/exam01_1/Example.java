package ch15.exam01_1;

import java.util.ArrayList;
import java.util.List;

import ch15.exam01.Board;

public class Example {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("홍길동"); 	//String 객체
		list.add(3);		//Integer 객체
		list.add(new Board());	//Board 객체
		
		String name = (String)list.get(0);	//Object -> String 
		int value = (Integer)list.get(1);	//Object -> Integer 강제 타입 변환 후 오토언박싱
		Board board = (Board) list.get(2);	//Object -> Board
		
		list.remove(0);		//삭제되면 앞으로 당겨온다
		list.remove(0);
		
		

	}

}
