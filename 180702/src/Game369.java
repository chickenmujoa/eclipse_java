/**
 * 1~10까지 정수중에서 3,6,9를 제외한 숫자의 총 합을 구함
 */

public class Game369 {
	public static void main(String[] args) {
		System.out.print("1에서 10까지 3,6,9를 뺀 나머지 숫자의 합은? ");
		
		int result = gameCalc();
		System.out.print(result);
		
	}
	
	public static int gameCalc() {
		int result = 0;
		
		for(int i = 1; i < 11; i++) {
			if((i == 3) || (i == 6) || (i == 9)) {
				continue;
			}
			else {
				result += i;
			}
		}
		
		return result;
	}
}
