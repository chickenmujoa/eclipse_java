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
		
		System.out.print("����� BMI������ " + bmi + "�Դϴ�");
		
		scanner.close();
	}
	
	public static double calcBMI(double weight, double height) {
		return (weight / (height * height));
	}
}
