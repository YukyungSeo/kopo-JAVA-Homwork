package kr.ac.kopo.date0322.abstractVersion;

public class AreaCalculationMain {

	public static void main(String[] args) {

		// 1-정사각형, 2-직사각형, 3-삼각형, 4-원
		int shapeNum = (int) ((Math.random() * 10) % 4) + 1;

		double x = (int) (Math.random() * 10) + 1;
		Shape shape = null;
		switch (shapeNum) {
		case 1: {
			shape = new Square(x);
			break;
		}
		case 2: {
			double y = (int) (Math.random() * 10) + 1;
			shape = new Rectangular(x, y);
			break;
		}
		case 3: {
			double y = (int) (Math.random() * 10) + 1;
			shape = new Triangle(x, y);
			break;
		}
		case 4: {
			shape = new Circle(x);
			break;
		}
		}
		
		if (shape != null)
			shape.printArea();
	}
}
