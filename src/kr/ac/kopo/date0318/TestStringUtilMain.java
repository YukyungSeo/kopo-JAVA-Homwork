package kr.ac.kopo.date0318;

public class TestStringUtilMain {

	public static void main(String[] args) {

		/* StringUtil Class Test */
		StringUtil su = new StringUtil();

		isUpperCharMethodTest(su);
		isLowercharMethodTest(su);
		maxMethodTest(su);
		minMethodTest(su);
		reverseStringMethodTest(su);
		toUpperStringMethodTest(su);
		toLowerStringMethodTest(su);
		
	}

	private static void toLowerStringMethodTest(StringUtil su) {
		System.out.println(su.toLowerString("Hello World!!!"));
	}

	private static void toUpperStringMethodTest(StringUtil su) {
		System.out.println(su.toUpperString("Hello World!!!"));
	}

	private static void reverseStringMethodTest(StringUtil su) {
		System.out.println(su.reverseString("Hello World!!!"));
	}

	private static void minMethodTest(StringUtil su) {
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);

		System.out.printf("%d와 %d 중에 %d(이)가 더 작다\n", num1, num2, su.min(num1, num2));
	}

	private static void maxMethodTest(StringUtil su) {
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);

		System.out.printf("%d와 %d 중에 %d(이)가 더 크다\n", num1, num2, su.max(num1, num2));
	}

	private static void isLowercharMethodTest(StringUtil su) {

		System.out.print("LowerChar([a-z]) : ");
		boolean result = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!su.isLowerChar(ch)) {
				result = false;
				break;
			}
		}
		System.out.println(result);

		System.out.print("UpperChar([A-Z]) : ");
		result = true;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (!su.isLowerChar(ch)) {
				result = false;
				break;
			}
		}
		System.out.println(result);
	}

	private static void isUpperCharMethodTest(StringUtil su) {

		System.out.print("UpperChar([A-Z]) : ");
		boolean result = true;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (!su.isUppperChar(ch)) {
				result = false;
				break;
			}
		}
		System.out.println(result);

		System.out.print("UpperChar([a-z]) : ");
		result = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!su.isUppperChar(ch)) {
				result = false;
				break;
			}
		}
		System.out.println(result);
	}
}
