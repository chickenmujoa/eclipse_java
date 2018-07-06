/**
	아이폰 기종에 필요한 필드 2개 이상 작성
 */

public class IPhone extends SmartPhone {
	
	private int iosVersion;					// ios 버전
	private String telecomCompany;			// 통신사 이름
	
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
