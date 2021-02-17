package ch05;

import java.util.Arrays;

public class Exam07 {

	public static void main(String[] args) {

		int[] scores = {90, 85, 87};
		
		int sum =0;
		for(int i =0; i<scores.length;i++) {
			sum+= scores[i];
		}
		
		double avg = (double)sum / scores.length;
		
		System.out.println("ÃÑÇÕ: " + sum);
		System.out.println("Æò±Õ: " + avg);
	}
}
