package kr.ac.kopo.date0310;

import java.util.Scanner;

public class Operator {
	static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("-----------one-----------");
		one();

		System.out.println("-----------two-----------");
		two();

		System.out.println("-----------three-----------");
		three();

		System.out.println("-----------four-----------");
		four();

		System.out.println("-----------five-----------");
		five();

		System.out.println("-----------six-----------");
		six();
	}

	public static void one() {
		System.out.println("A : " + (int) 'A');
		System.out.println("E : " + (int) 'E');
		System.out.println("I : " + (int) 'I');
		System.out.println("O : " + (int) 'O');
		System.out.println("U : " + (int) 'U');
	}

	public static void two() {
		System.out.print("total 초를 입력하세요 : ");
		int totalSec = SC.nextInt();
		int hour = totalSec / 3600;
		int min = (totalSec % 3600) / 60;
		int sec = (totalSec % 3600) % 60;

		if (hour != 0)
			System.out.print(hour + "시 ");
		if (min != 0)
			System.out.print(min + "분 ");
		if (sec != 0)
			System.out.print(sec + "초 ");
		System.out.println();
	}

	public static void three() {
		System.out.print("반지름을 입력하세요 : ");
		int r = SC.nextInt();

		System.out.printf("원의 면적은 %f 입니다.\n", r * r * Math.PI);
	}

	public static void four() {
		System.out.print("정수를 입력하세요 : ");
		int num1 = SC.nextInt();
		System.out.print("나눌 수를 입력하세요 : ");
		int num2 = SC.nextInt();

		System.out.println("몫 : " + num1 / num2);
		System.out.println("나머지 : " + num1 % num2);
	}

	public static void five() {
		System.out.print("달러를 입력하세요 : ");
		int doller = SC.nextInt();

		System.out.printf("원화 : %.2f\n", doller * 1092.50);
	}

	public static void six() {
		System.out.println("개수 : " + (('Z' - 'A' + 1) + ('z' - 'a' + 1)));
	}
}
