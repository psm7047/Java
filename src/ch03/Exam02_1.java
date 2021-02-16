package ch03;

public class Exam02_1 {

	public static void main(String[] args) {
		
		//연산의 결과가 boolean타입으로 나오는 연산기호
		
		int var1 = 10;
		int var2 = 20;
		
		boolean var3 = var1 == var2;	//false
		boolean var5 = var1 != var2;	//true
		
		boolean var4 = var1 > var2;		//false
		boolean var6 = var1 < var2;		//true
		
		boolean var7 = var1 >= var2;	//false
		boolean var8 = var1 <= var2;	//true
		
		boolean var9 = !(var1 == var2);	//true
		boolean var10 = ((var1 == var2) || (var1 < var2));	//true
		boolean var11 = ((var1 == var2) && (var1 < var2));	//false
		

	}

}
