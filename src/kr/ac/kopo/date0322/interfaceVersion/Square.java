package kr.ac.kopo.date0322.interfaceVersion;

class Square extends Rectangular {

	public Square() {
		super();
	}

	public Square(double x) {
		super(x, x);
	}

	@Override
	public void printArea() {
		System.out.printf("x : %.2f\n", super.getX());
		System.out.printf("정사각형의 면적은 %.2f입니다.", super.getArea());
	}
}
