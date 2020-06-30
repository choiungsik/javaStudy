package InputStrim;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class MyJavaChat {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyJavaChat window = new MyJavaChat();
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
	public MyJavaChat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1087, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 490, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 1061, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		
		ReadCSV readcsv = new ReadCSV();
		ArrayList<EnergyVO> list = readcsv.getList();
		
		// �׷����� ���� ������ ����ϰ� �ִ� ��ü�� ���� = ����Ʈ
		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
		
		// ������Ʈ(������Ʈ�� Ű�� ���� ������ ���� �� ����)
		DefaultPieDataset dataset2 = new DefaultPieDataset();
		
		
		// �׷����� ������ ���� (1.ũ��, 2.����, 3.x��)
		// 1�� ���� ���� ������ ����ٰ� �ϳ��� ������
		// ��� ���ʴ� �ѱ۱���� ���� �ȵǾ������� �ุ �ѱ� ���
//		dataset1.addValue(20, "test", "���");
//		dataset1.addValue(10, "test", "�ٳ���");
//		dataset1.addValue(30, "test", "������");
//		dataset1.addValue(50, "test", "������");
//
//		dataset1.addValue(50, "result", "���");
//		dataset1.addValue(70, "result", "�ٳ���");
//		dataset1.addValue(60, "result", "������");
//		dataset1.addValue(90, "result", "������");
		for (int i = 0; i < list.size(); i++) {
			dataset1.addValue(list.get(i).getUsage(), list.get(i).getMonth(), list.get(i).getDivision());
			dataset2.setValue(list.get(i).getDivision(), list.get(i).getUsage());
		}
		
		
		// �׷����� �׸��� ��ü����
		// 1.�׷����� ����  2.x�� ����  3.y�� ����  4.�׷����������Է�  5.�׷���������(����, ������) 6.���ʻ�뿩�� 7.������뿩�� 8.Ȯ���뿩��
		// ������ ��� plotorientation.vertical�� ���.
//		JFreeChart barChart2 = ChartFactory.createBarChart("�����Ǹŷ�", "����", "�Ǹż�", dataset1, PlotOrientation.HORIZONTAL, true, true, true);
		JFreeChart barChart = ChartFactory.createAreaChart("�������»�뷮", "��౸��", "���»�뷮", dataset1, PlotOrientation.VERTICAL, true, true, true);
		JFreeChart pieChart = ChartFactory.createPieChart("�������»�뷮", dataset2, false, true, true);
		
		// �ѱ� ���ڵ�
		// �ѱ� �۾�ü�� ������ ��ü����
		// 1.��Ʈ���� 2.��Ʈ��Ÿ�� 3.ũ��
		Font f = new Font("Gulim", Font.BOLD, 14);
		
		// �׷������� �ѱ� ����
		barChart.getTitle().setFont(f);
		pieChart.getTitle().setFont(f);
		
		// x,y�� �ѱ�����
		CategoryPlot plot1 = barChart.getCategoryPlot();
		PiePlot plot2 = (PiePlot) pieChart.getPlot(); //pieplot�� �θ�ü�� plot���·� ��µǹǷ� �ٿ�ĳ�����Ͽ� �ڽ�Ŭ������ pieplot���·� ������ش�.
		plot1.getDomainAxis().setLabelFont(f);
		plot1.getDomainAxis().setTickLabelFont(f);
		// DomainAxis�� x��, RangeAxis�� y���� �ǹ���
		plot1.getRangeAxis().setLabelFont(f);
		plot1.getRangeAxis().setTickLabelFont(f);
		// piechart�� �ѱ�����
		plot2.setLabelFont(f);
		
		// �׷��� �׷����� ��Ʈ�гο� �ø���
//		ChartPanel chartPane1 = new ChartPanel(barChart);
		ChartPanel chartPane1 = new ChartPanel(pieChart);
		panel.add(chartPane1);
		
		
		// �׷��� ũ������(�ʺ�, ����)
//		chartPane1.setPreferredSize(new java.awt.Dimension());
		
		
		
	}
}
