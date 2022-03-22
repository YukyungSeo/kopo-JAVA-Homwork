package kr.ac.kopo.date0322.abstractVersion;

abstract class Shape {

	private double area; // 얘의 접근제한자는 어떤것이 좋을까?

	public Shape() {
	}

	public Shape(double area) {
		super();
		this.area = area;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public abstract void printArea();
}
