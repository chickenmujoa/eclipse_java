
public class Count {
	
	public static void main(String[] args) {
		// 1. input
		int data[] = {10, 8, 7, 3, 5};
		int count = 0;
		
		// 2. process
		for(int i = 0; i < data.length; i++) {
			if((data[i] % 2) == 0) {
				count++;
			}
		}
		
		// 3. output
		System.out.println("Even number : " + count);
	}
}
