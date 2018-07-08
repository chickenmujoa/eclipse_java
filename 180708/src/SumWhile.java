
public class SumWhile {
	
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		do {
			i += 1;
			j += i;
		} while(i < 100);
		
		System.out.println();
		System.out.println("i = " + i + " /sum = " + j);
		
	}
}
