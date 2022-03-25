package kr.ac.kopo.date0325;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
	로또 게임
	게임수를 입력하세요 : 3
	게임 1 : [2, 6, 13, 25, 20, 7]
	게임 2 : [2, 9, 3, 7, 38, 13]
	게임 3 : [40, 10, 38, 39, 42, 18]
	
	// 중복되지 않은 6개의 숫자를 출력하는 방법을 5개 만들기
	// 예외처리, ... 등등
	

 */

@SuppressWarnings("serial")
class InsertSameNumberException extends Exception {

	public InsertSameNumberException() {
		super();
	}

}

public class LottoUtil {

	Scanner sc = new Scanner(System.in);

	public void start() {

		// 게임수 입력
		int cnt = getInt("게임 수를 입력하세요 : ");
		for (int i = 0; i < cnt; i++) {
			System.out.println("게임 " + i + " : " + Arrays.toString(getNumbers()));
		}

	}

	private int[] getNumbers() {

		// 1 ~ 45 사이의 로또번호 6개 추출
		int solution = (int) (Math.random() * 10) % 5 + 1;
		System.out.println("방법 : " + solution);

		switch (solution) {
		case 1: {
			// 1. Set 사용
			Set<Integer> set = new HashSet<>();
			Random random = new Random();
			while (set.size() < 6) {
				int num = random.nextInt(45) + 1;
				set.add(num);
			}
			return Arrays.stream(set.toArray()).mapToInt(o -> (int) o).toArray();
		}
		case 2: {
			// 2. ArrayList 사용
			ArrayList<Integer> arrayList = new ArrayList<>();
			Random random = new Random();
			while (arrayList.size() < 6) {
				int num = random.nextInt(45) + 1;
				if (!arrayList.contains(num))
					arrayList.add(num);
			}

			return Arrays.stream(arrayList.toArray()).mapToInt(o -> (int) o).toArray();
		}
		case 3: {
			// 3. for/if문 사용
			int[] arr = new int[6];
			for (int i = 0; i < arr.length; i++) {
				int num = ((int) (Math.random() * 100)) % 45 + 1;
				boolean bool = true;
				for (int j = 0; j < i; j++) {
					if (arr[j] == num) {
						i--;
						bool = false;
						break;
					}
				}
				if (bool)
					arr[i] = num;
			}

			return arr;
		}
		case 4: {
			// 4. Exception 사용
			ArrayList<Integer> arrayList = new ArrayList<>();
			Random random = new Random();
			for (int i = 0; i < 6; i++) {
				int num = random.nextInt(45) + 1;
				try {
					if (arrayList.contains(num))
						throw new InsertSameNumberException();
				} catch (InsertSameNumberException e) {
					i--;
				}
				arrayList.add(num);
			}

			return Arrays.stream(arrayList.toArray()).mapToInt(o -> (int) o).toArray();
		}
		case 5: {
			// 5. Set + hashcode로 랜덤값 생성
			Set<Integer> set = new TreeSet<>();
			int hash = System.identityHashCode(set);
			while (set.size() < 6) {
				set.add(hash % 45 + 1);
				hash /= 13;
			}

			return Arrays.stream(set.toArray()).mapToInt(o -> (int) o).toArray();
		}
		}
		return null;
	}

	private int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
}
