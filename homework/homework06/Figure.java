package homework06;

public class Figure {

	private double element1;
	private double element2;
	
	public Figure(double element1) {
		this.element1 = element1;
	}
	
	public Figure(double element1, double element2) {
		this.element1 = element1;
		this.element2 = element2;
	}
	
	public void areaOfSquare() {
		double area = this.element1 * this.element1;
		System.out.printf("정사각형의 면적은 %f 입니다. ", area);
	}
	
	public void areaOfRectangular() {
		double area = this.element1 * this.element2;
		System.out.printf("직사각형의 면적은 %f 입니다. ", area);
	}
	
	public void areaOfTriangle() {
		double area = this.element1 * this.element2 /2;
		System.out.printf("삼각형의 면적은 %f 입니다. ", area);
	}
	
	public void areaOfCircle() {
		double area = this.element1 *this.element1 * Math.PI;
		System.out.printf("원의 면적은 %f 입니다. ", area);
	}
	
}
