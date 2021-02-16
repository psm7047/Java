package ch02;

public class Exam02_1 {
	
	public static void main(String[] args) {
		//자동 타입 변환
		byte var1 = 10;
		int var2 = var1;		//int > byte
		
		//강제 타입 변환
		int var3 = 10;
		byte var4 = (byte)var3;		//int -> byte
		
		//-----------------------------------
		
		//자동 타입 변환 (정수는 실수보다 항상 적은 범위)
		long var5 = 10;			
		double var6 = var5;		//double(실수) > long(정수)
		
		//강제 타입 변환 (실수는 정수보다 항상 큰 범위) 
		float var8 = 10.5f;
		long var9 = (long)var8;	//10 
		int var10 = (int)var8;	//10
		//-----------------------------------
		
		//실수를 정수로 변환
		double var11 = 3.141592;
		int var12 = (int)var11;		//3
	}

}
