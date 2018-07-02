public class Count {
    public static void main(String args[]){
        // Input
        int[] data = {10,8,7,3,5};
        int count = 0; //카운트 저장할 변수
        
        // Process : COUNT
        //배열은 기본적으로 내장된 속성들이 있다.
        for (int i = 0; i < data.length; i++) {
            if(data[i]%2==0){  // %는 나머지 연산자
                count++; // 짝수이면 1증가
            }
        }   
        
        // Output
        System.out.println("짝수의 건수 : " + count);
    }
}
