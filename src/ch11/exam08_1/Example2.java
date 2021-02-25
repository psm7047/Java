package ch11.exam08_1;

import java.util.Calendar;

public class Example2 {

	public static void main(String[] args) {
		
		//시간은 여러개가 아니다. Calendar : 자세한 시간, 날짜 정보를 얻고 싶을 떄 
		Calendar now = Calendar.getInstance();	//싱글톤 방식 => 외부에서 객체생성X
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DAY_OF_MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.DAY_OF_MONTH);
		int minute= now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		

	}

}
