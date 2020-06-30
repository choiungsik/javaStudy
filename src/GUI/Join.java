package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import exam01.arrayListTest;

public class Join {

	// 위에 선언된 것은 design에서 패널 안에 각 변수를 만들어서 그렇고 혹여나 그냥 바로 생성했다면 지역변수처럼 사용될 수 있음(추후에 에러요인 있으니 유의)
	private JFrame frame;
	private JTextField txt_ID;
	private JTextField txt_PW;
	private JTextField txt_NAME;
	private JTextField txt_AGE;
	private JButton btn_join;

	static ArrayList<VO> array = new ArrayList<VO>(); // <> 제네릭기법 안의 타입을 변경가능(VO라는 새로운 타입으로 자료값을 변경)
	// static은 저장공간을 명시함

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
		frame.setBounds(100, 100, 540, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBounds(12, 10, 500, 551);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(SystemColor.textText);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 476, 60);
		panel.add(lblNewLabel);

		txt_ID = new JTextField();
		txt_ID.setBounds(80, 100, 400, 60);
		panel.add(txt_ID);
		txt_ID.setColumns(10);

		txt_PW = new JTextField();
		txt_PW.setColumns(10);
		txt_PW.setBounds(80, 200, 400, 60);
		panel.add(txt_PW);

		txt_NAME = new JTextField();
		txt_NAME.setColumns(10);
		txt_NAME.setBounds(80, 300, 400, 60);
		panel.add(txt_NAME);

		txt_AGE = new JTextField();
		txt_AGE.setColumns(10);
		txt_AGE.setBounds(80, 400, 400, 60);
		panel.add(txt_AGE);

		btn_join = new JButton("JOIN");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String id = txt_ID.getText();
				String pw = txt_PW.getText();
				String name = txt_NAME.getText();
				int age = Integer.parseInt(txt_AGE.getText()); // 스트링형태로 가져온 값을 int형으로 변형

				array.add(new VO(id, pw, name, age));  // 별도의 변수명 없이 바로 사용(변수를 작성해도 이 이후 사용안하는 값을 줄여서 코딩을 쉽게만듬)
				frame.dispose();   // 새창을 열어도 현재 창은 그대로 켜져있기에 완료된 창은 닫도록 명령어를 둔다.
				Login.main(null);  // Login 창을 다시 여는 작업

			}
		});
		btn_join.setBounds(109, 480, 270, 50);
		panel.add(btn_join);

		JLabel lbl_id = new JLabel("ID");
		lbl_id.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_id.setBounds(10, 100, 57, 60);
		panel.add(lbl_id);

		JLabel lbl_pw = new JLabel("PW");
		lbl_pw.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_pw.setBounds(10, 200, 57, 60);
		panel.add(lbl_pw);

		JLabel lbl_name = new JLabel("NAME");
		lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_name.setBounds(10, 300, 57, 60);
		panel.add(lbl_name);

		JLabel lbl_age = new JLabel("AGE");
		lbl_age.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_age.setBounds(10, 400, 57, 60);
		panel.add(lbl_age);
	}
}
