package calculator;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator test = new Calculator();
		
		System.out.println("�������: " + test.add(20, 10));
		System.out.println("�������: " + test.subtract(20, 10));
		System.out.println("�������: " + test.multiply(20, 10));
		System.out.println("���������: " + test.divide(20, 10));
	}
}
