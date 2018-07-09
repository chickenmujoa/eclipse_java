
public class AppendEx1 {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello ").append("world\n").append("Java");
		
		// System.out.println(sb);
		String s = sb.toString();
		System.out.println(s);
	}
}
