package vehicle;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle bike = new Vehicle();
		
		bike.speedUp(10);
		System.out.println("현재 오토바이의 속도: " + bike.showSpeed() + "km/h");
		
		bike.speedUp(50);
		System.out.println("현재 오토바이의 속도: " + bike.showSpeed() + "km/h");
		
		bike.speedUp(60);
		System.out.println("현재 오토바이의 속도: " + bike.showSpeed() + "km/h");
		
		bike.speedDown(40);
		System.out.println("현재 오토바이의 속도: " + bike.showSpeed() + "km/h");
	}
}
