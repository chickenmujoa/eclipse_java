
public class CalculateSum {
	
	public static int findSum(int number) {			// 재귀 함수, 재귀 메소드
		if(number == 1) {
			return 1;
		}
		
		else {
			return (findSum(number-1) + number);
		}
	}
	
	public static void main(String[] args) {
		int number = 100;
		System.out.println("1부터  " + number + "의 합은 " + findSum(number) + "이다");
	}
}
