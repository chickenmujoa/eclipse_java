
public class CalculateSum {
	
	public static int findSum(int number) {			// ��� �Լ�, ��� �޼ҵ�
		if(number == 1) {
			return 1;
		}
		
		else {
			return (findSum(number-1) + number);
		}
	}
	
	public static void main(String[] args) {
		int number = 100;
		System.out.println("1����  " + number + "�� ���� " + findSum(number) + "�̴�");
	}
}
