public class CarTest {
	
	public static void main(String[] args) {
		CarEx myCar = new CarEx(); // ù��° ��ü ����
		CarEx yourCar = new CarEx(); // �ι�° ��ü ����
		
		myCar.speed = 60; // ��ü�� �ʵ� ����
		myCar.mileage = 0; // ��ü�� �ʵ� ����
		myCar.color = "blue"; // ��ü�� �ʵ� ����
		
		myCar.speedUp(); // ��ü�� �޼��� ȣ��
		System.out.println(myCar);
		
		yourCar.mileage = 10; // ��ü�� �ʵ� ����
		yourCar.speed = 120; // ��ü�� �ʵ� ����
		yourCar.color = "white"; // ��ü�� �ʵ� ����
		
		yourCar.speedDown(); // ��ü�� �޼��� ȣ��
		System.out.println(yourCar);
	}
}

class CarEx {
	
	// �ʵ� == �Ӽ� == ��� ���� ����
	public int speed; 			// �ӵ�
	public int mileage; 		// ����Ÿ�
	public String color; 		// ����

	// �޼��� == ��� �Լ� == ��� �޼��� ����
	public void speedUp() { 	// �ӵ� ���� �޼��� �޼��� ����!
		speed += 10;
	}
	
	public void speedDown() { 	// �ӵ� ���� �޼���
		speed -= 10;
	}
	
	public String toString() { 
		// ��ü�� ���¸� ���ڿ��� ��ȯ�ϴ� �޼���
		return "�ӵ�: " + speed + " ����Ÿ�: " + mileage 		+ " ����: " + color;
	}
}
