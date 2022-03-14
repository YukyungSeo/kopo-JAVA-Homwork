package kr.ac.kopo.date0311;

public class Homework07 {

	public static void main(String[] args) {

		// 방법 1
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

		// 방법 2
		for (int row = 0; row < 27; row++) {
			for (int col = 0; col < 3; col++) {
				int dan = (col + 2) + (row / 9 * 3); // 2+0, 2+3 2+6
				int value = row % 9 + 1;
				int result = dan * value;
				if (dan < 10)
					System.out.printf("%d * %d = %2d\t", dan, value, result);
			}
			System.out.println();
		}
	}
}
