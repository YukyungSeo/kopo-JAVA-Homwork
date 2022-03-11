package kr.ac.kopo.date0311;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("시작단을 입력 : ");
		int start = sc.nextInt();
		System.out.print("종료단을 입력 : ");
		int finish = sc.nextInt();
		
		if (start > finish) {
			int tmp = start;
			start = finish;
			finish = tmp;
		}
		
		for (int dan = start; dan <= finish; dan++) {
			
			System.out.printf("*** %d단 ***\n", dan);
			
			for (int value = 1; value < 10; value++) {
				System.out.printf("%d * %d = %d\n", dan, value, (dan*value));
			}
			System.out.println();
			
		}
		
		sc.close();
	}
}
