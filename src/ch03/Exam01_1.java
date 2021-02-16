package ch03;

public class Exam01_1 {

	public static void main(String[] args) {
		//산술 (덧셈, 뺼셈, 나눗셈)연산의 다양한 형태
		
		int var1 = 1;		//1
		var1 = var1 + 1;	//2
		var1 +=1;			//3
		var1++;				//4
		++var1;				//5
		
		int var2 = 10;
		var2 = var2 - 1;	//9
		var2 -= 1;			//8
		var2--;				//7
		--var2;				//6
		
		int var3 = 15;
		var3 = var3 / 2;	//7
		var3 /= 2;			//3

		// 자바는 정수 / (나눗셈)의 결과는 정수입니다.
		int var4 = 11;
		int var5 = 4;
		int var6 = var4 / var5;	//2
		
		// 실수의 나눗셈 결과
		double var7 = 1.0 * var4 / var5;	//2.75
		double var8 = (double)(var4/var5);	//2.75
		
		//나머지 구하기
		int var9 = var4 % var5;		//3

	}

}
