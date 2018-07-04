import java.io.*;
 
public class SubStringEx {
	public static void main(String args[]) {
		String Str = new String("Welcome to pusan.ac.kr-------");
 
		System.out.print("결과 :" );
		System.out.println(Str.substring(10) );
 
		System.out.print("결과 :" );
		System.out.println(Str.substring(10, 15) );
	}
}