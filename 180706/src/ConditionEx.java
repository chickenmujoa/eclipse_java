/**
 * Test score pass/fail program
 */

import java.util.Scanner;

public class ConditionEx {
	
	public static void markGrade(int score) {
		if(score > 60) {
			System.out.println("Pass");
		}
		
		else {
			System.out.println("Fail");
		}
	}
	
	public static void main(String[] args) {
		int score;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is your exam score? ");
		
		score = scanner.nextInt();
		markGrade(score);
		
		scanner.close();
	}
}
