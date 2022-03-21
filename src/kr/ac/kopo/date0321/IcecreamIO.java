package kr.ac.kopo.date0321;

import java.util.Scanner;

class IcecreamIO {

	static Scanner sc = new Scanner(System.in);

	public static char getAnAnswerToContinue() {
		System.out.print("계속 주문하시겠습니가(yes:Y/y, no:N/n)? => ");
		return sc.nextLine().charAt(0);
	}

	public static int getIcecreamCount() {
		System.out.print("아이스크림 몇개 구입할꺼야? => ");
		return Integer.parseInt(sc.nextLine());
	}

	public static String getIcecreamName() {
		System.out.print("아이스크림명 : ");
		return sc.nextLine();
	}

	public static int getIcecreamPrice() {
		System.out.print("아이스크림가격 : ");
		return Integer.parseInt(sc.nextLine());
	}

	public static void headlineGetIcecreamInfo(int num) {
		System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", num);
	}

	public static void headlinePrintIcecreamInfo(int num) {
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", num);
		System.out.println("번호\t아이스크림명\t가격");
	}

	public static void printIcecreamInfo(int num, String name, int price) {
		System.out.println(num + "\t" + name + "\t\t" + price);
	}

	public static void printSumOfIcecreamPrice(int sum) {
		System.out.println("총 판매액 : " + sum + "원");
	}
}
