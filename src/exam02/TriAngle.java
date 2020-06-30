package exam02;

public class TriAngle extends Figure{
	
	double w;
	double h;
	
	public TriAngle(double w, double h) {
		this.w = w;
		this.h = h;
	}
	
	@Override
	public double cal() {
		
		return w/2*h;
	}
	
	
}
