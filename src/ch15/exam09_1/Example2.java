package ch15.exam09_1;

import java.util.LinkedList;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		
		//queue´Â LinkedList·Î
		Queue<String> q = new LinkedList<String>();
		
		q.offer("È«±æµ¿");
		q.offer("È«±æ³²");
		q.offer("È«±æ¼­");
		
		//poll -> FIFO
		while(!q.isEmpty()) {
			String item = q.poll();
			System.out.println(item);
		}

	}

}
