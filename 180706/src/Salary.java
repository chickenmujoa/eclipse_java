import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		int salary;
		int deposit;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input your salary: ");
		salary = scanner.nextInt();
		
		deposit = 10 * 12 * salary;
		System.out.println("10 years of your depsoit: " + deposit);
		
		scanner.close();
	}
}
