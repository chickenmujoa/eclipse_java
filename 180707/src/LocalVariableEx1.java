
public class LocalVariableEx1 {
	
	static int count = 0;
	
	public static void simple() {
		int num = 3;
		System.out.println(num);
		
		count++;
	}
	
	public static void main(String[] args) {
		boolean scope = true;
		count++;
		
		if(scope) {
			int num = 1;
			num++;
			System.out.println(num);
		}
		else {
			int num = 9;
			num++;
			System.out.println(num);
		}
		
		simple();
		
		System.out.println("Global Variable count: " + count);
	}
}
