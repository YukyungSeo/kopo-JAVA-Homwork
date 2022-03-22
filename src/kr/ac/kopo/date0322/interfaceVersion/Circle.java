package kr.ac.kopo.date0322.interfaceVersion;

class Circle extends Shape {

	private double r;

	public Circle() {
		super();
	}

	public Circle(double r) {
		this.r = r;
		this.FigureArea();
	}

	@Override
	public void printArea() {
		System.out.printf("r : %.2f\n", this.r);
		System.out.printf("원형의 면적은 %.2f입니다.", super.getArea());
	}

	@Override
	public double FigureArea() {
		super.setArea(r * r * Figurable.PI);
		return super.getArea();
	}
}
