package ch11.exam08_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
		Board b = new Board();
		b.setBno(1);
		b.setContent("내용1");
		b.setTitle("제목");
		b.setWriter("글쓴입");
		//date값을 주고 싶을 떄
		b.setWriteDate(new Date());
		
		service(b);

	}
	public static void service(Board b) {
		System.out.println(b.getBno());
		System.out.println(b.getTitle());
		System.out.println(b.getContent());
		System.out.println(b.getWriter());
		System.out.println(b.getWriteDate());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String strDate = sdf.format(b.getWriteDate());
		System.out.println(strDate);
	}
	

}
