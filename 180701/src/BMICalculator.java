import java.util.Scanner;

/**
 * �񸸵��� �� ���� �ܰ�� ����
 * ��ü��(18.5�̸�), ����(18.5~25�̸�), ��ü��(25�̻�~30�̸�), ��(30�̻�)
 * BMI = w(ü��) / t(Ű) ^ 2
 */
public class BMICalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ü�߰� Ű�� �����ּ���");
		System.out.println("��) ü�� 80, Ű 1.8");
		
		double weight = scanner.nextDouble();
		double height = scanner.nextDouble();
		
		double bmi = calcBMI(weight, height);
		printBMIClassification(bmi);
		
		scanner.close();
	}
	
	public static double calcBMI(double weight, double height) {
		return (weight / (height * height));
	}
	
	public static void printBMIClassification(double bmi) {
		System.out.println("BMI : " + bmi);
		
		if (bmi > 30) {
			System.out.println("���Դϴ�");
		}
		
		else if ((bmi >= 25) && (bmi < 30)) {
			System.out.println("��ü���Դϴ�");
		}
		
		else if ((bmi >= 18.5) && (bmi < 25)) {
			System.out.println("����ü���Դϴ�");
		}
		
		else {
			System.out.println("��ü���Դϴ�");
		}
	}
}
