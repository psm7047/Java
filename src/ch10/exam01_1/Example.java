package ch10.exam01_1;

import java.io.FileInputStream;

public class Example {

	public static void main(String[] args) {

		int[] arr = null;
		//nullPointerException	=> ���� ����( �����Ϸ��� üũ���� ����, �������� ���迡 ���ؼ� ����ó��)
		
		arr[0] = 10;	// => arr �迭 ����x

		int[] arr1 = new int[3];
		arr1[0] = 10;
		
		System.out.println(arr1[0]);
		
		//FileNotFoundException  => �Ϲ� ���� (�����Ϸ��� ����ó���� �ߴ��� ���ߴ��� üũ, ������ ����)
		//FileInputStream fs = new FileInputStream("C:/Temp/file.txt");

	}

}
