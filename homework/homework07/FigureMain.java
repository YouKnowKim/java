package homework07;

public class FigureMain {

	public static void main(String[] args) {
		
		Figure figure = new Triangle(3, 4);
		figure.print();
		
		FigureService figureService = new Square(2);
		figureService.print();
		
		System.out.println("figureService instanceof FigureService : " + (figureService instanceof FigureService));
		System.out.println("figureService instanceof Figure : " + (figureService instanceof Figure));
		System.out.println("figureService instanceof Rectangular : " + (figureService instanceof Rectangle));
		System.out.println("figureService instanceof Square : " + (figureService instanceof Square));
	}
}
