package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class GoldKey {

	private JFrame frame;
	private JLabel lbl_count;
	private JLabel lbl_goldkey;
	
	private String[] list = {"��Ȱ", "�븮��", "������", "��"};
	private int i = 0;
	Random rand = new Random();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GoldKey window = new GoldKey();
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
	public GoldKey() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 620, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 10, 580, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<<\uCC3E\uC544\uB77C \uD669\uAE08\uC5F4\uC1E0...!>>");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(80, 104, 418, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC624\uC9C0\uB796, \uBD80\uD65C, \uB300\uB9AC\uC778, \uAF5D");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(148, 210, 297, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uACFC\uC5F0 \uB2F9\uC2E0\uC758 \uC6B4\uBA85\uC740...?");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(148, 281, 297, 40);
		panel.add(lblNewLabel_2);
		
		lbl_goldkey = new JLabel("\uBB50\uAC00 \uB098\uC62C\uAE4C\uC694?");
		lbl_goldkey.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_goldkey.setBounds(148, 331, 297, 23);
		panel.add(lbl_goldkey);
		
		JButton btn_goldkey = new JButton("\uC6B4\uBA85\uD655\uC778");
		btn_goldkey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lbl_goldkey.setText(list[rand.nextInt(4)]);
//				lbl_count.setText(Integer.toString(i));
				lbl_count.setText(i+"");   // ������ + �������� ���������� ���⿡ ������ �ٲ��� �ʾƵ� ���ڷ� �ν��Ѵ�.
				
			}
		});
		btn_goldkey.setBounds(148, 402, 297, 55);
		panel.add(btn_goldkey);
		
		lbl_count = new JLabel("0");
		lbl_count.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_count.setBounds(444, 402, 57, 55);
		panel.add(lbl_count);
		
		String path = "C:\\Users\\smhrd\\Downloads\\������������\\�۾�\\javaworkspace\\java0520\\src\\GUI\\icon\\goldkey.png";
		// �̹����� ������ �ִ� ������ġ�� ����Ȯ���ڸ� �ۼ��ؼ� ������ ��θ� ������
		Image image = new ImageIcon(path).getImage();  // �̹����� �ִ� ImageIconȰ��
		JLabel lbl_image = new JLabel(new ImageIcon(image.getScaledInstance(126, 264, Image.SCALE_SMOOTH))); // �ʺ�, ����, �ǵ��� smooth�� ���¸� �ε巴�� ��
		// ���࿡ �����̴� gif ������ �������Ѵٸ� smooth�� �ƴ� defalt�� ���� �ָ� �����̴� ���ϵ� ���������� ���� �� ����

		lbl_image.setBounds(12, 193, 126, 264);
		panel.add(lbl_image);
	}
}
