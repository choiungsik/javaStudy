package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Color;

public class FontChange {

	private JFrame frame;
	private JTextField text_id;
	private JTextField text_pw;
	private FontMake fm = new FontMake();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FontChange window = new FontChange();
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
	public FontChange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 566, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		fm.fontChange(ge); // fm이 가지고 있는 저장했던 폰트를 graphicEnvironment로 넘겨주는 과정

		String fonts[] = ge.getAvailableFontFamilyNames(); // 우리가 사용 가능한 폰트를 모아서 출력시켜보면 기존에는 없던 추가폰트가 있는걸 볼 수 있음
		for (int i = 0; i < fonts.length; i++) {
			System.out.println(fonts[i]);
		}

		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(12, 10, 526, 363);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uB85C\uADF8\uC778\uC2DC\uC2A4\uD15C");
		lblNewLabel.setFont(new Font("CookieRunOTF Black", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(129, 24, 245, 40);
		panel.add(lblNewLabel);

		text_id = new JTextField();
		text_id.setBounds(129, 88, 367, 41);
		panel.add(text_id);
		text_id.setColumns(10);
		// 창에 투명도를 부여하는 기능 setOpaque
		text_id.setOpaque(false);
		// 텍스트필드의 선을 없애는 기능
		text_id.setBorder(null);

		text_pw = new JTextField();
		text_pw.setColumns(10);
		text_pw.setBounds(129, 163, 367, 41);
		panel.add(text_pw);

		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.setFont(new Font("CookieRunOTF Black", Font.BOLD, 15));
		btn_login.setBounds(129, 244, 182, 41);
		panel.add(btn_login);

		JButton btn_join = new JButton("\uD68C\uC6D0\uAD00\uB9AC");
		btn_join.setFont(new Font("CookieRunOTF Black", Font.PLAIN, 15));
		btn_join.setBounds(129, 295, 182, 41);
		panel.add(btn_join);

		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(60, 88, 57, 41);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(60, 163, 57, 41);
		panel.add(lblNewLabel_1_1);
	}
}
