package kr.ac.kopo.date0322.abstractVersion;

class Circle extends Shape {

	private double r;

	public Circle() {
		super();
	}

	public Circle(double r) {
		super(r * r * Math.PI);
		this.r = r;
	}

	@Override
	public void printArea() {
		System.out.printf("r : %.2f\n", this.r);
		System.out.printf("원형의 면적은 %.2f입니다.", super.getArea());
	}
}
