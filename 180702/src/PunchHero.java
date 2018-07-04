
public class PunchHero {
	// 필드
	String name;
	int hp;
	
	public void punch() {
		System.out.println(name + "의 냥냥 펀치!!!");
	}
	
	public static void main(String[] args) {
		//객체 생성
		// new Hero() 새롭게 Hero 객체를 생성합니다
		// Hero h1 = 위에서 생성된 Hero객체를 Hero 타입의 변수 h1에 연결
		// Hero h2 = 위에서 생성된 Hero객체를 Hero 타입의 변수 h1에 연결
		PunchHero h1 = new PunchHero();
		PunchHero h2 = new PunchHero();
		
		// 객체의 값을 변경
		h1.name = "마리오";
		h1.hp = 100;
		
		h2.name = "루이지";
		h2.hp = 80;
		
		// 객체의 정보 출력
		System.out.println(h1.name);
		System.out.println(h1.hp);
		
		System.out.println(h2.name);
		System.out.println(h2.hp);
		
		// 객체의 메소드를 수행
		h1.punch();
		h2.punch();
	}
}
