public class ReplaceEx {
	public static void main(String[] args) {

		String s = "복숭아 사과! 복숭아 사과!"; 			// 원본 문자열
		String s2;
 
		System.out.println("원본:    " + s);
		System.out.println(); 					// 줄바꿈
 
		s2 = s.replace("숭아", "분자");
		System.out.println("치환(1): " + s2); 
 
		s2 = s.replaceFirst("숭아", "덩이");
		System.out.println("치환(2): " + s2); 
 
		s2 = s.replaceAll("복숭아", "맛있는");
		System.out.println("치환(3): " + s2);
	}
}
