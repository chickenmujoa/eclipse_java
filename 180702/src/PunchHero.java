
public class PunchHero {
	// �ʵ�
	String name;
	int hp;
	
	public void punch() {
		System.out.println(name + "�� �ɳ� ��ġ!!!");
	}
	
	public static void main(String[] args) {
		//��ü ����
		// new Hero() ���Ӱ� Hero ��ü�� �����մϴ�
		// Hero h1 = ������ ������ Hero��ü�� Hero Ÿ���� ���� h1�� ����
		// Hero h2 = ������ ������ Hero��ü�� Hero Ÿ���� ���� h1�� ����
		PunchHero h1 = new PunchHero();
		PunchHero h2 = new PunchHero();
		
		// ��ü�� ���� ����
		h1.name = "������";
		h1.hp = 100;
		
		h2.name = "������";
		h2.hp = 80;
		
		// ��ü�� ���� ���
		System.out.println(h1.name);
		System.out.println(h1.hp);
		
		System.out.println(h2.name);
		System.out.println(h2.hp);
		
		// ��ü�� �޼ҵ带 ����
		h1.punch();
		h2.punch();
	}
}
