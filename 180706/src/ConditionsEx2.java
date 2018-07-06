
public class ConditionsEx2 {
	public static void main(String[] args) {
		int num = 80;
		
		if(num < 50) {
			System.out.println("num은 50보다 작습니다");
		}
		
		else {
			if(num > 60) {
				System.out.println("num은 60보다 큽니다");
			}
			
			else {
				System.out.println("num은 50보다는 크고 60보다는 작습니다");
			}
		}
	}
}
