package javaJDBC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField text_id;
	private JPasswordField text_pw;
	private String name = null;
	JButton btn_delete;

	memberDAO dao = new memberDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 560, 541);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		text_id = new JTextField();
		text_id.setBounds(109, 75, 400, 40);
		panel.add(text_id);
		text_id.setColumns(10);

		text_pw = new JPasswordField();
		text_pw.setBounds(109, 144, 400, 40);
		panel.add(text_pw);

		JButton btn_login = new JButton("Login");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = text_id.getText();
				String pw = text_pw.getText();

				memberVO vo = new memberVO(id, pw);
				name = dao.login(vo);

				if (name != null) {
					JOptionPane.showMessageDialog(null, name + "�� ȯ���մϴ�.", "�α���", JOptionPane.INFORMATION_MESSAGE);
					btn_delete.setVisible(true); // ��ư�� ���̰� �ϴ� �޼ҵ�(false�� �� �Ⱥ���, true�� �� ���� - ���� �־�� Ȱ��ȭ�Ǵ� ��ư)
				} else {
					JOptionPane.showMessageDialog(null, "�α��� ����", "�α��� ����", JOptionPane.ERROR_MESSAGE);
					btn_delete.setVisible(false);
				}
			}
		});
		btn_login.setBounds(109, 231, 400, 40);
		panel.add(btn_login);

		JButton btn_join = new JButton("Join");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Join.main(null);
			}
		});
		btn_join.setBounds(109, 307, 400, 40);
		panel.add(btn_join);

		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(12, 75, 85, 40);
		panel.add(lblNewLabel);

		JLabel lblPw = new JLabel("PW :");
		lblPw.setFont(new Font("����", Font.BOLD, 15));
		lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPw.setBounds(12, 144, 85, 40);
		panel.add(lblPw);

		btn_delete = new JButton("Delete");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Delete.main(null);

			}
		});
		btn_delete.setBounds(109, 383, 400, 40);
		panel.add(btn_delete);
		btn_delete.setVisible(false);
		
		// �� �̷��� ���� ���´� �ƿ� �ٸ� Ŭ������ ����ȰŶ� �ٲٷ��� ���� ��ư�� ���� Ŭ������ �� �����ؾ���.
//		commonButton cb = new commonButton();
//		cb.buttonMake(frame, panel);

	}
}
