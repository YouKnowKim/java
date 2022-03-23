package homework07;

public class Rectangle extends Figure {
	
	public Rectangle(double element1, double element2) {
		super(element1, element2);
	}

	@Override
	public double getArea() {
		return super.getElement1() * super.getElement2();
	}
	
	@Override
	public void print() {
		System.out.printf("사각형의 면적은 %f 입니다.\n", this.getArea());
		
	}
	
}
