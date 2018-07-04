/**
 * 최고 득점자를 찾는 프로그램
 * http://cloudstudying.kr/lectures/194
 */

public class TopScore {
	public static void main(String[] args) {
		String names[] = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
		int scores[] = {65, 74, 23, 75, 68, 96, 88, 98, 54};
		int i = topIndex(scores);
		
		System.out.printf("1등: %s(%d)\n", names[i], scores[i]);
	}
	
	public static int topIndex(int[] scores) {
		int maxScore = 0;
		int maxArray = 0;
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > maxScore) {
				maxScore = scores[i];
				maxArray = i;
			}
			else {
				continue;
			}
		}
		return maxArray;
    }
}