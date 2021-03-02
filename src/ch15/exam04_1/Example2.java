package ch15.exam04_1;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		
		//맵 생성
		Map<User, Board> map = new HashMap();
		
		//map의 사이즈는 1 User의 id가 같으면 똑같은 해시코드로 구분
		map.put(new User("winter","겨울"), new Board(1,"겨울비"));
		map.put(new User("winter","봄동이"), new Board(2,"입춘"));
		System.out.println(map.size());
		
		//2, 입춘 출력 -> 마지막에 put한 User의 value
		Board board = map.get(new User("winter",null));
		System.out.println(board.getBno());
		System.out.println(board.getTitle());

	}

}
