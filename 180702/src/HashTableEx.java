/**
 * �ҿ��� �Լ�. ���߿� �����ٶ�
 */

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		// �ؽ� ���̺� Ű�� �� ���� �ֱ�
		ht.put("�ڹ�", 0);
		ht.put("C���", 1);
		ht.put("���̽�", 2);
		ht.put("C++", 3);
		ht.put("C#", 4);
		
		// �ؽ� ���̺� �ִ� �� ��������
		Enumeration en = ht.keys();
		
		while(en.hasMoreElements()) {
			String key = en.nextElement().toString();
			System.out.println(key + ":" + ht.get(key));
		}
		
	}
}
