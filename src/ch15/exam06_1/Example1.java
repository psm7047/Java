package ch15.exam06_1;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		
		//treeset�� �˻���ɰ� ���õ� �޼ҵ� ����
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("ȫ�浿");
		set.add("���ڹ�");
		set.add("�浹��");
		set.add("�ڱ��");
		
		//�ڵ����� �������� ���
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		
		//treeSet�� ������ �ִ� ���� �޼ҵ�(NavigableŸ��)
		NavigableSet<String> nset = set.descendingSet();
		for(String item : set) {
			System.out.println(item);
		}
		System.out.println();
		
		NavigableSet<String> sset = set.subSet("��", false, "�浹��", true);
		for(String item : sset) {
			System.out.println(item);
		}
	}
}
