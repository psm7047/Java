package ch15.exam02_1;

import java.util.LinkedList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<Board> list = new LinkedList<>();	//뒤 <>가 비어있으면 같은 타입으로 사용하겠다는 의미
		
		//객체 저장
		list.add(new Board(1,"제목1"));
		list.add(new Board(2,"제목2"));
		list.add(new Board(3,"제목3"));
		System.out.println(list.size());
		
		//객체 얻기
		Board board1 = list.get(0);
		System.out.println(board1.getBno() + " : " + board1.getTitle());
		Board board2 = list.get(1);	
		System.out.println(board2.getBno() + " : " + board1.getTitle());
		Board board3 = list.get(2);
		System.out.println(board3.getBno() + " : " + board1.getTitle());
		
		//반복 처리
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getBno() + " : " + board.getTitle());
		}
		for(Board board : list) {	//list 자리에 iterable 인터페이스 사용 가능한 객체 모두
			System.out.println(board.getBno() + " : " + board.getTitle());
		}
		
		//객체 제거
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());
		
	}
}
