package vehicle;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle bike = new Vehicle();
		
		bike.speedUp(10);
		System.out.println("���� ��������� �ӵ�: " + bike.showSpeed() + "km/h");
		
		bike.speedUp(50);
		System.out.println("���� ��������� �ӵ�: " + bike.showSpeed() + "km/h");
		
		bike.speedUp(60);
		System.out.println("���� ��������� �ӵ�: " + bike.showSpeed() + "km/h");
		
		bike.speedDown(40);
		System.out.println("���� ��������� �ӵ�: " + bike.showSpeed() + "km/h");
	}
}
