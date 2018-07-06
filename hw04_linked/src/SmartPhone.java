/**
	* ��� ���α׷� : Eclipse ver.Neon 3(4.6.3)
 	* ���� : ����Ʈ���� ������ �����ϰ� ����Ʈ�� �ۼ��Ͽ� ���� �޼ҵ带 �̿��ؼ� �ٷ�� ���α׷�
	* �й� : 201345826
	* �а� : IT������а�
	* �̸� : �ۿ���
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
		System.out.println("������ : " + getManufact());
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getWeight() + " g");
		System.out.println("���� : " + getPrice() + " ��");
		System.out.println("CPU : " + getProcessor());
		System.out.println("���͸� �뷮 : " + getBattery() + " mAh");
		System.out.println("���÷��� : " + getDisplay() + " inch");
		System.out.println("�޸� �뷮 : " + getMemory() + " GB RAM");
		System.out.println("ī�޶� ���� : " + getCamera() + " ȭ��");
	}
	
	@Override
	public void startCall() {
		System.out.println("��ȭ �ɱ�");
	}
	
	@Override
	public void endCall() {
		System.out.println("��ȭ ����");
	}

	@Override
	public void playMusic() {
		System.out.println("���� ���");
	}

	@Override
	public void stopMusic() {
		System.out.println("���� ����");
	}

	@Override
	public void forwardMusic() {
		System.out.println("������ ���");
	}

	@Override
	public void clickShutter() {
		System.out.println("��Ĭ!! ������ �����ϴ�");
	}

	@Override
	public void showPhotos() {
		System.out.println("�� ��������");
	}

	@Override
	public void zoomCamera() {
		System.out.println("�� Ȯ��");
	}
}
