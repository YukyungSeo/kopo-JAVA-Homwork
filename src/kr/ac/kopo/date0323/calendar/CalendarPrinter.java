package kr.ac.kopo.date0323.calendar;

import java.util.Calendar;

public class CalendarPrinter {

	private CalendarIO view = new CalendarIO();

	public void start() {

		while (true) {
			int menu = this.view.inputMenu();

			if (menu == 1) {
				this.makeYearCalendar(this.view.inputYear());
			} else if (menu == 2) {
				this.makeMonthCalendar(this.view.inputYear(), view.inputMonth());
			} else if (menu == 3)
				break;

		}
	}

	private void makeYearCalendar(int year) {
		for (int m = 0; m < 12; m++) {
			makeMonthCalendar(year, m);
		}
	}

	private void makeMonthCalendar(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, 1);

		this.view.printMonthHeadline(year, month);
		this.view.printMonth(c);
	}

}
