package exam02;

public class Circle extends Figure{

	// ������
	double r;
	
	public Circle(double r) {
		this.r = r;
	}

	public double cal() {
		return Math.PI*r*r;
	}
}
