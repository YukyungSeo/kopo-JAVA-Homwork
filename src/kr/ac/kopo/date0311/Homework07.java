package kr.ac.kopo.date0311;

public class Homework07 {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan += 3) {
			for (int value = 1; value < 10; value++) {
				for (int i = 0; i < 3; i++) {
					if (dan + i < 10)
						System.out.printf("%d * %d = %2d\t", dan + i, value, ((dan + i) * value));
				}
				System.out.println();
			}
			System.out.println();

		}
		
		// 최적화 시도 중..
		for (int dan = 2; dan <= 9; dan += 3) {
			for (int i = 1; i < 30; i++) {
				int value = i%3 + 1;
				if (dan + i < 10)
					System.out.printf("%d * %d = %2d\t", dan + i, value, ((dan + i) * value));
			}
			System.out.println();

		}
	}
}
