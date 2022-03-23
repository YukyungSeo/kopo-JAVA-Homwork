package kr.ac.kopo.date0323.calendar;

import java.util.Calendar;

public class Month {

	private int[][] calendar;

	public Month() {

//		c.set(view.inputYear(), Calendar.JANUARY, 1);
//
//		String pattern = "yyyy년도 MM월 dd일 (E요일)";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		System.out.println(sdf.format(c.getTime()));
	}

	public void fillMonthCalendar(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, 1);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int lastDate = c.getActualMaximum(Calendar.DATE);

		int weekCnt = (lastDate + day) / c.getActualMaximum(Calendar.DAY_OF_MONTH);
		this.calendar = new int[7][weekCnt];

		int date = 1;
		while (date <= c.getActualMaximum(Calendar.DAY_OF_MONTH)) {
//			this.calendar[][] = date;
			date++;
		}
	}

}

//public static final int JANUARY = 0;
//public static final int FEBRUARY = 1;
//public static final int MARCH = 2;
//public static final int APRIL = 3;
//public static final int MAY = 4;
//public static final int JUNE = 5;
//public static final int JULY = 6;
//public static final int AUGUST = 7;
//public static final int SEPTEMBER = 8;
//public static final int OCTOBER = 9;
//public static final int NOVEMBER = 10;
//public static final int DECEMBER = 11;
