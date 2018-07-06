import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LouvreMuseum extends JFrame {
	Container contentPane;
	String[] arts = {"Mona Lisa", "Venus de Milo", "The Coronation of Nepoleon", "Liberty Leading the People"};	// 콤보박스의 아이템
	ImageIcon[] images = {							// 이미지 객체 배열
			new ImageIcon("images/mona_Lisa.png"),
			new ImageIcon("images/Venus_de_Milo.jpg"),
			new ImageIcon("images/The_Coronation_of_Napoleon.jpg"),
			new ImageIcon("images/Liberty_Leading_the_People.jpg")};
	JLabel imgLabel = new JLabel(images[0]);		// 이미지 레이블 컴포넌트 생성
	
	LouvreMuseum() {
		setTitle("루브르 박물관에 오신것을 환영합니다");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(arts);	// 콤보박스 생성
		/**
			Action 리스너 등록
		 */
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();	// Action 이벤트가 발생한 콤보박스 알아내기
				
				int index = cb.getSelectedIndex();			// 콤보박스의 선택된 아이템의 인덱스 번호 알아내기
				
				imgLabel.setIcon(images[index]);			// 인덱스의 이미지를 이미지 레이블 컴포넌트에 출력하기
			}
		});
		contentPane.add(strCombo);
		contentPane.add(imgLabel);
		
		setSize(1000, 1000);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LouvreMuseum();
	}
}
