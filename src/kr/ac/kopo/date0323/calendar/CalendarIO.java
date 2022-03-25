package kr.ac.kopo.date0323.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarIO {

	private Scanner sc = new Scanner(System.in);

	public int inputMenu() {
		System.out.print("원하는 항목을 선택하세요(1.특정년도 2.특정월  3.종료) => ");
		return Integer.parseInt(sc.nextLine());
	}

	public int inputYear() {
		System.out.print("년도를 입력하세요 :  ");
		return Integer.parseInt(sc.nextLine());
	}

	public int inputMonth() {
		System.out.print("월을 입력하세요 :  ");
		return Integer.parseInt(sc.nextLine()) - 1;
	}

	public void printMonthHeadline(int year, int month) {
		System.out.printf(" < %d년 %d월 >\n", year, month + 1);
		System.out.println("\t일\t월\t화\t수\t목\t금\t토");
	}

	public void printMonth(Calendar calender) {

		int day1st = calender.get(Calendar.DAY_OF_WEEK);
		int lastDate = calender.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.printf("day1st : %d, lastDate : %d\n", day1st, lastDate);

		int cntDay = 1;
		for (int d = 1; d < lastDate + day1st; d++) {
			if (d >= day1st) {
				System.out.printf("\t%d", cntDay);
				cntDay++;
			} else {
				System.out.print("\t");
			}

			if (d % 7 == 0)
				System.out.println();
		}
		System.out.println("\n");
	}
}
