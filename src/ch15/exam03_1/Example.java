package ch15.exam03_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();	//�ߺ����x, �ε��� ����

		set.add("ȫ�浿");
		set.add("���ڹ�");
		set.add("ȫ�浿");
		set.add("�ܿ���");
		System.out.println(set.size());		//3
		//���1 
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		//���2
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
	}

}
