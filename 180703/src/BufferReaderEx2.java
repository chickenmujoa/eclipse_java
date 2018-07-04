import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
		int su1 = 0, su2 = 0;
        char yon = 0;
        int tot = 0;
         
        System.out.print("ù ��° �� : ");
        su1 = Integer.parseInt(in.readLine());
         
        System.out.print("�� ��° �� : ");
        su2 = Integer.parseInt(in.readLine());
         
        do {
        	System.out.print("������ (+, -, *, /) �Է� : ");
            yon = (char)System.in.read();
            in.readLine();
        }
        
        while(yon != '+' && yon != '-' && yon != '*' && yon != '/');
         
        switch(yon) {
        	case '+' :
        		tot = add(su1, su2);
                break;
            case '-' :
                tot = sub(su1, su2);
                break;
            case '*' :
                tot = multi(su1, su2);
                break;
            case '/' :
                tot = div(su1, su2);
                break;
            default :
                System.out.println("�߸� �Է��Ͽ����ϴ�.");
        }
         
        System.out.println(su1 + " " + yon + " " + su2 + " = " + tot);
	}
     
    public static int add(int a, int b) {
        int total = a + b;
  
        return total;
    }
     
    public static int sub(int a, int b) {
        int total = a - b;
    
        return total;
    }
     
    public static int multi(int a, int b) {
        int total = a * b;
 
        return total;
    }
     
    public static int div(int a, int b) {
    	int total = a /b;
 
        return total;
    }
}