package kr.ac.kopo.date0318;

public class Calculator {

	int add(int num1, int num2) {
		return num1 + num2;
	}

	int sub(int num1, int num2) {
		return num1 - num2;
	}

	int mul(int num1, int num2) {
		return num1 * num2;
	}

	double div(double num1, double num2) {
		return num1 / num2;
	}

	boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
