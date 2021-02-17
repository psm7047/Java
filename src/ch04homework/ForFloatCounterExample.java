package ch04homework;

//ForFloatCounterExample
public class ForFloatCounterExample {

	public static void main(String[] args) {
		
		//루프에 부동소수점 사용 x
		//9번만 루프 => 0.1f는 0.1보다 약간 더 크기 떄문
		for(float x = 0.1f; x <= 1.0f ; x+=0.1f) {
			System.out.println(x);
		}

	}

}
