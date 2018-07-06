/**
	* 사용 프로그램 : Eclipse ver.Neon 3(4.6.3)
 	* 목적 : 스마트폰의 스펙을 기입하고 리스트를 작성하여 여러 메소드를 이용해서 다루는 프로그램
	* 학번 : 201345826
	* 학과 : IT응용공학과
	* 이름 : 송영백
*/

public class SmartPhone extends Phone implements DigitalCamera, Mp3Player {
	
	/**
		Fields
	 */
	private String manufact;		// Manufacturer
	private String name;			// Model name
	private int weight;				// Weight
	private int price;				// Price
	private String processor;		// CPU Processor
	private int battery;			// Battery capacity
	private double display;			// Display
	private int memory;				// Ram Memory
	private int camera;				// Camera
	
	/** 
		Default Constructor
	 */
	public SmartPhone() { }
	
	/**
		Constructor
		@param manufact Smart Phone's manufacturer
		@param name Smart Phone's name
		@param weight Smart Phone's weight
		@param price Smart Phone's price
		@param processor Smart Phone's CPU Processor
		@param battery Smart Phone's battery capacity
		@param display Smart Phone's display size
		@param memory Smart Phone's Ram memory capacity
		@param camera Smart Phone's camera quality
	 */
	public SmartPhone (String manufact, String name, int weight, int price, String processor,
							int battery, double display, int memory, int camera){
		this.manufact = manufact;
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.processor = processor;
		this.battery = battery;
		this.display = display;
		this.memory = memory;
		this.camera = camera;
	}

	public String getManufact() {
		return manufact;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getPrice() {
		return price;
	}

	public String getProcessor() {
		return processor;
	}

	public int getBattery() {
		return battery;
	}

	public double getDisplay() {
		return display;
	}

	public int getMemory() {
		return memory;
	}

	public int getCamera() {
		return camera;
	}

	public void setManufact(String manufact) {
		this.manufact = manufact;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public void setDisplay(double display) {
		this.display = display;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public void setCamera(int camera) {
		this.camera = camera;
	}
	
	public void showPhoneList() {
		System.out.println("*-------------------------------------------------*");
		System.out.println("제조사 : " + getManufact());
		System.out.println("이름 : " + getName());
		System.out.println("무게 : " + getWeight() + " g");
		System.out.println("가격 : " + getPrice() + " 원");
		System.out.println("CPU : " + getProcessor());
		System.out.println("배터리 용량 : " + getBattery() + " mAh");
		System.out.println("디스플레이 : " + getDisplay() + " inch");
		System.out.println("메모리 용량 : " + getMemory() + " GB RAM");
		System.out.println("카메라 성능 : " + getCamera() + " 화소");
	}
	
	@Override
	public void startCall() {
		System.out.println("전화 걸기");
	}
	
	@Override
	public void endCall() {
		System.out.println("전화 끊기");
	}

	@Override
	public void playMusic() {
		System.out.println("음악 재생");
	}

	@Override
	public void stopMusic() {
		System.out.println("음악 멈춤");
	}

	@Override
	public void forwardMusic() {
		System.out.println("다음곡 재생");
	}

	@Override
	public void clickShutter() {
		System.out.println("찰칵!! 사진이 찍힙니다");
	}

	@Override
	public void showPhotos() {
		System.out.println("내 사진폴더");
	}

	@Override
	public void zoomCamera() {
		System.out.println("줌 확대");
	}
}
