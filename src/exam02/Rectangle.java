package exam02;

public class Rectangle extends Figure {

	double w;
	double h;
	
	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}
	
	public double cal() {
		return w*h;
	}
}
