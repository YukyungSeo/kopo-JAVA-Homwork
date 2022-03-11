package kr.ac.kopo.date0311;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("2 - 9 단을 입력 : ");
		int dan = sc.nextInt();
		
		System.out.printf("*** %d단 ***\n", dan);
		for (int value = 1; value < 10; value++) {
			System.out.printf("%d * %d = %d\n", dan, value, (dan*value));
		}
		
		sc.close();
	}
}
