/**
 * �Ϸ翡 �� �辿 �����ϴ� ����
 * 1, 2, 4, 8, 16, 32, 64, 128, ...
 * http://cloudstudying.kr/lectures/193
 */

import java.util.Arrays;

public class BacteriaEx {
	public static void main(String[] args) {
		//�迭
		int values[] = new int[10];
		
		// ���׸����� ��ü�� ��ȭ�� �迭�� �����Ͻÿ�
		for(int i = 0; i < values.length; i++) {
			values[i] = (int) Math.pow(2, i);
		}
		// ���
		System.out.println(Arrays.toString(values));
	}
}
