//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class AnonymousClassListener extends JFrame {
//	AnonymousClassListener() {
//		setTitle("Action �̺�Ʈ ������ �ۼ�");
//		setLayout(new FlowLayout());
//		setSize(300, 300);
//		setVisible(true);
//		
//		JButton btn = new JButton("Action");
//		add(btn);
//		btn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JButton b = (JButton)e.getSource();
//				if(b.getText().equals("Action"))
//					b.setText("�׼�");
//				else
//					b.setText("Action");
//				
//				// AnonymousClassListener�� ����� JFrame�� ����� ȣ���� �� ����
//				setTitle(b.getText());
//			}
//		}
//		);
//	}
//	
//	public static void main(String[] args) {
//		new AnonymousClassListener();
//	}
//}
