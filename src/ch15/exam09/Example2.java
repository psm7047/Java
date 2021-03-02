package ch15.exam09;

import java.util.LinkedList;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		
		q.offer("ȫ�浿");
		q.offer("ȫ�泲");
		q.offer("ȫ�漭");
		
		//poll -> FIFO
		while(!q.isEmpty()) {
			String item = q.poll();
			System.out.println(item);
		}

	}

}
