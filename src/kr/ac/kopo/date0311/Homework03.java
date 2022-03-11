package kr.ac.kopo.date0311;

public class Homework03 {

	public static void main(String[] args) {

		int deep = 100;
		int point = 0;
		int speed = 5;
		int slide1 = 1;
		int slide2 = 2;

		for (int time = 1; point < deep; time++) {

			point += speed;
			if (point < 50)
				point -= slide1;
			else
				point -= slide2;
			
			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %d\n", time, point);
		}

	}
}
