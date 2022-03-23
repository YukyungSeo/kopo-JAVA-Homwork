package kr.ac.kopo.date0323.calendar;

import java.util.Scanner;

public class CalendarIO {

	private Scanner sc = new Scanner(System.in);

	public int inputMenu() {
		System.out.println("원하는 항목을 선택하세요(1.특정년도 2.특정월  3.종료) => ");
		return Integer.parseInt(sc.nextLine());
	}

	public int inputYear() {
		System.out.println("년도를 입력하세요 :  ");
		return Integer.parseInt(sc.nextLine());
	}

	public int inputMonth() {
		System.out.println("월을 입력하세요 :  ");
		return Integer.parseInt(sc.nextLine());
	}

	public void printOneYear() {

	}

	public void printOneMonth() {
		System.out.println(" < %d년 %d월 >");
	}
}
