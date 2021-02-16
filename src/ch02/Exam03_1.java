package ch02;

public class Exam03_1 {

	public static void main(String[] args) {
		
		//int 타입 이하의 피연산자의 연산은 결과가 int
		
		byte var1 = 10;
		byte var2 = 10;
		
		byte var3 = (byte)(var1 + var2);
		int var4 = var1 + var2;
		
		//int 타입보다 큰 타입이 연산이 되면 큰 타입으로 결과가 된다.

		int var5 = 10;
		long var6 = 20;
		double var10 = 1.5;
		
		long var7 = var5 + var6;	//long > int
		int var8 = var5 + (int)var6;
		int var9 = (int)(var5 + var6);
		
		double var11 = var5 + var10;	//11.5 double > int
		int var12 = var5 + (int)var10;		//11
		int var13 = (int)(var5 + var10);	//11
		
		
		
	}

}
