public class SplitEx2 {
		
	// 배열을 화면에, 요소별로 알기 쉽게 출력
	public static void dumpArray(String[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.format("array[%d] = %s%n", i, array[i]);
	}
		
	public static void main(String[] args) {
		String s;
		String[] array;
 
		// 콜론(:)으로 구분된 문자열 분해
		s = "자장면:탕수육:짬뽕:칼국수";
		array = s.split(":");
		dumpArray(array);

		// 공백으로 구분된 문자열 분해
		s = "철수는 영희와 만나서 맹구와 함께 봉숭아 학당에 갔습니다";
		array = s.split(" ");
		dumpArray(array);
	}
}
