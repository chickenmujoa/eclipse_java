import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TestSwing extends JFrame{
	JPanel jp = new JPanel(); 							// �г� �ʱ�ȭ
	JButton jb = new JButton("��ư"); 					// ��ư �ʱ�ȭ
	JLabel jl = new JLabel("���̺�"); 						// ���̺� �ʱ�ȭ
	JTextField tf = new JTextField(10); 				// �ؽ�Ʈ�ʵ� �ʱ�ȭ
	
	public TestSwing(){
		super("Test"); 									// JFrame�� �����ڿ� ���� �Է��ϸ� ����â�� �ش� ���� �Էµ˴ϴ�.
		
		jp.add(jb); 									// jp��� �гο� jb��� ��ư �߰�
		jp.add(jl); 									// jp��� �гο� jl��� ���̺� �߰�
		jp.add(tf); 									// jp��� �гο� tf��� �ؽ�Ʈ�ʵ� �߰�
		add(jp); 										// JFrame�� jp��� �г� �߰�
		
		setSize(400, 300); 								// �������� ũ�� ����x����
		setVisible(true); 								// â�� �����ً� true, ���涧 false
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x ��ư�� �������� ����
	}

	public static void main(String[] args){
		new TestSwing();
	}
}
