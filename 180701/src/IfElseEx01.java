
public class IfElseEx01 {
	public static void main(String[] args) {
		printAge(20);
		printAge(15);
		printAge(10);
		printAge(5);
	}
	
	public static void printAge(int age) {
		if (age > 18) {								// 18세 이상인 경우
			System.out.println("성인입니다");
		}
		
		else if ((18 >= age) && (age >= 13)) {		// 13~18세 인 경우
			System.out.println("청소년입니다");
		}
		
		else if ((13 > age) && (age >= 6)) {		// 6~12세 인 경우
			System.out.println("어린이입니다");
		}
		
		else {
			System.out.println("유아입니다");
		}
	}
}
