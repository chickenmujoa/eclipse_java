public class CarTest {
	
	public static void main(String[] args) {
		CarEx myCar = new CarEx(); // 첫번째 객체 생성
		CarEx yourCar = new CarEx(); // 두번째 객체 생성
		
		myCar.speed = 60; // 객체의 필드 변경
		myCar.mileage = 0; // 객체의 필드 변경
		myCar.color = "blue"; // 객체의 필드 변경
		
		myCar.speedUp(); // 객체의 메서드 호출
		System.out.println(myCar);
		
		yourCar.mileage = 10; // 객체의 필드 변경
		yourCar.speed = 120; // 객체의 필드 변경
		yourCar.color = "white"; // 객체의 필드 변경
		
		yourCar.speedDown(); // 객체의 메서드 호출
		System.out.println(yourCar);
	}
}

class CarEx {
	
	// 필드 == 속성 == 멤버 변수 정의
	public int speed; 			// 속도
	public int mileage; 		// 주행거리
	public String color; 		// 색상

	// 메서드 == 멤버 함수 == 멤버 메서드 정의
	public void speedUp() { 	// 속도 증가 메서드 메서드 정의!
		speed += 10;
	}
	
	public void speedDown() { 	// 속도 감소 메서드
		speed -= 10;
	}
	
	public String toString() { 
		// 객체의 상태를 문자열로 반환하는 메서드
		return "속도: " + speed + " 주행거리: " + mileage 		+ " 색상: " + color;
	}
}
