package ch04homework;

//SwitchNoBreakExample
public class Example07 {

	public static void main(String[] args) {

		int time = (int)(Math.random() * 4) + 8;	//8~11

		switch(time) {
		case 8 :
			System.out.println("출근합니다.");
			break;
		case 9 :
			System.out.println("회의를 합니다.");
			break;
		case 10 :
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}

	}

}
