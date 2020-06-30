package javaJDBC;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import GUI.Login;

public class Join {

	private JFrame frame;
	private JTextField text_id;
	private JTextField text_pw;
	private JTextField text_name;
	private JTextField text_age;
	
	memberDAO dao = new memberDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join window = new Join();
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
	public Join() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 410, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		text_id = new JTextField();
		text_id.setBounds(91, 43, 307, 43);
		panel.add(text_id);
		text_id.setColumns(10);
		
		text_pw = new JTextField();
		text_pw.setColumns(10);
		text_pw.setBounds(91, 138, 307, 43);
		panel.add(text_pw);
		
		text_name = new JTextField();
		text_name.setColumns(10);
		text_name.setBounds(91, 232, 307, 43);
		panel.add(text_name);
		
		text_age = new JTextField();
		text_age.setColumns(10);
		text_age.setBounds(91, 318, 307, 43);
		panel.add(text_age);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(22, 44, 57, 42);
		panel.add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setBounds(22, 138, 57, 42);
		panel.add(lblPw);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblName.setBounds(22, 233, 57, 42);
		panel.add(lblName);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAge.setBounds(22, 319, 57, 42);
		panel.add(lblAge);
		
		JButton btn_join = new JButton("Join");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = text_id.getText();
				String pw = text_pw.getText();
				String name = text_name.getText();
				int age = Integer.parseInt(text_age.getText());
				
				memberVO vo = new memberVO(id, pw, name, age);
				int cnt = dao.join(vo);
				
				if (cnt > 0) {
					JOptionPane.showMessageDialog(null, "회원가입을 축하합니다.", "회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
					Login.main(null);
				} else {
					JOptionPane.showMessageDialog(null, "회원가입이 실패했습니다. 다시 확인하세요.", "회원가입 실패", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btn_join.setBounds(218, 401, 180, 43);
		panel.add(btn_join);
	}

}
