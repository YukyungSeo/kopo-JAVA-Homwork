package kr.ac.kopo.date0314;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		// 정수 입력
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "\'s num : ");
			arr[i] = sc.nextInt();
		}

		// 짝수 홀수 분리
		int evenSum = 0, oddSum = 0;
		String evenList = "", oddList = "";
		
		for (int i : arr) {
			if(i%2 == 0) {
				evenSum += i;
				evenList += i + " ";
			} else  {
				oddSum += i;
				oddList += i + " ";
			}
		}

		// 결과 출력
		System.out.println();
		System.out.println("< 짝수 >");
		System.out.println(evenList);
		System.out.println("짝수의 총합 : " + evenSum);

		System.out.println();
		System.out.println("< 짝수 >");
		System.out.println(oddList);
		System.out.println("홀수의 총합 : " + oddSum);
		
		sc.close();
		
	}
}
