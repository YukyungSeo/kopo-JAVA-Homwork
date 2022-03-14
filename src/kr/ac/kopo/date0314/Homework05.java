package kr.ac.kopo.date0314;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[] { 1, 2, 3, 4, 5 };
		int len = num.length;

		// 방향과 index 입력
		System.out.print("Left(-), Right(+) : ");
		char direction = sc.next().charAt(0);
		System.out.print("Start Index(0 - 4) : ");
		int index = sc.nextInt();

		// 계산 및 결과 출력
		System.out.println();
		System.out.println("< PRINT >");
		switch (direction) {
		case '+': {
			for (int i = 0; i < len; i++) {
				System.out.print(num[(i + index) % len] + " ");
			}
			break;
		}
		case '-': {
			for (int i = len; i > 0; i--) {
				System.out.print(num[(i + index) % len] + " ");
			}
			break;
		}
		}

		sc.close();

	}
}
