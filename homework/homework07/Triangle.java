package homework07;

public class Triangle extends Figure{

	public Triangle(double element1, double element2){
		super(element1, element2);
	}
	
	@Override
	public double getArea() {
		return super.getElement1() * super.getElement2() * 1/2;
	}

	@Override
	public void print() {
		System.out.printf("삼각형의 면적은 %f 입니다.\n", this.getArea());
		
	}

}
