package kr.ac.kopo.date0314;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수 입력
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "\'s num : ");
			arr[i] = sc.nextInt();
		}

		// 차례로 출력 & sum 값 출력
		System.out.println();
		System.out.println("< PRINT >");
		int sum = 0;
		for (int i : arr) {
			System.out.print(i + " ");
			sum += i;
		}

		System.out.println("\n");
		System.out.println("총합 : " + sum);
		
		sc.close();
		
	}
}
