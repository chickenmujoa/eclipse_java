/**
 * 1~10���� �����߿��� 3,6,9�� ������ ������ �� ���� ����
 */

public class Game369 {
	public static void main(String[] args) {
		System.out.print("1���� 10���� 3,6,9�� �� ������ ������ ����? ");
		
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
