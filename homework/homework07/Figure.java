package homework07;

public abstract class Figure implements FigureService{

	private double element1;
	private double element2;
	
	public double getElement1() {
		return element1;
	}

	public double getElement2() {
		return element2;
	}

	public Figure(double element1){
		this.element1 = element1;
	}
	
	public Figure(double element1, double element2){
		this.element1 = element1;
		this.element2 = element2;
	}
}
