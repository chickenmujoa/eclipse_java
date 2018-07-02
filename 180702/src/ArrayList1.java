import java.util.ArrayList;

public class  ArrayList1 {
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList <String>();
		list.add("자바");
		list.add("C언어");
		list.add("파이썬");
		list.add("C++");
		list.add("C#");

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
