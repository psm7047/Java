package ch04homework;

public class Exercise05 {

	public static void main(String[] args) {
		
		for(int x=1; x<=10; x++) {
			
			for(int y=1; y<=10; y++) {
				
				int tmp = 4*x + 5*y;
				
				if(tmp == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}

	}

}
