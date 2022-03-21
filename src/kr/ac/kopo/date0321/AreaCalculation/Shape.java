package kr.ac.kopo.date0321.AreaCalculation;

class Shape {

	protected double x;
	protected double area;

	public Shape() {
	}

	public Shape(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void valueOfArea() {
		this.area = this.x * this.x;
	}

	public void printArea() {
		System.out.printf("x : %.2f\n", this.x);
		System.out.printf("Shape의 면적은 %.2f입니다.\n", this.area);
	}
}
