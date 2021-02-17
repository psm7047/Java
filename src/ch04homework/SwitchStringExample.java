package ch04homework;

//SwitchStringExample
public class SwitchStringExample {

	public static void main(String[] args) {

		String position = "과장";
		
		//switch로 대소문자 구분 없이 분기
		switch(position) {
				
		case "부장" :	
			System.out.println("700만원");
			break;
		
		case "과장" :	
			System.out.println("500만원");
			break;
		
		default:
			System.out.println("300만원");
			break;
		}

	}

}
