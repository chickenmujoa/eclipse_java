
public class IfElseEx01 {
	public static void main(String[] args) {
		printAge(20);
		printAge(15);
		printAge(10);
		printAge(5);
	}
	
	public static void printAge(int age) {
		if (age > 18) {								// 18�� �̻��� ���
			System.out.println("�����Դϴ�");
		}
		
		else if ((18 >= age) && (age >= 13)) {		// 13~18�� �� ���
			System.out.println("û�ҳ��Դϴ�");
		}
		
		else if ((13 > age) && (age >= 6)) {		// 6~12�� �� ���
			System.out.println("����Դϴ�");
		}
		
		else {
			System.out.println("�����Դϴ�");
		}
	}
}
