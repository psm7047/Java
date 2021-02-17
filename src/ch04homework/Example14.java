package ch04homework;

public class Example14 {

	public static void main(String[] args) {
		
		//ForMultiplicationTableExample
		//구구단
		for(int m =2; m<=9; m++) {
			System.out.println("***" + m + "단***");
			for(int j=1;j<=9;j++) {
				System.out.println(m + "x" + j + "=" + m*j);
			}
		}

	}

}
