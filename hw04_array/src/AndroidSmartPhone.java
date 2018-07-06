/**
	안드로이드 기종에 필요한 필드 2개 이상 작성
 */

public class AndroidSmartPhone extends SmartPhone {
	
	private String androidVersion;				// 안드로이드 버전
	private int apiLevel;						// API 레벨
	
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
