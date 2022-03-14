package kr.ac.kopo.date0311;

/*
 			col		-	*
*********	9		0	9
-*******	8		1	7
--*****		7		2	5
---***		6		3	3
----*		5		4	1

 */
public class Homework09 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9-i; j++) {
				System.out.print(j < i ? "-" : "*");
			}
			System.out.println();
		}
	}
	
}
