public class SplitEx2 {
		
	// �迭�� ȭ�鿡, ��Һ��� �˱� ���� ���
	public static void dumpArray(String[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.format("array[%d] = %s%n", i, array[i]);
	}
		
	public static void main(String[] args) {
		String s;
		String[] array;
 
		// �ݷ�(:)���� ���е� ���ڿ� ����
		s = "�����:������:«��:Į����";
		array = s.split(":");
		dumpArray(array);

		// �������� ���е� ���ڿ� ����
		s = "ö���� ����� ������ �ͱ��� �Բ� ������ �д翡 �����ϴ�";
		array = s.split(" ");
		dumpArray(array);
	}
}
