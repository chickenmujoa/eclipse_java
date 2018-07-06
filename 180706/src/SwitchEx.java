import java.util.Scanner;

public class SwitchEx {
	
	public static void main(String[] args) {
		int number;
		
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter number : ");
			
			number = scanner.nextInt();
			switch(number) {
				case 0:
						System.out.println("Zero");
						break;
				case 1:
						System.out.println("One");
						break;
				case 2:
						System.out.println("Two");
						break;
				default:
						System.out.println("Not in the option");
						break;
			}
		
		scanner.close();
	}
}
