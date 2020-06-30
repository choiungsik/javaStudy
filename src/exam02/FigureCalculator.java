package exam02;

public class FigureCalculator {

	public double calculator(Figure Figure) {  // 도형마다 계산식이 달라 Figure로 업캐스팅하여 값을 찾아오도록 만듬
		// TODO Auto-generated method stub
		return Figure.cal();   // 구현해야하는 식은 도형마다 다르므로 결과만 있도록 cal메소드를 추상적으로 작성만 해놓음
	}


	
}
