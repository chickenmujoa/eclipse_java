import java.util.Scanner;

/**
 * 비만도는 네 가지 단계로 구분
 * 저체중(18.5미만), 정상(18.5~25미만), 과체중(25이상~30미만), 비만(30이상)
 * BMI = w(체중) / t(키) ^ 2
 */
public class BMICalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("체중과 키를 적어주세요");
		System.out.println("예) 체중 80, 키 1.8");
		
		double weight = scanner.nextDouble();
		double height = scanner.nextDouble();
		
		double bmi = calcBMI(weight, height);
		
		System.out.print("당신의 BMI지수는 " + bmi + "입니다");
		
		scanner.close();
	}
	
	public static double calcBMI(double weight, double height) {
		return (weight / (height * height));
	}
}
