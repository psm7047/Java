package ch18.exam15_1;

import java.io.File;

public class Example2 {

	public static void main(String[] args) throws Exception{

		File file = new File("C:/Temp/dir1");
		if(file.isDirectory()) {
			System.out.println("폴더입니다.");
		}else {
			System.out.println("파일입니다.");
		}

		file = new File("C:/Temp/data.txt");
		if(file.isFile()) {
			long size = file.length();		//몇바이트인지 : 파일의 크기
			System.out.println(size + "bytes");
		}
	}

}
