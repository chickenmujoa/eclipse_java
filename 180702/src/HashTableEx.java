/**
 * 불완전 함수. 나중에 수정바람
 */

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		// 해시 테이블에 키와 값 집어 넣기
		ht.put("자바", 0);
		ht.put("C언어", 1);
		ht.put("파이썬", 2);
		ht.put("C++", 3);
		ht.put("C#", 4);
		
		// 해시 테이블에 있는 값 꺼내오기
		Enumeration en = ht.keys();
		
		while(en.hasMoreElements()) {
			String key = en.nextElement().toString();
			System.out.println(key + ":" + ht.get(key));
		}
		
	}
}
