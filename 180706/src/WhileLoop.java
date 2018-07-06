
public class WhileLoop {
	public static void main(String[] args) {
		int i = 0;
		
		while(i < 10) {
			if(i == 1) {
				System.out.println(i + "st time looped");
			}
			else if(i == 2) {
				System.out.println(i + "nd time looped");
			}
			else if(i == 3) {
				System.out.println(i + "rd time looped");
			}
			else {
				System.out.println(i + "th time looped");
			}
			
			i++;
		}
	}
}
