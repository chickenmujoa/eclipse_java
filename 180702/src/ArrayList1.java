import java.util.ArrayList;

public class  ArrayList1 {
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList <String>();
		list.add("�ڹ�");
		list.add("C���");
		list.add("���̽�");
		list.add("C++");
		list.add("C#");

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
