/**
	DigitalCamera에 필요한 추상메소드 3개 이상
 */

public interface DigitalCamera {
	
	abstract public void clickShutter();		// 사진 찍기
	abstract public void showPhotos();			// 내 사진 보기
	abstract public void zoomCamera();			// 카메라 줌 확대
}
