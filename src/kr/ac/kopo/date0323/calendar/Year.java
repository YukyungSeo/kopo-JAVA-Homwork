package kr.ac.kopo.date0323.calendar;

public class Year {

	private int year;
	private Month[] months;

	public Year(int year) {
		this.year = year;
		this.months = new Month[12];
	}

	public void makeYearCalendar() {
		for (int m = 0; m < 12; m++) {
			months[m] = new Month();
			months[m].fillMonthCalendar(year, m);
		}
	}

}
