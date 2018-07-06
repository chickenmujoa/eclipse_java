//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class MouseListenerEx extends JFrame {
//	JPanel contentPane = new JPanel();			// 컨텐트팬으로 사용할 패널
//	JLabel la;									// hello 문자열을 출력하기 위한 레이블 컴포넌트
//	
//	MouseListenerEx() {
//		setTitle("Mouse 이벤트 예제");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		setContentPane(contentPane);			// 컨텐트팬 변경
//		contentPane.setLayout(null);			// 컨텐트팬의 배치관리자 삭제
//		contentPane.addMouseListener(new MouseListenerExTest());
//		
//		la = new JLabel("hello");
//		la.setSize(50, 20);						// 레이블의 크기
//		la.setLocation(30, 30);					// 레이블 위치
//		contentPane.add(la);					// 레이블 컴포넌트를 컨텐트팬에 추가
//		setSize(200, 200);
//		setVisible(true);
//	}
//	
//	class MouseListenerExTest extends MouseAdapter {
//		public void mousePressed(MouseEvent e) {
//			int x = e.getX();					// 마우스 클릭 좌표 x
//			int y = e.getY();					// 마우스 클릭 좌표 y
//			la.setLocation(x, y);				// 레이블의 위치를 (x, y)로 이동
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
