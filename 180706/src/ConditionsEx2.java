
public class ConditionsEx2 {
	public static void main(String[] args) {
		int num = 80;
		
		if(num < 50) {
			System.out.println("num�� 50���� �۽��ϴ�");
		}
		
		else {
			if(num > 60) {
				System.out.println("num�� 60���� Ů�ϴ�");
			}
			
			else {
				System.out.println("num�� 50���ٴ� ũ�� 60���ٴ� �۽��ϴ�");
			}
		}
	}
}