//import javax.swing.*;
//import java.awt.*;
//
//public class KeyListenerEx extends JFrame {
//	JPanel contentPane = new JPanel();			// ����Ʈ������ ����� �г�
//	JLabel[] keyMessage;						// 3���� �޽����� ����� ���̺� ������Ʈ �迭
//	
//	KeyListenerEx() {
//		setTitle("KeyListener ����");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		setContentPane(contentPane);
//		contentPane.addKeyListener(new MyKeyListener());		// ����Ʈ�ҿ� Key�����ʸ� ����Ѵ�
//		
//		// ���̺� �迭�� 3�� �����ϰ� �� ���̺� ������Ʈ ����
//		keyMessage = new JLabel[3];							// ���̺� �迭 ����
//		keyMessage[0] = new JLabel("  getKeyCode()  ");
//		keyMessage[1] = new JLabel("  getKeyCode()  ");
//		keyMessage[2] = new JLabel("  getKeyCode()  ");
//		
//		// 3���� ���̺� ������Ʈ�� ����Ʈ�ҿ� ����
//		for(int i = 0; i < keyMessage.length; i++) {
//			contentPane.add(keyMessage[i]);
//			keyMessage[i].setOpaque(true);					// ������ ���̵��� ������ �Ӽ� ����
//			keyMessage[i].setBackground(Color.CYAN);
//		}
//		
//		setSize(300, 150);
//		setVisible(true);
//		
//		// ����Ʈ���� Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
//		contentPane.requestFocus();
//	}
//}
