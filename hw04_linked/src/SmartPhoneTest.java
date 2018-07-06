/**
	SmartPhone Test Drive
 */


import java.util.LinkedList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class SmartPhoneTest {
	
	/**
		���� �޼ҵ忡�� scanner�� ����� close�� �ÿ� NoSuchElementException ���� �߻�
	 */
	static Scanner scanner = new Scanner(System.in);
	
	/**
		�Է��� ������ ����Ʈ�� �� ������ ����ϴ� �޼ҵ�
	 */
	public static void enterNewPhone(SmartPhone phoneLinked) {

		String manufact;
		String name;
		int weight;
		int price;
		String processor;
		int battery;
		double display;
		int memory;
		int camera;		
			
		try {
			
			System.out.println("�����縦 �Է��ϼ���: ");
			manufact = scanner.next();
			phoneLinked.setManufact(manufact); 
			
			System.out.println("�̸��� �Է��ϼ���: ");
			name = scanner.next();
			phoneLinked.setName(name); 
			
			System.out.println("���Ը� �Է��ϼ���: ");
			weight = scanner.nextInt(); 
			phoneLinked.setWeight(weight);
			
			System.out.println("������ �Է��ϼ���: ");
			price = scanner.nextInt();
			phoneLinked.setPrice(price);
			
			System.out.println("CPU�� �Է��ϼ���: ");
			processor = scanner.next();
			phoneLinked.setProcessor(processor);
			
			System.out.println("���͸� �뷮�� �Է��ϼ���: ");
			battery = scanner.nextInt();
			phoneLinked.setBattery(battery);
			
			System.out.println("���÷��� ũ�⸦ �Է��ϼ���: ");
			display = scanner.nextDouble();
			phoneLinked.setDisplay(display);
			
			System.out.println("�޸� ũ�⸦ �Է��ϼ���: ");
			memory = scanner.nextInt();
			phoneLinked.setMemory(memory);
			
			System.out.println("ī�޶� ȭ�Ҹ� �Է��ϼ���: ");
			camera = scanner.nextInt();
			phoneLinked.setCamera(camera);
		}
		catch (InputMismatchException e) {
			System.out.println("�߸��� �Է��Դϴ�! �ٽ��ѹ� �Է����ּ���");
		}
	}

	
	/**
		����ڰ� ������ 2���� ����Ʈ���� ���Ը� ���Ͽ� ������ ���� �˷��ִ� �޼ҵ�
     */
	public static void showPhoneLighter(LinkedList<SmartPhone> phoneLinked) {
		
		int phoneWeightNum1;
		int phoneWeightNum2;

		
		try {
			System.out.println("*-------------------------------------------------*");
			System.out.println("���� �񱳸� ���ϴ� �ΰ��� ����Ʈ���� ���� �迭��ȣ�� ���� �Է��� �ּ���(ex.ù��° �迭 - 0, �ι�° �迭 - 1)");
			phoneWeightNum1 = scanner.nextInt();
			phoneWeightNum2 = scanner.nextInt();

			if(phoneLinked.get(phoneWeightNum1).getWeight() > phoneLinked.get(phoneWeightNum2).getWeight())
				System.out.println(phoneLinked.get(phoneWeightNum1).getManufact() + " �� " + phoneLinked.get(phoneWeightNum2).getManufact() + " �߿��� �� ������ �ڵ����� "
	    							+ phoneLinked.get(phoneWeightNum2).getManufact() + " �Դϴ�");
			else
				System.out.println(phoneLinked.get(phoneWeightNum1).getManufact() + " �� " + phoneLinked.get(phoneWeightNum2).getManufact() + " �߿��� �� ������ �ڵ����� "
									+ phoneLinked.get(phoneWeightNum1).getManufact() + " �Դϴ�");
		}
		catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է����ּ���");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�� ����Ʈ�� �迭�� " + phoneLinked.size() + " ���Դϴ�. �ٽ� �Է����ּ���");
		}
	}
	

	/**
		�迭 �ȿ��� ���� �� ����Ʈ���� ã�� �޼ҵ�
	 */
	public static void showPhoneCheapest(LinkedList<SmartPhone> phoneLinked) {
		
		int phoneCheapest = 1000000;     // �ʱⰪ
		int arrayNum = 0;
		
		for(int i = 0; i < phoneLinked.size(); i++){
			if(phoneLinked.get(i).getPrice() < phoneCheapest){
				phoneCheapest = phoneLinked.get(i).getPrice();
				arrayNum = i;
			}
			else
				continue;
		}
		System.out.println("*-------------------------------------------------*");
		System.out.println("����Ʈ���� ���� �� �ڵ����� " + phoneLinked.get(arrayNum).getName() + " �Դϴ�");			
	}
	
	
	/**
		Ư�� ����Ʈ�� �����簡 ���� ���� �迭���� ��ִ��� Ȯ��
	 */
	public static void showPhoneManufactNum(LinkedList<SmartPhone> phoneLinked) {
		
		String manufactName;
		int count = 0;
		
		System.out.println("*-------------------------------------------------*");
		System.out.println("����Ʈ���� ã����� �� ����ȸ�縦 �Է��� �ּ��� (��ҹ��� ��������ϴ�)");
		manufactName = scanner.next();
		
		for(int i = 0; i < phoneLinked.size(); i++){
			if(manufactName.equalsIgnoreCase(phoneLinked.get(i).getManufact()))
				count++;
			else
				continue;
		}
		System.out.println("����Ʈ���� " + manufactName + " �� �� ������ " + count + "�� �Դϴ�");
	}
	
	
	/**
		Ư�� ����Ʈ�� �����簡 ���� ���� ������ �����ִ� �޼ҵ�
	 */
	public static void showPhoneManufactInfo(LinkedList<SmartPhone> phoneLinked) {
	
		String manufactName;
	
		System.out.println("*-------------------------------------------------*");
		System.out.println("����Ʈ���� ������ ������� ���� ����ȸ�縦 �Է��� �ּ��� (��ҹ��� ��������ϴ�)");
		manufactName = scanner.next();
	
		for(int i = 0; i < phoneLinked.size(); i++){
			if(manufactName.equalsIgnoreCase(phoneLinked.get(i).getManufact()))
				phoneLinked.get(i).showPhoneList();
			else
				continue;
		}
	}

	
	/**
		�迭���� ���� ��� ����Ʈ���� ���� �� ����Ʈ���� ���̸� ���ϴ� �޼ҵ�
	 */
	public static void showPhonePriceDiffer(LinkedList<SmartPhone> phoneLinked) {
		
		int cheapestPhone = 0;
		int expensivePhone = 0;
		int averagePrice = 0;
		int priceDifference = 0;
		
		for(int i = 0; i < phoneLinked.size(); i++)
			averagePrice += phoneLinked.get(i).getPrice();
		
		averagePrice /= phoneLinked.size();
		System.out.println("*-------------------------------------------------*");
		System.out.println("����Ʈ������ �� ���� ��հ��� " + averagePrice + " �Դϴ�");
		
		for(int i = 0; i < phoneLinked.size(); i++){
			if(averagePrice < phoneLinked.get(i).getPrice()){
				if(expensivePhone < phoneLinked.get(i).getPrice())
					expensivePhone = phoneLinked.get(i).getPrice();
				else
					continue;
			}
			else{
				if(averagePrice > phoneLinked.get(i).getPrice())
					cheapestPhone = phoneLinked.get(i).getPrice();
				else
					continue;
			}
		}
		priceDifference = expensivePhone - cheapestPhone;
		
		System.out.println("���� ��� �ڵ����� ���� �� �ڵ��� ������ ���̴� " + priceDifference + " �Դϴ�");
	}
	
	
	/**
		Ư�� ����Ʈ���� �̸��� �˻��ϸ� �� ����Ʈ���� ������ ����ϴ� �޼ҵ�
	 */
	public static void showPhoneInfo(LinkedList<SmartPhone> phoneLinked) {
		
		String name;
		
		System.out.println("*-------------------------------------------------*");
		System.out.println("����Ʈ���� ������ ������� ���̸��� �Է��� �ּ��� (��ҹ��� ��������ϴ�)");
		
		name = scanner.next();
		
		for(int i = 0; i < phoneLinked.size(); i++){
			if(name.equalsIgnoreCase(phoneLinked.get(i).getName())) {
				phoneLinked.get(i).showPhoneList();
			}
			else
				continue;
		}
	}
	
	/**
		 �Է¹��� �����͸� ���Ͽ� �����ϴ� �Լ�
	 */
	public static void makePhoneText(LinkedList<SmartPhone> phoneLinked) {
		
		try {
			BufferedWriter bufWriter = new BufferedWriter(new FileWriter("C:\\Temp\\SmartPhoneText.txt"));
			
			/**
				write �Լ��� String�̱� ������ int�� double���� ���δ� ���ڰ� ������ ���´�.
				���� String���� ��ġ�� �۾�
			 */
			String phoneWeight[] = new String[3];
			String phonePrice[] = new String[3];
			String phoneBattery[] = new String[3];
			String phoneDisplay[] = new String[3];
			String phoneMemory[] = new String[3];
			String phoneCamera[] = new String[3];
			
			for(int i = 0; i < phoneWeight.length; i++) {
				phoneWeight[i] = Integer.toString(phoneLinked.get(i).getWeight());
			}
			
			for(int i = 0; i < phonePrice.length; i++) {
				phonePrice[i] = Integer.toString(phoneLinked.get(i).getPrice());
			}
			
			for(int i = 0; i < phoneBattery.length; i++) {
				phoneBattery[i] = Integer.toString(phoneLinked.get(i).getBattery());
			}
			
			for(int i = 0; i < phoneDisplay.length; i++) {
				phoneDisplay[i] = Double.toString(phoneLinked.get(i).getDisplay());
			}
			
			for(int i = 0; i < phoneMemory.length; i++) {
				phoneMemory[i] = Integer.toString(phoneLinked.get(i).getMemory());
			}
			
			for(int  i = 0; i < phoneCamera.length; i++) {
				phoneCamera[i] = Integer.toString(phoneLinked.get(i).getCamera());
			}
			
			for(int i = 0; i < phoneLinked.size(); i++) {
				
				bufWriter.write("*-------------------------------------------------*\n");
				bufWriter.write("������ : " + phoneLinked.get(i).getManufact());
				bufWriter.write("\n");
				bufWriter.write("�̸� : " + phoneLinked.get(i).getName());
				bufWriter.write("\n");
				bufWriter.write("���� : " + phoneWeight[i]);
				bufWriter.write("\n");
				bufWriter.write("���� : " + phonePrice[i]);
				bufWriter.write("\n");
				bufWriter.write("CPU : " + phoneLinked.get(i).getProcessor());
				bufWriter.write("\n");
				bufWriter.write("���͸� �뷮 : " + phoneBattery[i]);
				bufWriter.write("\n");
				bufWriter.write("���÷��� : " + phoneDisplay[i]);
				bufWriter.write("\n");
				bufWriter.write("�޸� �뷮 : " + phoneMemory[i]);
				bufWriter.write("\n");
				bufWriter.write("ī�޶� ���� : " + phoneCamera[i]);
				bufWriter.write("\n");
			}
			bufWriter.close();
	
		} catch (IOException e) {
			System.out.println("����� ����");
		}
	}
	
	/**
		������ �о���� �Լ�
	 */
	public static void printPhoneText() {
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Temp\\SmartPhoneText.txt");
			
			/**
				�ڹ� �ҽ��ڵ� ���ڵ� ���� - MS949
			 */
			InputStreamReader in = new InputStreamReader(fin, "MS949");
			
			int c;
			
			System.out.println("*-------------------------------------------------*");
			System.out.println("���ڵ� ���ڴ� " + in.getEncoding() + "�Դϴ�");
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("����� ����");
		}
		
	}
	
	public static void main(String[] args) {
		
		String manufact;
		String name;
		int weight;
		int price;
		String processor;
		int battery;
		double display;
		int memory;
		int camera;
		
		LinkedList<SmartPhone> phoneLinked = new LinkedList<SmartPhone>();
		
		manufact = "LG";
		name = "G4";
		weight = 155;
		price = 825000;
		processor = "���� �����巡�� 808";
		battery = 3000;
		display = 5.5;
		memory = 3;
		camera = 8000000;
		
		phoneLinked.add(new SmartPhone(manufact, name, weight, price, processor, battery, display, memory, camera));

		manufact = "Samsung";
		name = "GalaxyS6";
		weight = 138;
		price = 858000;
		processor = "���ó뽺 7420 ��Ÿ�ھ�";
		battery = 2550;
		display = 5.1;
		memory = 3;
		camera = 16000000;
		
		phoneLinked.add(new SmartPhone(manufact, name, weight, price, processor, battery, display, memory, camera));

		phoneLinked.add(new SmartPhone());
		
		enterNewPhone(phoneLinked.get(2));

	    for(SmartPhone s : phoneLinked) 
	    	s.showPhoneList();
	    
	    showPhoneLighter(phoneLinked);
	    
	    showPhoneCheapest(phoneLinked);
	    
	    showPhoneManufactNum(phoneLinked);
	    
	    showPhoneManufactInfo(phoneLinked);
	    
	    showPhonePriceDiffer(phoneLinked);
	    
	    showPhoneInfo(phoneLinked);
	    
	    makePhoneText(phoneLinked);
	    
	    printPhoneText();
	    
	    scanner.close();
	}
}
