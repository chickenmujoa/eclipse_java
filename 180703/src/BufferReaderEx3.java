import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderEx3 {

	public static String getName() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         
        System.out.print("�̸� : ");
        String name = in.readLine();
         
        return name;
    }
     
    public static void main(String[] args) throws IOException {
        String name = getName();
        System.out.print(name + "��! �ȳ��ϼ���!");
    }     
}
