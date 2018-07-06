import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LouvreMuseum extends JFrame {
	Container contentPane;
	String[] arts = {"Mona Lisa", "Venus de Milo", "The Coronation of Nepoleon", "Liberty Leading the People"};	// �޺��ڽ��� ������
	ImageIcon[] images = {							// �̹��� ��ü �迭
			new ImageIcon("images/mona_Lisa.png"),
			new ImageIcon("images/Venus_de_Milo.jpg"),
			new ImageIcon("images/The_Coronation_of_Napoleon.jpg"),
			new ImageIcon("images/Liberty_Leading_the_People.jpg")};
	JLabel imgLabel = new JLabel(images[0]);		// �̹��� ���̺� ������Ʈ ����
	
	LouvreMuseum() {
		setTitle("��긣 �ڹ����� ���Ű��� ȯ���մϴ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(arts);	// �޺��ڽ� ����
		/**
			Action ������ ���
		 */
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();	// Action �̺�Ʈ�� �߻��� �޺��ڽ� �˾Ƴ���
				
				int index = cb.getSelectedIndex();			// �޺��ڽ��� ���õ� �������� �ε��� ��ȣ �˾Ƴ���
				
				imgLabel.setIcon(images[index]);			// �ε����� �̹����� �̹��� ���̺� ������Ʈ�� ����ϱ�
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
