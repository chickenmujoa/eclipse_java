/**
	������ ������ �ʿ��� �ʵ� 2�� �̻� �ۼ�
 */

public class IPhone extends SmartPhone {
	
	private int iosVersion;					// ios ����
	private String telecomCompany;			// ��Ż� �̸�
	
	public int getIosVersion() {
		return iosVersion;
	}
	
	public String getTelecomCompany() {
		return telecomCompany;
	}
	
	public void setIosVersion(int iosVersion) {
		this.iosVersion = iosVersion;
	}
	
	public void setTelecomCompany(String telecomCompany) {
		this.telecomCompany = telecomCompany;
	}
}
