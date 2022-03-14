package kr.ac.kopo.date0314;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력
		int[] arr = new int[5];
		int index = 0;

		System.out.print("1번째 정수 : ");
		arr[index++] = sc.nextInt();

		while (index < arr.length) {

			System.out.print((index + 1) + "번째 정수 : ");
			int num = sc.nextInt();

			if (num > arr[index - 1]) // 현재 입력값이 직전 입력값보다 큰지 확인
				arr[index++] = num;
			else {
				System.out.print("  ");
				for (int i = 0; i < index - 1; i++)
					System.out.print(arr[i] + ", ");
				System.out.println(arr[index - 1] + "보다 큰 수가 와야합니다");
			}

		}

		// 결과 출력
		System.out.println();
		System.out.println("< PRINT >");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		/* REVERSE */
		// reverse 계산
		int[] reverse = new int[5];
		for (int i = 0; i < arr.length; i++) {

			int num = arr[arr.length - 1 - i];
			while (num != 0) {
				reverse[i] *= 10;
				reverse[i] += (num % 10);
				num /= 10;
			}

		}

		// 결과 출력
//		System.out.println(Arrays.toString(reverse));
		System.out.println("< REVERSE >");
		for (int i : reverse) {
			System.out.print(i + " ");
		}

		sc.close();

	}
}
