import java.util.ArrayList;

public class IntegerArray {
	
	public static void main(String[] args) {
		Integer num1 = 100;
		System.out.println(num1);
		
		int num2 = 100;
		System.out.println(num2);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
