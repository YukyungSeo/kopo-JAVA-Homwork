package kr.ac.kopo.date0321.AreaCalculation;

class Circle extends Shape {
	
	public Circle() {
		super();
	}
	
	public Circle(double x) {
		super(x); // 지름
	}
	
	@Override
	public void valueOfArea() {
		super.setArea(super.getX() * super.getX() / 4 * Math.PI);
	}
	
	@Override
	public void printArea() {
		System.out.printf("x : %.2f\n", this.x);
		System.out.printf("원형의 면적은 %.2f입니다.", super.getArea());
	}
}
