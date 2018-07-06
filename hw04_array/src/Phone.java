/**
	일반 전화기에 필요한 필드 2개 이상, 추상메소드 2개, 메소드 1개 이상 만들기
 */

public abstract class Phone {
	
	private String userName;				// 사용자 이름
	private int usedYears;					// 사용년수
	
	abstract public void startCall();		// 전화걸기
	abstract public void endCall();			// 전화끊기
	
	/**
		Default Constructor
	 */
	public Phone() { }
	
	public Phone(String userName, int usedYears) {
		this.userName = userName;
		this.usedYears = usedYears;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getUsedYears() {
		return usedYears;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setUsedYears(int usedYears) {
		this.usedYears = usedYears;
	}
}
