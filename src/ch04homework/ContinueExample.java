package ch04homework;

import java.util.Scanner;

//ContinueExample
public class ContinueExample {

	//continue ����� for��
	public static void main(String[] args)  {

		for(int i =1; i<=10; i++) {
			if(i%2 != 0) {
				continue;	//Ȧ���� �ǳʶ�
			}
			System.out.println(i);
		}
		
	}

}
