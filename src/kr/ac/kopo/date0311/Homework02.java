package kr.ac.kopo.date0311;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1 - 100 사이의 정수를 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("2 - 10 사이의 정수를 입력 : ");
		int num2 = sc.nextInt();

		System.out.printf("\n<1 ~ %d 사이의 %d의 배수를 제외한 정수 출력>\n", num1, num2);
		for (int cnt = 1; cnt <= num1; cnt++) {
			if (cnt % num2 != 0)
				System.out.print(cnt + " ");
		}
		System.out.println();

		System.out.printf("\n<1 ~ %d 사이의 %d의 배수를 제외한 정수 5개씩 출력>\n", num1, num2);
		int enterCnt = 0;
		for (int cnt = 1; cnt <= num1; cnt++) {
			if (cnt % num2 != 0) {
				System.out.printf("%2d ", cnt);
				enterCnt++;
				if (enterCnt % 5 == 0)
					System.out.println();
			}
		}

		sc.close();
	}
}
