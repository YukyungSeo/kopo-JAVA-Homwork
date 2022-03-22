package kr.ac.kopo.date0322.interfaceVersion;

class Triangle extends Shape {

	private double x;
	private double y;

	public Triangle() {
		super();
	}

	public Triangle(double x, double y) {
		this.x = x;
		this.y = y;
		FigureArea();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public void printArea() {
		System.out.printf("x : %.2f\ty: %.2f\n", this.x, this.y);
		System.out.printf("삼각형의 면적은 %.2f입니다.", super.getArea());
	}

	@Override
	public double FigureArea() {
		super.setArea(this.x * this.y / 2.0);
		return super.getArea();
	}
}
