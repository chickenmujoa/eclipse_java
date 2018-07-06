
public class ForContinue {
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			if((i % 4) == 0)		// multiples of 4 are excluded. 4, 8, 12, ...
				continue;
			System.out.print(i + " ");
		}
	}
}
