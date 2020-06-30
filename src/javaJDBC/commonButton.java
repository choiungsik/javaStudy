package javaJDBC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class commonButton {

	// 현재 없는 상태를 매개변수로 담아서 만드는 기능을 활성화시킴
	public void buttonMake(JFrame frame, JPanel panel) {
		JButton btnNewButton = new JButton("\uD648");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Join.main(null);
			}
		});
		btnNewButton.setBounds(12, 443, 85, 40);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(160, 443, 85, 40);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(319, 443, 85, 40);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(463, 443, 85, 40);
		panel.add(btnNewButton_3);
	}
	
}
