import java.util.Random;

public class RandomEx {
	public static void main(String args[]) {
		Random rand = new Random(1000); 
		
		for (int j = 0; j < 5; j++) {
			int pick = rand.nextInt(10);
			System.out.println(pick);
 
			System.out.println();
		} 
	}
}
