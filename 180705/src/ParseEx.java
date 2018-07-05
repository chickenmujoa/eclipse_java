
public class ParseEx {
	public static void main(String[] args) {
		String numStr = "54";
		
		// String -> int
		int numInt = Integer.parseInt(numStr);
		System.out.println(numInt);
		
		// int -> String
		String numStr2 = String.valueOf(numInt);
		System.out.println(numStr2);
	}
}
