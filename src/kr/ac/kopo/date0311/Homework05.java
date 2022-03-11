package kr.ac.kopo.date0311;

public class Homework05 {

	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; dan++) {
			
			System.out.printf("*** %d단 ***\n", dan);
			
			for (int value = 1; value < 10; value++) {
				System.out.printf("%d * %d = %d\n", dan, value, (dan*value));
			}
			System.out.println();
			
		}
	}
}
