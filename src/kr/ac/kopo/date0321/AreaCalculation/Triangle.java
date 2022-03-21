package kr.ac.kopo.date0321.AreaCalculation;

class Triangle extends Shape {

	double y;

	public Triangle() {
		super();
	}

	public Triangle(double x, double y) {
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
		super.setArea(super.getX() * this.y / 2.0);
	}
	
	@Override
	public void printArea() {
		System.out.printf("x : %.2f\ty: %.2f\n", this.x, this.y);
		System.out.printf("삼각형의 면적은 %.2f입니다.", super.getArea());
	}
}
