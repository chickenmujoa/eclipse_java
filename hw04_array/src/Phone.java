/**
	�Ϲ� ��ȭ�⿡ �ʿ��� �ʵ� 2�� �̻�, �߻�޼ҵ� 2��, �޼ҵ� 1�� �̻� �����
 */

public abstract class Phone {
	
	private String userName;				// ����� �̸�
	private int usedYears;					// �����
	
	abstract public void startCall();		// ��ȭ�ɱ�
	abstract public void endCall();			// ��ȭ����
	
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
