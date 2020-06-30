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
		
		// 그래프의 값과 정보를 기억하고 있는 객체를 생성 = 바차트
		DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
		
		// 파이차트(원형차트는 키와 값만 있으면 만들 수 있음)
		DefaultPieDataset dataset2 = new DefaultPieDataset();
		
		
		// 그래프의 데이터 삽입 (1.크기, 2.범례, 3.x축)
		// 1개 값을 넣을 때마다 막대바가 하나씩 생성됨
		// 가운데 범례는 한글기능이 아직 안되어있으니 축만 한글 사용
//		dataset1.addValue(20, "test", "사과");
//		dataset1.addValue(10, "test", "바나나");
//		dataset1.addValue(30, "test", "오렌지");
//		dataset1.addValue(50, "test", "복숭아");
//
//		dataset1.addValue(50, "result", "사과");
//		dataset1.addValue(70, "result", "바나나");
//		dataset1.addValue(60, "result", "오렌지");
//		dataset1.addValue(90, "result", "복숭아");
		for (int i = 0; i < list.size(); i++) {
			dataset1.addValue(list.get(i).getUsage(), list.get(i).getMonth(), list.get(i).getDivision());
			dataset2.setValue(list.get(i).getDivision(), list.get(i).getUsage());
		}
		
		
		// 그래프를 그리는 객체생성
		// 1.그래프의 제목  2.x축 설명  3.y축 설명  4.그래프데이터입력  5.그래프의종류(위로, 옆으로) 6.범례사용여부 7.툴팁사용여부 8.확대사용여부
		// 위로할 경우 plotorientation.vertical로 사용.
//		JFreeChart barChart2 = ChartFactory.createBarChart("과일판매량", "종류", "판매수", dataset1, PlotOrientation.HORIZONTAL, true, true, true);
		JFreeChart barChart = ChartFactory.createAreaChart("광주전력사용량", "계약구분", "전력사용량", dataset1, PlotOrientation.VERTICAL, true, true, true);
		JFreeChart pieChart = ChartFactory.createPieChart("광주전력사용량", dataset2, false, true, true);
		
		// 한글 인코딩
		// 한글 글씨체를 저장할 객체생성
		// 1.폰트종류 2.폰트스타일 3.크기
		Font f = new Font("Gulim", Font.BOLD, 14);
		
		// 그래프제목에 한글 적용
		barChart.getTitle().setFont(f);
		pieChart.getTitle().setFont(f);
		
		// x,y축 한글적용
		CategoryPlot plot1 = barChart.getCategoryPlot();
		PiePlot plot2 = (PiePlot) pieChart.getPlot(); //pieplot은 부모객체인 plot형태로 출력되므로 다운캐스팅하여 자식클래스인 pieplot형태로 만들어준다.
		plot1.getDomainAxis().setLabelFont(f);
		plot1.getDomainAxis().setTickLabelFont(f);
		// DomainAxis가 x축, RangeAxis가 y축을 의미함
		plot1.getRangeAxis().setLabelFont(f);
		plot1.getRangeAxis().setTickLabelFont(f);
		// piechart의 한글적용
		plot2.setLabelFont(f);
		
		// 그려진 그래프를 차트패널에 올리기
//		ChartPanel chartPane1 = new ChartPanel(barChart);
		ChartPanel chartPane1 = new ChartPanel(pieChart);
		panel.add(chartPane1);
		
		
		// 그래프 크기조절(너비, 높이)
//		chartPane1.setPreferredSize(new java.awt.Dimension());
		
		
		
	}
}
