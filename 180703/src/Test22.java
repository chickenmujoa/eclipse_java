public class Test22 { 								// ���� Ŭ����
	
	public static void main(String[] args) {
		// int a -> ����ũ�Ⱑ ����
		// String a -> ����ũ�Ⱑ ����
		Car myCar = new Car();  
		Car yourCar = new Car();	
		
		myCar.setCar("Red", 100, 4);
		yourCar.setCar("Blue",200, 5);
		myCar.print(); 		
		yourCar.print(); 
	}
}

class Car { 
	
	String color;		// 256
	int speed;			// 8
	int gear;			// 8

	public void print() { 
		System.out.println("("+speed+", "+gear+", "+color+")");
	}

	public void setCar(String color, int speed, int gear) {    // this, super
		this.color = color;
		this.speed = speed;
		this.gear = gear;
	}
}
