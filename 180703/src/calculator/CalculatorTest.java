package calculator;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator test = new Calculator();
		
		System.out.println("µ¡¼À°á°ú: " + test.add(20, 10));
		System.out.println("»¬¼À°á°ú: " + test.subtract(20, 10));
		System.out.println("°ö¼À°á°ú: " + test.multiply(20, 10));
		System.out.println("³ª´°¼À°á°ú: " + test.divide(20, 10));
	}
}
