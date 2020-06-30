package javaJDBC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import GUI.Login;
import javaJDBC.memberDAO;
import javaJDBC.memberVO;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delete {

	private JFrame frame;
	private JTextField text_id;
	private JTextField text_pw;
	private String name = null;
	
	memberDAO dao = new memberDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete window = new Delete();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Delete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 654, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 614, 457);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC0AD\uC81C\uD560 \uC544\uC774\uB514\uC640 \uBE44\uBC00\uBC88\uD638\uB97C \uC785\uB825\uD558\uC138\uC694");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 38, 507, 49);
		panel.add(lblNewLabel);
		
		text_id = new JTextField();
		text_id.setBounds(219, 128, 337, 49);
		panel.add(text_id);
		text_id.setColumns(10);
		
		text_pw = new JTextField();
		text_pw.setColumns(10);
		text_pw.setBounds(219, 231, 337, 49);
		panel.add(text_pw);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(97, 128, 93, 49);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(97, 231, 93, 49);
		panel.add(lblNewLabel_1_1);
		
		JButton btn_delete = new JButton("Delete");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = text_id.getText();
				String pw = text_pw.getText();
				
				int cnt = dao.delete(new memberVO(id, pw));
				
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "회원이 탈퇴하셨습니다.", "회원탈퇴", JOptionPane.WARNING_MESSAGE);
					frame.dispose();
					Login.main(null);
				} else {
					JOptionPane.showMessageDialog(null, "정보를 다시 확인하세요.");
				}
				
			}
		});
		btn_delete.setBounds(390, 317, 164, 49);
		panel.add(btn_delete);
	}

}
