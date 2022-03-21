package homework06;

public class FirgureMain {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() *4) + 1;
		
		if(num==1 || num==4) {
			double element1=(Math.random()*13) + 1;
			Figure figure = new Figure(element1);
			figure.areaOfSquare();
			figure.areaOfCircle();
		} else {
			double element1=(Math.random()*13) + 1;
			double element2=(Math.random()*13) + 1;
			Figure figure = new Figure(element1,element2);
			figure.areaOfRectangular();
			figure.areaOfTriangle();
		}
	}
}
