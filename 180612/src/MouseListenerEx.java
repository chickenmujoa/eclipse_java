//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class MouseListenerEx extends JFrame {
//	JPanel contentPane = new JPanel();			// ����Ʈ������ ����� �г�
//	JLabel la;									// hello ���ڿ��� ����ϱ� ���� ���̺� ������Ʈ
//	
//	MouseListenerEx() {
//		setTitle("Mouse �̺�Ʈ ����");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		setContentPane(contentPane);			// ����Ʈ�� ����
//		contentPane.setLayout(null);			// ����Ʈ���� ��ġ������ ����
//		contentPane.addMouseListener(new MouseListenerExTest());
//		
//		la = new JLabel("hello");
//		la.setSize(50, 20);						// ���̺��� ũ��
//		la.setLocation(30, 30);					// ���̺� ��ġ
//		contentPane.add(la);					// ���̺� ������Ʈ�� ����Ʈ�ҿ� �߰�
//		setSize(200, 200);
//		setVisible(true);
//	}
//	
//	class MouseListenerExTest extends MouseAdapter {
//		public void mousePressed(MouseEvent e) {
//			int x = e.getX();					// ���콺 Ŭ�� ��ǥ x
//			int y = e.getY();					// ���콺 Ŭ�� ��ǥ y
//			la.setLocation(x, y);				// ���̺��� ��ġ�� (x, y)�� �̵�
//		}
//		
//		public void mouseReleased(MouseEvent e) {}
//		public void mouseClicked(MouseEvent e) {}
//		public void mouseEntered(MouseEvent e) {}
//		public void mouseExited(MouseEvent e) {}
//		
//		public static void main(String[] args) {
//			new MouseListenerEx();
//		}
//	}
//}
