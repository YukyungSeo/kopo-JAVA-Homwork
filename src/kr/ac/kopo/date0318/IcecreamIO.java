package kr.ac.kopo.date0318;

import java.util.Scanner;

public class IcecreamIO {

	Scanner sc = new Scanner(System.in);

	int getIcecreamCount() {
		System.out.print("아이스크림 몇개 구입할꺼야? => ");
		return Integer.parseInt(sc.nextLine());
	}

	public String getIcecreamName() {
		System.out.print("아이스크림명 : ");
		return sc.nextLine();
	}

	public int getIcecreamPrice() {
		System.out.print("아이스크림가격 : ");
		return Integer.parseInt(sc.nextLine());
	}

	public void headlineGetIcecreamInfo(int num) {
		System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", num);
	}

	public void headlinePrintIcecreamInfo(int num) {
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", num);
		System.out.println("번호\t아이스크림명\t가격");
	}

	public void printIcecreamInfo(int num, Icecream icecream) {
		System.out.println(num + "\t" + icecream.getName() + "\t\t" + icecream.getPrice());
	}

	public void printSumOfIcecreamPrice(int sum) {
		System.out.println("총 판매액 : " + sum + "원");
	}
}
