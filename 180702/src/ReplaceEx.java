public class ReplaceEx {
	public static void main(String[] args) {

		String s = "������ ���! ������ ���!"; 			// ���� ���ڿ�
		String s2;
 
		System.out.println("����:    " + s);
		System.out.println(); 					// �ٹٲ�
 
		s2 = s.replace("����", "����");
		System.out.println("ġȯ(1): " + s2); 
 
		s2 = s.replaceFirst("����", "����");
		System.out.println("ġȯ(2): " + s2); 
 
		s2 = s.replaceAll("������", "���ִ�");
		System.out.println("ġȯ(3): " + s2);
	}
}
