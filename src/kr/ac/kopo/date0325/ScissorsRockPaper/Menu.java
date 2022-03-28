package kr.ac.kopo.date0325.ScissorsRockPaper;

import java.util.Scanner;

public class Menu {

	private static Scanner sc = new Scanner(System.in);

	public void process() {

		int[] result = new int[3];

		loop: while (true) {

			char selection = getChar("게임을 선택하세요\n\tA. 가위바위보\n\tB. 주사위 값 맞추기\n\tC. 종료\n");

			switch (selection) {
			case 'A':
				ScissorsRockPaper srp = new ScissorsRockPaper();
				println("가위바위보 게임입니다.");
				int r = srp.startGame(getInt("가위바위보중 하나를 선택하세요.\n(1:가위,2:바위,3.보)\n"));
				result[r] += 1;
				break;
			case 'B':
				Dice dice = new Dice();
				println("주사위 값 맞추기 게임입니다.");
				r = dice.startGame(getInt("주사위를 선택하세요(1~6값 중 하나)\n"));
				result[r] += 1;
				break;
			case 'C':
				println("게임을 종료합니다");
				printResult(result);
				break loop;
			default:
				println("다시 입력하세요");
				break;
			}

		}

	}

	private void printResult(int[] result) {
		println("당신의 게임 전적은 " + result[1] + "승 " + result[0] + "패 " + result[2] + "무입니다");
	}

	private int getInt(String msg) {
		print(msg);
		return Integer.parseInt(sc.nextLine());
	}

	private char getChar(String msg) {
		print(msg);
		return sc.nextLine().charAt(0);
	}

	private void print(String msg) {
		System.out.print(msg);
	}

	private void println(String msg) {
		System.out.println(msg);
	}
}
