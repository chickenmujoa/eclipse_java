import java.util.ArrayList;

public class PrintArray {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(100);
		list.add(200);
		list.add("ÆÄÀÌ½ã");
		list.add("C++");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
