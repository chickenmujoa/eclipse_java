
public class SumFor {
	
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		for(i = 0; i < 101; i++) {
			j += i;
			
			// System.out.println("i = " + i + " /sum = " + j);
		}
		
		System.out.println();
		System.out.println("i = " + (i-1) + " /sum = " + j);
		
	}
}
