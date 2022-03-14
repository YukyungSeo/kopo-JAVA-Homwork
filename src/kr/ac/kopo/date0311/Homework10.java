package kr.ac.kopo.date0311;

/*
			*	-		*
*-------*	0	1-7		8	
**-----**	1	2-6		7
***---***	2	3-5		6
****-****	3	4		5
*********	4	-		4
****-****	3	4		5
***---***	2	3-5		6
**-----**	1	2-6		7
*-------*	0	1-7		8

 */
public class Homework10 {

	public static void main(String[] args) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i < 5) {
					System.out.print(i < j && j + i <= 7 ? "-" : "*");
				} else {
					System.out.print(i > j && i + j >= 9 ? "-" : "*");
				}
			}
			System.out.println();
		}
	}

}
