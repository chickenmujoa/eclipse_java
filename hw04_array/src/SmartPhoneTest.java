/**
	SmartPhone Test Drive
 */

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SmartPhoneTest {
	
	/**
		각각 메소드에서 scanner를 만들고 close할 시에 NoSuchElementException 에러 발생
	 */
	static Scanner scanner = new Scanner(System.in);
	
	/**
		입력한 순서로 스마트폰 모델 스펙을 출력하는 메소드
	 */
	public static void enterNewPhone(SmartPhone phoneArray) {

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
			
			System.out.println("제조사를 입력하세요: ");
			manufact = scanner.next();
			phoneArray.setManufact(manufact); 
			
			System.out.println("이름을 입력하세요: ");
			name = scanner.next();
			phoneArray.setName(name); 
			
			System.out.println("무게를 입력하세요: ");
			weight = scanner.nextInt(); 
			phoneArray.setWeight(weight);
			
			System.out.println("가격을 입력하세요: ");
			price = scanner.nextInt();
			phoneArray.setPrice(price);
			
			System.out.println("CPU를 입력하세요: ");
			processor = scanner.next();
			phoneArray.setProcessor(processor);
			
			System.out.println("배터리 용량을 입력하세요: ");
			battery = scanner.nextInt();
			phoneArray.setBattery(battery);
			
			System.out.println("디스플레이 크기를 입력하세요: ");
			display = scanner.nextDouble();
			phoneArray.setDisplay(display);
			
			System.out.println("메모리 크기를 입력하세요: ");
			memory = scanner.nextInt();
			phoneArray.setMemory(memory);
			
			System.out.println("카메라 화소를 입력하세요: ");
			camera = scanner.nextInt();
			phoneArray.setCamera(camera);
		}
		catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다! 다시한번 입력해주세요");
		}
	}

	
	/**
		사용자가 선택한 2가지 스마트폰의 무게를 비교하여 가벼운 것을 알려주는 메소드
     */
	public static void showPhoneLighter(ArrayList<SmartPhone> phoneArray) {
		
		int phoneWeightNum1;
		int phoneWeightNum2;

		
		try {
			System.out.println("*-------------------------------------------------*");
			System.out.println("무게 비교를 원하는 두개의 스마트폰이 속한 배열번호를 각각 입력해 주세요(ex.첫번째 배열 - 0, 두번째 배열 - 1)");
			phoneWeightNum1 = scanner.nextInt();
			phoneWeightNum2 = scanner.nextInt();

			if(phoneArray.get(phoneWeightNum1).getWeight() > phoneArray.get(phoneWeightNum2).getWeight())
				System.out.println(phoneArray.get(phoneWeightNum1).getManufact() + " 와 " + phoneArray.get(phoneWeightNum2).getManufact() + " 중에서 더 가벼운 핸드폰은 "
	    							+ phoneArray.get(phoneWeightNum2).getManufact() + " 입니다");
			else
				System.out.println(phoneArray.get(phoneWeightNum1).getManufact() + " 와 " + phoneArray.get(phoneWeightNum2).getManufact() + " 중에서 더 가벼운 핸드폰은 "
									+ phoneArray.get(phoneWeightNum1).getManufact() + " 입니다");
		}
		catch(InputMismatchException e) {
			System.out.println("숫자를 입력해주세요");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("이 리스트의 배열은 " + phoneArray.size() + " 개입니다. 다시 입력해주세요");
		}
	}
	

	/**
		배열 안에서 가장 싼 스마트폰을 찾는 메소드
	 */
	public static void showPhoneCheapest(ArrayList<SmartPhone> phoneArray) {
		
		int phoneCheapest = 1000000;     // 초기값
		int arrayNum = 0;
		
		for(int i = 0; i < phoneArray.size(); i++){
			if(phoneArray.get(i).getPrice() < phoneCheapest){
				phoneCheapest = phoneArray.get(i).getPrice();
				arrayNum = i;
			}
			else
				continue;
		}
		System.out.println("*-------------------------------------------------*");
		System.out.println("리스트에서 가장 싼 핸드폰은 " + phoneArray.get(arrayNum).getName() + " 입니다");			
	}
	
	
	/**
		특정 스마트폰 제조사가 만든 폰이 배열에서 몇개있는지 확인
	 */
	public static void showPhoneManufactNum(ArrayList<SmartPhone> phoneArray) {
		
		String manufactName;
		int count = 0;
		
		System.out.println("*-------------------------------------------------*");
		System.out.println("리스트에서 찾고싶은 폰 제조회사를 입력해 주세요 (대소문자 관계없습니다)");
		manufactName = scanner.next();
		
		for(int i = 0; i < phoneArray.size(); i++){
			if(manufactName.equalsIgnoreCase(phoneArray.get(i).getManufact()))
				count++;
			else
				continue;
		}
		System.out.println("리스트에서 " + manufactName + " 의 폰 개수는 " + count + "개 입니다");
	}
	
	
	/**
		특정 스마트폰 제조사가 만든 폰의 정보를 보여주는 메소드
	 */
	public static void showPhoneManufactInfo(ArrayList<SmartPhone> phoneArray) {
	
		String manufactName;
	
		System.out.println("*-------------------------------------------------*");
		System.out.println("리스트에서 정보를 보고싶은 폰의 제조회사를 입력해 주세요 (대소문자 관계없습니다)");
		manufactName = scanner.next();
	
		for(int i = 0; i < phoneArray.size(); i++){
			if(manufactName.equalsIgnoreCase(phoneArray.get(i).getManufact()))
				phoneArray.get(i).showPhoneList();
			else
				continue;
		}
	}

	
	/**
		배열에서 가장 비싼 스마트폰과 가장 싼 스마트폰의 차이를 구하는 메소드
	 */
	public static void showPhonePriceDiffer(ArrayList<SmartPhone> phoneArray) {
		
		int cheapestPhone = 0;
		int expensivePhone = 0;
		int averagePrice = 0;
		int priceDifference = 0;
		
		for(int i = 0; i < phoneArray.size(); i++)
			averagePrice += phoneArray.get(i).getPrice();
		
		averagePrice /= phoneArray.size();
		System.out.println("*-------------------------------------------------*");
		System.out.println("리스트에서의 폰 가격 평균값은 " + averagePrice + " 입니다");
		
		for(int i = 0; i < phoneArray.size(); i++){
			if(averagePrice < phoneArray.get(i).getPrice()){
				if(expensivePhone < phoneArray.get(i).getPrice())
					expensivePhone = phoneArray.get(i).getPrice();
				else
					continue;
			}
			else{
				if(averagePrice > phoneArray.get(i).getPrice())
					cheapestPhone = phoneArray.get(i).getPrice();
				else
					continue;
			}
		}
		priceDifference = expensivePhone - cheapestPhone;
		
		System.out.println("가장 비싼 핸드폰과 가장 싼 핸드폰 가격의 차이는 " + priceDifference + " 입니다");
	}
	
	
	/**
		특정 스마트폰의 이름을 검색하면 그 스마트폰의 정보만 출력하는 메소드
	 */
	public static void showPhoneInfo(ArrayList<SmartPhone> phoneArray) {
		
		String name;
		
		System.out.println("*-------------------------------------------------*");
		System.out.println("리스트에서 정보를 보고싶은 폰이름을 입력해 주세요 (대소문자 관계없습니다)");
		
		name = scanner.next();
		
		for(int i = 0; i < phoneArray.size(); i++){
			if(name.equalsIgnoreCase(phoneArray.get(i).getName())) {
				phoneArray.get(i).showPhoneList();
			}
			else
				continue;
		}
	}
	
	/**
	 입력받은 데이터를 파일에 저장하는 함수
	 */
	public static void makePhoneText(ArrayList<SmartPhone> phoneArray) {
	
		try {
			BufferedWriter bufWriter = new BufferedWriter(new FileWriter("C:\\Temp\\SmartPhoneText.txt"));
		
			/**
				write 함수가 String이기 때문에 int나 double형은 전부다 글자가 깨져서 나온다.
				형을 String으로 고치는 작업
			 */
			String phoneWeight[] = new String[3];
			String phonePrice[] = new String[3];
			String phoneBattery[] = new String[3];
			String phoneDisplay[] = new String[3];
			String phoneMemory[] = new String[3];
			String phoneCamera[] = new String[3];
		
			for(int i = 0; i < phoneWeight.length; i++) {
				phoneWeight[i] = Integer.toString(phoneArray.get(i).getWeight());
			}
		
			for(int i = 0; i < phonePrice.length; i++) {
				phonePrice[i] = Integer.toString(phoneArray.get(i).getPrice());
			}
		
			for(int i = 0; i < phoneBattery.length; i++) {
				phoneBattery[i] = Integer.toString(phoneArray.get(i).getBattery());
			}
		
			for(int i = 0; i < phoneDisplay.length; i++) {
				phoneDisplay[i] = Double.toString(phoneArray.get(i).getDisplay());
			}
		
			for(int i = 0; i < phoneMemory.length; i++) {
				phoneMemory[i] = Integer.toString(phoneArray.get(i).getMemory());
			}
		
			for(int  i = 0; i < phoneCamera.length; i++) {
				phoneCamera[i] = Integer.toString(phoneArray.get(i).getCamera());
			}
	
			for(int i = 0; i < phoneArray.size(); i++) {
			
				bufWriter.write("*-------------------------------------------------*\n");
				bufWriter.write("제조사 : " + phoneArray.get(i).getManufact());
				bufWriter.write("\n");
				bufWriter.write("이름 : " + phoneArray.get(i).getName());
				bufWriter.write("\n");
				bufWriter.write("무게 : " + phoneWeight[i]);
				bufWriter.write("\n");
				bufWriter.write("가격 : " + phonePrice[i]);
				bufWriter.write("\n");
				bufWriter.write("CPU : " + phoneArray.get(i).getProcessor());
				bufWriter.write("\n");
				bufWriter.write("배터리 용량 : " + phoneBattery[i]);
				bufWriter.write("\n");
				bufWriter.write("디스플레이 : " + phoneDisplay[i]);
				bufWriter.write("\n");
				bufWriter.write("메모리 용량 : " + phoneMemory[i]);
				bufWriter.write("\n");
				bufWriter.write("카메라 성능 : " + phoneCamera[i]);
				bufWriter.write("\n");
			}
			bufWriter.close();

		} catch (IOException e) {
		System.out.println("입출력 오류");
		}
	}

	/**
		파일을 읽어오는 함수
	 */
	public static void printPhoneText() {
	
		try {
			FileInputStream fin = new FileInputStream("C:\\Temp\\SmartPhoneText.txt");
		
			/**
				자바 소스코드 인코딩 형태 - MS949
			 */
			InputStreamReader in = new InputStreamReader(fin, "MS949");
		
			int c;
		
			System.out.println("*-------------------------------------------------*");
			System.out.println("인코딩 문자는 " + in.getEncoding() + "입니다");
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
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
		
		ArrayList<SmartPhone> phoneArray = new ArrayList<SmartPhone>();

		manufact = "LG";
		name = "G4";
		weight = 155;
		price = 825000;
		processor = "퀄컴 스냅드래곤 808";
		battery = 3000;
		display = 5.5;
		memory = 3;
		camera = 8000000;
		
		phoneArray.add(new SmartPhone(manufact, name, weight, price, processor, battery, display, memory, camera));

		manufact = "Samsung";
		name = "GalaxyS6";
		weight = 138;
		price = 858000;
		processor = "엑시노스 7420 옥타코어";
		battery = 2550;
		display = 5.1;
		memory = 3;
		camera = 16000000;
		
		phoneArray.add(new SmartPhone(manufact, name, weight, price, processor, battery, display, memory, camera));

		phoneArray.add(new SmartPhone());
		
		enterNewPhone(phoneArray.get(2));

	    for(SmartPhone s : phoneArray) 
	    	s.showPhoneList();
	    
	    showPhoneLighter(phoneArray);
	    
	    showPhoneCheapest(phoneArray);
	    
	    showPhoneManufactNum(phoneArray);
	    
	    showPhoneManufactInfo(phoneArray);
	    
	    showPhonePriceDiffer(phoneArray);
	    
	    showPhoneInfo(phoneArray);
	    
	    makePhoneText(phoneArray);
	    
	    printPhoneText();
	    
	    scanner.close();
	}
}
