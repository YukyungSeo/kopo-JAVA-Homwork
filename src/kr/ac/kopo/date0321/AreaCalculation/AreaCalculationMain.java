package kr.ac.kopo.date0321.AreaCalculation;

public class AreaCalculationMain {

	public static void main(String[] args) {

		// 1-정사각형, 2-직사각형, 3-삼각형, 4-원
		int shapeNum = (int) ((Math.random() * 10) % 4) + 1;

		double x = (int) (Math.random() * 10);
		switch (shapeNum) {
		case 1: {
			Square sqr = new Square(x);
			sqr.getArea();
			sqr.printArea();
			break;
		}
		case 2: {
			double y = (int) (Math.random() * 10);
			Rectangular rec = new Rectangular(x, y);
			rec.getArea();
			rec.printArea();
			break;
		}
		case 3: {
			double y = (int) (Math.random() * 10);
			Triangle tri = new Triangle(x, y);
			tri.getArea();
			tri.printArea();
			break;
		}
		case 4: {
			Circle cir = new Circle(x);
			cir.getArea();
			cir.printArea();
			break;
		}
		}
	}
}
