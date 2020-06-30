package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField text_ID;
	private JPasswordField txt_PW;
	Join join;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login(); // Login 생성자를 통해서 새로운 창을 꺼내도록 함
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
		frame.setBounds(100, 100, 540, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(12, 10, 500, 550);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAD00\uB9AC\uC2DC\uC2A4\uD15C");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(new Color(25, 25, 112));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 10, 390, 50);
		panel.add(lblNewLabel);

		text_ID = new JTextField();
		text_ID.setFont(new Font("굴림", Font.PLAIN, 20));
		text_ID.setBounds(107, 123, 365, 50);
		panel.add(text_ID);
		text_ID.setColumns(10);

		txt_PW = new JPasswordField();
		txt_PW.setFont(new Font("굴림", Font.PLAIN, 20));
		txt_PW.setBounds(107, 227, 365, 50);
		panel.add(txt_PW);

		JButton btn_login = new JButton("Login");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String id = text_ID.getText();
				String pw = txt_PW.getText();
				System.out.println("아이디 : " + id + "  패스워드 : " + pw);
				text_ID.setText(""); // 출력 후 적었던 값을 빈값으로 초기화
				txt_PW.setText("");
				join.array.get(0); // join에서 가지고 있는 리스트에 접근해서 아이디와 패스워드를 가져옴

				boolean result = false;

				for (int i = 0; i < join.array.size(); i++) {
					if (id.equals(join.array.get(i).getId()) && pw.equals(join.array.get(i).getPw())) {
						result = true;
						JOptionPane.showMessageDialog(null, "로그인 성공! "+ join.array.get(i).getName() + "님 환영합니다.", "로그인", JOptionPane.WARNING_MESSAGE);
						// JOptinPane.showMessageDialog(null 고정, 보여줄 메세지, 다이얼로그 타이틀, 아이콘모양설정(JOptionPane이 보유하고 있으니 참조)
						break;
					} else if (i == join.array.size() - 1) {
						JOptionPane.showMessageDialog(null, "로그인 실패!", "에러메세지", JOptionPane.ERROR_MESSAGE);
					}
				}

//			if (result) {
//				System.out.println("로그인 실패!");
//			}

			}
		});
		btn_login.setBackground(Color.CYAN);
		btn_login.setBounds(121, 360, 257, 50);
		panel.add(btn_login);

		JButton btn_Join = new JButton("New User");
		btn_Join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Join.main(null);
			}
		});
		btn_Join.setBackground(Color.CYAN);
		btn_Join.setBounds(121, 431, 257, 50);
		panel.add(btn_Join);

		JLabel lbl_ID = new JLabel("ID");
		lbl_ID.setForeground(SystemColor.textText);
		lbl_ID.setFont(new Font("굴림", Font.PLAIN, 20));
		lbl_ID.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_ID.setBounds(32, 123, 51, 50);
		panel.add(lbl_ID);

		JLabel lbl_PW = new JLabel("PW");
		lbl_PW.setForeground(new Color(0, 128, 0));
		lbl_PW.setFont(new Font("굴림", Font.PLAIN, 20));
		lbl_PW.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_PW.setBounds(32, 227, 51, 50);
		panel.add(lbl_PW);
	}
}
