package kr.ac.kopo.date0318;

public class CalculatorIO {

	public void printAdd(int num1, int num2, int result) {
		System.out.printf("%d + %d = %d\n", num1, num2, result);
	}
	
	public void printSub(int num1, int num2, int result) {
		System.out.printf("%d - %d = %d\n", num1, num2, result);
	}
	
	public void printMul(int num1, int num2, int result) {
		System.out.printf("%d * %d = %d\n", num1, num2, result);
	}
	
	public void printDiv(int num1, int num2, double result) {
		System.out.printf("%d / %d = %.2f\n", num1, num2, result);
	}
	
	public void printIsPrime(int num, boolean bool) {
		System.out.printf("%2d 소수체크 : %b\n", num, bool);
	}
}
