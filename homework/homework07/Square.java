package homework07;

public class Square extends Rectangle{

	public Square(double element1) {
		super(element1, element1);
	}
	
	@Override
	public void print() {
		System.out.printf("정사각형의 면적은 %f 입니다.\n", this.getArea());
		
	}

	
}
