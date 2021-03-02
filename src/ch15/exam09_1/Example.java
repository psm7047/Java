package ch15.exam09_1;

import java.util.Stack;

public class Example {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		stack.push("ȫ�浿");
		stack.push("ȫ�漭");
		stack.push("ȫ�泲");
		
		//�׳� ����̹Ƿ� push�� ������� ����
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
