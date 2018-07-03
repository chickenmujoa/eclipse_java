package vehicle;

public class Vehicle {
	private int speed = 0; // 현재 속도를 나타내는 필드
	private int maxSpeed = 100; // 최대 속도를 나타내는 필드
 
	public int showSpeed() { // 현재 속도를 보여준다
		return speed;
	}
	
	public int showMaxSpeed() { // 최대 속도를 보여준다
		return maxSpeed;
	}
 
	public void speedUp(int increment) { // 속도를 낸다
		if(speed + increment > maxSpeed) {
			System.out.println("최대 속도 " + maxSpeed + "km/h를 넘             어설 수 없습니다.");
		}
		
		else {
			speed += increment;
		}
	}
	
	public void speedDown(int decrement) { // 속도를 줄인다
		if(speed - decrement < 0) {
			System.out.println("속도는 0 아래로 떨어질 수 없습니다.");
		}
		
		else {
			speed -= decrement;
		}
	}
}
