package ch15.exam04_1;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
		
		//�� ����
		Map<User, Board> map = new HashMap();
		
		//map�� ������� 1 User�� id�� ������ �Ȱ��� �ؽ��ڵ�� ����
		map.put(new User("winter","�ܿ�"), new Board(1,"�ܿ��"));
		map.put(new User("winter","������"), new Board(2,"����"));
		System.out.println(map.size());
		
		//2, ���� ��� -> �������� put�� User�� value
		Board board = map.get(new User("winter",null));
		System.out.println(board.getBno());
		System.out.println(board.getTitle());

	}

}
