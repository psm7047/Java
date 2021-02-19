package ch06.exam01;

public class Example {

	public static void main(String[] args) {
		
		Student s1 = new Student();		
		Student s2 = new Student();				//s1°ú ´Ù¸¥ new °´Ã¼
		Student s3 = s1;
		
		if(s1 == s3) {
			System.out.println("°°Àº °´Ã¼");		//s1 s3´Â °°Àº °´Ã¼
		}else {
			System.out.println("´Ù¸¥ °´Ã¼");		//s1 s2´Â ´Ù¸¥ °´Ã¼
		}
	}
}
