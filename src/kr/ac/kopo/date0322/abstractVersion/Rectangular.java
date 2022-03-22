package kr.ac.kopo.date0322.abstractVersion;

class Rectangular extends Shape {

	private double x;
	private double y;

	public Rectangular() {
		super();
	}

	public Rectangular(double x, double y) {
		super(x * y);
		this.x = x;
		this.y = y;
	}

	public Rectangular(double area, double x, double y) {
		super(area);
		this.x = x;
		this.y = y;
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
		System.out.printf("직사각형의 면적은 %.2f입니다.", super.getArea());
	}
}
