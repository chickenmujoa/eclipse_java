//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//
//public class MyKeyListener extends KeyAdapter {
//	public void keyPressed(KeyEvent e) {
//		int keyCode = e.getKeyCode();							// keyCode 알아내기
//		char keyChar = e.getKeyChar();							// keyChar 알아내기
//		keyMessage[0].setText(Integer.toString(keyCode));		// 키 코드 출력
//		keyMessage[1].setText(Character.toString(keyChar));		// 키 문자 출력
//		keyMessage[2].setText(e.getKeyText(keyCode));			// 키 이름 문자열 출력
//		System.out.println("KeyPressed");
//	}
//	
//	public void keyReleased(KeyEvent e) {
//		System.out.println("KeyReleased");
//	}
//	
//	public void keyTyped(KeyEvent e) {
//		System.out.println("KeyTyped");
//	}
//	
//	public static void main(String[] args) {
//		new KeyListenerEx();
//	}
//}
