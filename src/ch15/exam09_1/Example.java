package ch15.exam09_1;

import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("홍길서");
		stack.push("홍길남");
		
		//그냥 출력이므로 push한 순서대로 나옴
		for(String name : stack) {
			System.out.println(name);
		}
		System.out.println();
		
		//pop -> LIFO
		while(!stack.isEmpty()) {
			String item = stack.pop();
			System.out.println(item);
		}

	}

}
