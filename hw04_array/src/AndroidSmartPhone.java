/**
	�ȵ���̵� ������ �ʿ��� �ʵ� 2�� �̻� �ۼ�
 */

public class AndroidSmartPhone extends SmartPhone {
	
	private String androidVersion;				// �ȵ���̵� ����
	private int apiLevel;						// API ����
	
	public String getAndroidVersion() {
		return androidVersion;
	}
	
	public int getApiLevel() {
		return apiLevel;
	}
	
	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}
	
	public void setApiLevel(int apiLevel) {
		this.apiLevel = apiLevel;
	}
}
