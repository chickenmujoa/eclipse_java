public class Count {
    public static void main(String args[]){
        // Input
        int[] data = {10,8,7,3,5};
        int count = 0; //ī��Ʈ ������ ����
        
        // Process : COUNT
        //�迭�� �⺻������ ����� �Ӽ����� �ִ�.
        for (int i = 0; i < data.length; i++) {
            if(data[i]%2==0){  // %�� ������ ������
                count++; // ¦���̸� 1����
            }
        }   
        
        // Output
        System.out.println("¦���� �Ǽ� : " + count);
    }
}
