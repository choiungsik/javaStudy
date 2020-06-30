package exam02;

public class figure_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 도형 넓이계산
		
		FigureCalculator figCal = new FigureCalculator();
		double result = figCal.calculator(new Circle(3));
		double result2 = figCal.calculator(new Rectangle(10, 10));
		double result3 = figCal.calculator(new TriAngle(10, 10));
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		}

}
