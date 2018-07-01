
public class IfElseEx01 {
	public static void main(String[] args) {
		printAge(20);
		printAge(15);
		printAge(10);
	}
	
	public static void printAge(int age) {
		if (age > 18) {
			System.out.println("성인입니다");
		}
		
		else {
			System.out.println("미성년자입니다");
		}
	}
}
