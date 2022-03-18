package kr.ac.kopo.date0318;

public class TestCalculatorMain {

	public static void main(String[] args) {

		/* Calculator Class Test */
		CalculatorView view = new CalculatorView();
		Calculator calculator = new Calculator();
		int num1 = 12; // (int) (Math.random() * 100);
		int num2 = 5; // (int) (Math.random() * 100);

		view.printAdd(num1, num2, calculator.add(num1, num2));
		view.printSub(num1, num2, calculator.sub(num1, num2));
		view.printMul(num1, num2, calculator.mul(num1, num2));
		view.printDiv(num1, num2, calculator.div(num1, num2));
		
		view.printIsPrime(num1, calculator.isPrime(num1));
		view.printIsPrime(num2, calculator.isPrime(num2));
	}
}
