package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.JProgressBar;

public class companant {

	private JFrame frame;
	private JTextField text_name;
	private JRadioButton rdb_man;
	private JRadioButton rdb_woman;
	private int R, G, B = 50;
	// 전역변수는 파이썬에서처럼 같은 형태를 묶어서 같은 값을 선언해줄 수 있다.
	private JButton btn_color;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					companant window = new companant();
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
	public companant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 619, 619);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 603, 580);
		frame.getContentPane().add(tabbedPane);

		
		JPanel panel = new JPanel();
		tabbedPane.addTab("화면1", null, panel, null);
		panel.setLayout(null);

		JLabel lbl_name = new JLabel("\uC774\uB984");
		lbl_name.setFont(new Font("굴림", Font.BOLD, 20));
		lbl_name.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_name.setBounds(30, 30, 50, 50);
		panel.add(lbl_name);

		text_name = new JTextField();
		text_name.setFont(new Font("굴림", Font.PLAIN, 20));
		text_name.setBounds(130, 30, 416, 43);
		panel.add(text_name);
		text_name.setColumns(10);

		JLabel lbl_sex = new JLabel("\uC131\uBCC4");
		lbl_sex.setFont(new Font("굴림", Font.BOLD, 20));
		lbl_sex.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_sex.setBounds(30, 130, 50, 50);
		panel.add(lbl_sex);

		JLabel lbl_habit = new JLabel("\uCDE8\uBBF8");
		lbl_habit.setFont(new Font("굴림", Font.BOLD, 20));
		lbl_habit.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_habit.setBounds(30, 230, 50, 50);
		panel.add(lbl_habit);

		JLabel lbl_combo = new JLabel("\uC870\uD569");
		lbl_combo.setFont(new Font("굴림", Font.BOLD, 20));
		lbl_combo.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_combo.setBounds(30, 330, 50, 50);
		panel.add(lbl_combo);

		JCheckBox chc_coding = new JCheckBox("\uCF54\uB529");
		chc_coding.setFont(new Font("굴림", Font.BOLD, 15));
		chc_coding.setBounds(130, 245, 72, 23);
		panel.add(chc_coding);

		JCheckBox chc_movie = new JCheckBox("\uC601\uD654");
		chc_movie.setFont(new Font("굴림", Font.BOLD, 15));
		chc_movie.setBounds(250, 245, 72, 23);
		panel.add(chc_movie);

		JCheckBox chc_reading = new JCheckBox("\uB3C5\uC11C");
		chc_reading.setFont(new Font("굴림", Font.BOLD, 15));
		chc_reading.setBounds(370, 245, 72, 23);
		panel.add(chc_reading);

		JEditorPane edit_memo = new JEditorPane();
		edit_memo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				edit_memo.setText("");
			}
		});

		edit_memo.setText("\uBA54\uBAA8\uB97C \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		edit_memo.setBackground(SystemColor.control);
		edit_memo.setBounds(31, 394, 515, 123);
		panel.add(edit_memo);

		JComboBox box_combo = new JComboBox();
		box_combo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println(box_combo.getSelectedItem());
				
			}
		});
		box_combo.setFont(new Font("굴림", Font.BOLD, 15));
		box_combo.setModel(new DefaultComboBoxModel(new String[] { "\uD53C\uC790 + \uC18C\uC8FC",
				"\uCE58\uD0A8 + \uB9E5\uC8FC", "\uCC38\uCE58\uD68C + \uC18C\uC8FC", "\uC0BC\uACB9\uC0B4 + \uC18C\uB9E5",
				"\uBD88\uB2ED + \uB9C9\uAC78\uB9AC" }));
		box_combo.setBounds(130, 345, 198, 21);
		panel.add(box_combo);

		rdb_man = new JRadioButton("\uB0A8\uC790");
		rdb_man.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (rdb_man.isSelected() == true) {
					JOptionPane.showMessageDialog(null, rdb_man.getText(), "성별확인", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		rdb_man.setFont(new Font("굴림", Font.BOLD, 15));
		rdb_man.setBounds(130, 140, 87, 30);
		panel.add(rdb_man);

		rdb_woman = new JRadioButton("\uC5EC\uC790");
		rdb_woman.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (rdb_woman.isSelected() == true) {
					JOptionPane.showMessageDialog(null, rdb_woman.getText(), "성별확인", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		rdb_woman.setFont(new Font("굴림", Font.BOLD, 15));
		rdb_woman.setBounds(300, 140, 87, 30);
		panel.add(rdb_woman);

		// 둘 중 하나만 선택할 수 있게 버튼을 그룹화시킴
		ButtonGroup group = new ButtonGroup();
		group.add(rdb_man);
		group.add(rdb_woman);

		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("화면2", null, panel_1, null);
		panel_1.setLayout(null);

		btn_color = new JButton("\uC0C9\uC0C1\uC744 \uBCC0\uACBD\uD569\uB2C8\uB2E4.");
		btn_color.setBounds(141, 469, 300, 42);
		panel_1.add(btn_color);

		JSlider slide_r = new JSlider();
		slide_r.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				// setBackground는 color라는 타입을 받으므로 새로 color타입을 만드는데 이는 RGB를 입력하라고 설정되어 있으니 우리가
				// 저장한 값을 넣어주면 된다.
				R = slide_r.getValue();
				btn_color.setBackground(new Color(R, G, B));
			}
		});
		slide_r.setMajorTickSpacing(50);
		slide_r.setMinorTickSpacing(10);
		slide_r.setMaximum(255);
		slide_r.setForeground(new Color(255, 0, 0));
		slide_r.setPaintLabels(true);
		slide_r.setPaintTicks(true);
		slide_r.setToolTipText("");
		slide_r.setBounds(10, 100, 574, 40);
		panel_1.add(slide_r);

		JSlider slide_b = new JSlider();
		slide_b.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				B = slide_b.getValue();
				btn_color.setBackground(new Color(R, G, B));

			}
		});
		slide_b.setPaintLabels(true);
		slide_b.setMajorTickSpacing(50);
		slide_b.setMaximum(255);
		slide_b.setPaintTicks(true);
		slide_b.setMinorTickSpacing(10);
		slide_b.setForeground(new Color(0, 0, 255));
		slide_b.setBounds(10, 300, 574, 40);
		panel_1.add(slide_b);

		JSlider slide_g = new JSlider();
		slide_g.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {

				G = slide_g.getValue();
				btn_color.setBackground(new Color(R, G, B));

			}
		});
		slide_g.setPaintLabels(true);
		slide_g.setMajorTickSpacing(50);
		slide_g.setMaximum(255);
		slide_g.setPaintTicks(true);
		slide_g.setMinorTickSpacing(10);
		slide_g.setForeground(new Color(0, 255, 0));
		slide_g.setBounds(10, 200, 574, 40);
		panel_1.add(slide_g);

		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("화면3", null, panel_2, null);

		String[] colNames = { "이름", "나이", "성별" };
		// 테이블의 컬럼명 작성
		Object[][] data = { { "김운비", 20, "여자" }, { "최웅식", 20, "남자" }, { "박병관", 20, "남자" }, { "김운비", 20, "여자" },
				{ "최웅식", 20, "남자" }, { "박병관", 20, "남자" }, { "김운비", 20, "여자" }, { "최웅식", 20, "남자" }, { "박병관", 20, "남자" },
				{ "김운비", 20, "여자" }, { "최웅식", 20, "남자" }, { "박병관", 20, "남자" }, { "김운비", 20, "여자" }, { "최웅식", 20, "남자" },
				{ "박병관", 20, "남자" }, { "김운비", 20, "여자" }, { "최웅식", 20, "남자" }, { "박병관", 20, "남자" }, { "김운비", 20, "여자" },
				{ "최웅식", 20, "남자" }, { "박병관", 20, "남자" }, { "김운비", 20, "여자" }, { "최웅식", 20, "남자" }, { "박병관", 20, "남자" },
				{ "김운비", 20, "여자" }, { "최웅식", 20, "남자" }, { "박병관", 20, "남자" }, { "김운비", 20, "여자" }, { "최웅식", 20, "남자" },
				{ "박병관", 20, "남자" }, { "김운비", 20, "여자" }, { "최웅식", 20, "남자" }, { "박병관", 20, "남자" }, { "김운비", 20, "여자" },
				{ "최웅식", 20, "남자" }, { "박병관", 20, "남자" }, { "김운비", 20, "여자" }, { "최웅식", 20, "남자" }, { "박병관", 20, "남자" },
				{ "김운비", 20, "여자" }, { "최웅식", 20, "남자" }, { "박병관", 20, "남자" } };
		// 최상위 객체 Object형태의 2차원 배열 형성

		panel_2.setLayout(new CardLayout(0, 0));

		table = new JTable(data, colNames);
		panel_2.add(table, "name_444192699981500");
		// 만든 컬럼명과 데이터를 table에 넣어 표를 채운다.
		
		JScrollPane scrollPane = new JScrollPane(table);
		panel_2.add(scrollPane, "name_444192705195900");
		// 데이터가 많으면 잘려서 나오므로 이를 scrollPane를 사용해서 table을 옮길 수 있도록 만듬

		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("화면4", null, panel_3, null);
		panel_3.setLayout(null);
	}
}
