/**
 * 구구단 출력
 * 2 x 1 = 2
 * ...
 * 9 x 9 = 81
 */

public class NineByNineArray {
	public static void main(String[] args) {
		calcArray();
	}
	
	public static void calcArray() {
		int intArray[][] = new int[10][10];
		
		for(int i = 1; i < intArray.length; i++) {
			System.out.println(i + "단");
			
			for(int j = 1; j < intArray[i].length; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}
}
