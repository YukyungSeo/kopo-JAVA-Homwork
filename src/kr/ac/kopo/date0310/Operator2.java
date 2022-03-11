package kr.ac.kopo.date0310;

import java.util.Scanner;

public class Operator2 {
	static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("-----------seven-----------");
		seven();

		System.out.println("-----------eight-----------");
		eight();

		System.out.println("-----------nine-----------");
		nine();

		System.out.println("-----------ten-----------");
		ten();

		System.out.println("-----------eleven-----------");
		eleven();
	}

	public static void seven() {
		System.out.print("입력(알파벳) : ");

		String inputStr = SC.next();
		char c = inputStr.charAt(0);

		if (c < 'a')
			System.out.printf("변경된 값 : %c\n", c + ('a' - 'A'));
		else
			System.out.printf("변경된 값 : %c\n", c - ('a' - 'A'));
	}

	public static void eight() {
		System.out.print("물건값을 입력 : ");
		int price = SC.nextInt();
		System.out.print("지불한 돈의 액수 : ");
		int money = SC.nextInt();

		int change = money - price;

		int thousand = change / 1000;
		change %= 1000;
		System.out.println("1000원 : " + thousand);

		int fiveHundred = change / 500;
		change %= 500;
		System.out.println("500원 : " + fiveHundred);

		int Hundred = change / 100;
		change %= 100;
		System.out.println("100원 : " + Hundred);

		int fifty = change / 50;
		change %= 50;
		System.out.println("50원 : " + fifty);

		int ten = change / 10;
		change %= 10;
		System.out.println("10원 : " + ten);
	}

	public static void nine() {
		System.out.print("보유하고 있는 책권수 : ");
		int booksCnt = SC.nextInt();

		if (booksCnt < 0)
			System.out.println("잘못입력했습니다");
		else if (booksCnt == 0)
			System.out.print("보유하고 있는 책 없음");
		else if (booksCnt == 1)
			System.out.println(booksCnt + " book");
		else
			System.out.println(booksCnt + " books");
	}

	public static void ten() {
		System.out.print("첫번째 정수 : ");
		int num1 = SC.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = SC.nextInt();
		System.out.print("세번째 정수 : ");
		int num3 = SC.nextInt();
		
		if(num1>num2 && num1>num3) {
			if(num2 > num3)
				System.out.printf("%d %d %d\n", num1, num2, num3);
			else
				System.out.printf("%d %d %d\n", num1, num3, num2);
		} else if(num2>num1 && num2>num3) {
			if(num1 > num3)
				System.out.printf("%d %d %d\n", num2, num1, num3);
			else
				System.out.printf("%d %d %d\n", num2, num3, num1);
		} else {
			if(num1 > num2)
				System.out.printf("%d %d %d\n", num3, num1, num2);
			else
				System.out.printf("%d %d %d\n", num3, num2, num1);
		}
	}

	public static void eleven() {
		System.out.print("정수 4개 입력 : ");
		int num1 = SC.nextInt();
		int num2 = SC.nextInt();
		int num3 = SC.nextInt();
		int num4 = SC.nextInt();

		int max1 = num1 > num2 ? num1 : num2;
		int max2 = num3 > num4 ? num3 : num4;
		System.out.println("가장 큰 수 : " + (max1 > max2 ? max1 : max2));
	}
}
