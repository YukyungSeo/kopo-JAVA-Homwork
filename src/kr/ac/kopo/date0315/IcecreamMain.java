package kr.ac.kopo.date0315;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇개 구입할꺼야? => ");
		int num = sc.nextInt();
		System.out.println();

		// 입력
		Icecream[] icecreams = new Icecream[num];
		for (int i = 0; i < num; i++) {
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i + 1);
			icecreams[i] = new Icecream();

			System.out.print("아이스크림명 : ");
			icecreams[i].name = sc.next();
			System.out.print("아이스크림가격 : ");
			icecreams[i].price = sc.nextInt();

			System.out.println();
		}
		System.out.println();

		// 출력
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", num);
		System.out.println("번호\t아이스크림명\t가격");
		for (int i = 0; i < icecreams.length; i++) {
			System.out.printf("%d\t%s\t\t%d\n", i + 1, icecreams[i].name, icecreams[i].price);
		}

		sc.close();
	}
}
