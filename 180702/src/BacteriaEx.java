/**
 * 하루에 두 배씩 번식하는 세균
 * 1, 2, 4, 8, 16, 32, 64, 128, ...
 * http://cloudstudying.kr/lectures/193
 */

import java.util.Arrays;

public class BacteriaEx {
	public static void main(String[] args) {
		//배열
		int values[] = new int[10];
		
		// 박테리아의 개체수 변화를 배열에 저장하시오
		for(int i = 0; i < values.length; i++) {
			values[i] = (int) Math.pow(2, i);
		}
		// 출력
		System.out.println(Arrays.toString(values));
	}
}
