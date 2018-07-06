import java.util.Scanner;

public class MonthSwitch {
	public static void main(String[] args) {
		int month;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input month : ");
		month = scanner.nextInt();
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 
				System.out.println("It has 31 days");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("It has 30 days");
				break;
			default:
				System.out.println("It has 28 days");
				break;
		}
		
		scanner.close();
	}
}
