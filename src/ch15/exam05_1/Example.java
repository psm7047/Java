package ch15.exam05_1;

import java.io.FileReader;
import java.util.Properties;

public class Example {

	public static void main(String[] args) throws Exception{
		
		Properties prop = new Properties();
		String path = Example.class.getResource("database.properties").getPath();
		prop.load(new FileReader(path));
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
		
		//한글로 대한민국 출력하기 위해 properties 파일에 따로 입력
		String nation = prop.getProperty("nation");
		System.out.println(nation);
	}

}
