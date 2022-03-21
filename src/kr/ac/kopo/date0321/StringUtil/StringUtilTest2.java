package kr.ac.kopo.date0321.StringUtil;

public class StringUtilTest2 {
	
	public void removeCharMethodTest() {
		System.out.println("removeChar(\"Hello World java\", \'o\') : " + StringUtil.removeChar("Hello World java", 'o'));
		System.out.println("removeChar(\"Hello World java\", \'W\') : " + StringUtil.removeChar("Hello World java", 'W'));
		System.out.println("removeChar(\"Hello World java\", \'l\') : " + StringUtil.removeChar("Hello World java", 'l'));
		System.out.println("removeChar(\"Hello World java\", \'a\') : " + StringUtil.removeChar("Hello World java", 'a'));
	}
	
	public void checkCharMethodTest() {
		System.out.println("checkChar(\"Hello World java\", \'o\') : " + StringUtil.checkChar("Hello World java", 'o'));
		System.out.println("checkChar(\"Hello World java\", \'W\') : " + StringUtil.checkChar("Hello World java", 'W'));
		System.out.println("checkChar(\"Hello World java\", \'l\') : " + StringUtil.checkChar("Hello World java", 'l'));
	}
	
	public void toLowerStringMethodTest() {
		System.out.println("toLowerString(\"Hello World!!!\") : " + StringUtil.toLowerString("Hello World!!!"));
	}

	public void toUpperStringMethodTest() {
		System.out.println("toUpperString(\"Hello World!!!\") : " + StringUtil.toUpperString("Hello World!!!"));
	}

	public void reverseStringMethodTest() {
		System.out.println("reverseString(\"Hello World!!!\") : " + StringUtil.reverseString("Hello World!!!"));
	}

	public void minMethodTest() {
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);

		System.out.printf("%d와 %d 중에 %d(이)가 더 작다\n", num1, num2, StringUtil.min(num1, num2));
	}

	public void maxMethodTest() {
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);

		System.out.printf("%d와 %d 중에 %d(이)가 더 크다\n", num1, num2, StringUtil.max(num1, num2));
	}

	public void isLowercharMethodTest() {

		System.out.print("LowerChar([a-z]) : ");
		boolean result = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!StringUtil.isLowerChar(ch)) {
				result = false;
				break;
			}
		}
		System.out.println(result);

		System.out.print("UpperChar([A-Z]) : ");
		result = true;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (!StringUtil.isLowerChar(ch)) {
				result = false;
				break;
			}
		}
		System.out.println(result);
	}

	public void isUpperCharMethodTest() {

		System.out.print("UpperChar([A-Z]) : ");
		boolean result = true;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (!StringUtil.isUppperChar(ch)) {
				result = false;
				break;
			}
		}
		System.out.println(result);

		System.out.print("UpperChar([a-z]) : ");
		result = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!StringUtil.isUppperChar(ch)) {
				result = false;
				break;
			}
		}
		System.out.println(result);
	}
}
