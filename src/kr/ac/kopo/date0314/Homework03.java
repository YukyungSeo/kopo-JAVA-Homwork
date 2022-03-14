package kr.ac.kopo.date0314;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 짝수 입력
		int[] arr = new int[5];
		int index = 0;
		
		while (index < arr.length) {
			
			System.out.print((index + 1) + "\'s 정수 : ");
			int num = sc.nextInt();
			if (num % 2 == 0)
				arr[index++] = num;
		}

		// 결과 출력
		System.out.println();
		System.out.println("< 5개의 정수 출력 >");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		sc.close();

	}
}
