//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//
//public class MyKeyListener extends KeyAdapter {
//	public void keyPressed(KeyEvent e) {
//		int keyCode = e.getKeyCode();							// keyCode �˾Ƴ���
//		char keyChar = e.getKeyChar();							// keyChar �˾Ƴ���
//		keyMessage[0].setText(Integer.toString(keyCode));		// Ű �ڵ� ���
//		keyMessage[1].setText(Character.toString(keyChar));		// Ű ���� ���
//		keyMessage[2].setText(e.getKeyText(keyCode));			// Ű �̸� ���ڿ� ���
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
