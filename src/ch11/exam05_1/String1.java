package ch11.exam05_1;

import java.util.Arrays;

public class String1 {

	public static void main(String[] args) throws Exception{
		byte[] arr1 = {65,66,67};
		String str1 = new String(arr1);	//String �޼ҵ� �� ����Ʈ �迭�� ���ڿ��� �ٲ�
		System.out.println(str1);
		
		String str2 = "ABC";
		byte[] arr2 = str2.getBytes();	//����Ʈ �迭�� �ٲ�
		System.out.println(Arrays.toString(arr2));	//�迭 ���� ���
		
		String str3 = "������";
		byte[] arr31 = str3.getBytes("EUC-KR");	//����Ʈ �迭�� �ٲ�
		byte[] arr32 = str3.getBytes("UTF-8");	
		System.out.println(Arrays.toString(arr31));
		System.out.println(Arrays.toString(arr32));
		
		String str4 = new String(arr31,"EUC-KR");	//���ڷ� �ٽ� ����
		String str5 = new String(arr32,"UTF-8");
		
		System.out.println(str4);
		System.out.println(str5);
		
		

	}

}
