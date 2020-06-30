package GUI;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javaJDBC.memberDAO;
import javaJDBC.memberVO;

import javax.swing.JList;

public class List {

	private JFrame frame;
	private memberDAO dao = new memberDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					List window = new List();
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
	public List() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 604, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 564, 422);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		ArrayList<memberVO> member = dao.selectAll();
		
		// member��� arraylist�� ����ִ� �� �߿� �̸��� �����ͼ� model�� �߰�
		for (int i = 0; i < member.size(); i++) {
			model.addElement(member.get(i).getName());
		}
		
		// ������ ���� jlist�� ���� �ѹ��� �����
		JList list = new JList(model);
		list.setBounds(12, 10, 540, 402);
		panel.add(list);
	}
}
