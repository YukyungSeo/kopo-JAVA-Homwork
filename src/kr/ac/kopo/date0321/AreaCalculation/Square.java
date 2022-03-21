package kr.ac.kopo.date0321.AreaCalculation;

class Square extends Shape {

	public Square() {
		super();
	}

	public Square(double x) {
		super(x);
	}

	@Override
	public void valueOfArea() {
		super.valueOfArea();
	}
	
	@Override
	public void printArea() {
		System.out.printf("x : %.2f\n", this.x);
		System.out.printf("정사각형의 면적은 %.2f입니다.", super.getArea());
	}
}
