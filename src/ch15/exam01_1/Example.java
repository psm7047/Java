package ch15.exam01_1;

import java.util.ArrayList;
import java.util.List;

import ch15.exam01.Board;

public class Example {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("ȫ�浿"); 	//String ��ü
		list.add(3);		//Integer ��ü
		list.add(new Board());	//Board ��ü
		
		String name = (String)list.get(0);	//Object -> String 
		int value = (Integer)list.get(1);	//Object -> Integer ���� Ÿ�� ��ȯ �� �����ڽ�
		Board board = (Board) list.get(2);	//Object -> Board
		
		list.remove(0);		//�����Ǹ� ������ ��ܿ´�
		list.remove(0);
		
		

	}

}
