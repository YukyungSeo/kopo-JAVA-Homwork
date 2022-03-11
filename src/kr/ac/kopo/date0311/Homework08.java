package kr.ac.kopo.date0311;

public class Homework08 {

	public static void main(String[] args) {

		// 반복문 5개, 조건문 1개
//		for (int i = 0; i < 9; i++) {
//			if (i < 5) {
//				for (int j = 0; j < i; j++) {
//					System.out.print("-");
//				}
//				for (int j = 0; j < 5 - i; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			} else {
//				for (int j = 0; j < 8 - i; j++) {
//					System.out.print("-");
//				}
//				for (int j = 0; j < i - 3; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}

		// 반복문 3개, 조건문 3개
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				if (i < 5)
					System.out.print(j < i ? "-" : "*");
				else
					System.out.print(j < j-i ? "-" : "*");
			}
			System.out.println();
		}
	}
}
