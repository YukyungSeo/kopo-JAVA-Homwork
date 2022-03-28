package kr.ac.kopo.date0325.ScissorsRockPaper;

public class ScissorsRockPaper implements Game {
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	@Override
	public int startGame(int you) {
		int me = (int) (Math.random() * 3) + 1;

		if (me == you) {
			System.out.println("비겼습니다");
			return 2;
		} else if (me == 1 && you == 3 || me > you) {
			System.out.println("You loss");
			return 0;
		} else {
			System.out.println("You win");
			return 1;
		}

	}

}
