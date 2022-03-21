package kr.ac.kopo.date0321.AreaCalculation;

class Rectangular extends Shape {

	private double y;

	public Rectangular() {
		super();
	}

	public Rectangular(double x, double y) {
		super(x);
		this.y = y;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public void valueOfArea() {
		super.setArea(super.getX() * this.y);
	}
	
	@Override
	public void printArea() {
		System.out.printf("x : %.2f\ty: %.2f\n", this.x, this.y);
		System.out.printf("직사각형의 면적은 %.2f입니다.", super.getArea());
	}
}
