package kr.ac.kopo.date0325;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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
			int[] lottoNums = getNumbers();
			System.out.println("게임 " + i + " : " + Arrays.toString(lottoNums));
			this.checkError(lottoNums);
		}

	}
	
	private void checkError(int[] arr) {
		// 6개가 아닐 경우 error
		if (arr.length != 6)
			System.out.println("error");
		
		// 중복된 값이 있을 경우 error
		Set<Integer> set = new HashSet<>();
		for (int i : arr) {
			// 뽑힌 숫자가 1~45가 아니면 error
			if(i < 1 || i > 45)
				System.out.println("error");
			set.add(i);
		}
		if (set.size() < 6)
			System.out.println("error");
	}

	private int[] getNumbers() {

		// 1 ~ 45 사이의 로또번호 6개 추출
		int solution = (int) (Math.random() * 10) % 5 + 1;
		System.out.println("방법 : " + solution);

		switch (solution) {
		case 1: {
			// 1. HashSet 사용
			Set<Integer> set = new HashSet<>();
			Random random = new Random();
			while (set.size() < 6) {
				int num = random.nextInt(45) + 1;
				set.add(num);
			}
			
			int[] nums = new int[6];
			int i = 0;
			for (int num : set) {
				nums[i++] = num;
			}
			return nums;
//			return Arrays.stream(set.toArray()).mapToInt(o -> (int) o).toArray();
		}
		case 2: {
			// 2. ArrayList 사용
			List<Integer> arr = new ArrayList<>();
			Random random = new Random();
			while (arr.size() < 6) {
				int num = random.nextInt(45) + 1;
				if (!arr.contains(num))
					arr.add(num);
			}

			int[] nums = new int[6];
			int i = 0;
			for (int num : arr) {
				nums[i++] = num;
			}
			return nums;
//			return Arrays.stream(arr.toArray()).mapToInt(o -> (int) o).toArray();
		}
		case 3: {
			// 3. int[] + for/if문 사용
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
			// 4. LinkedList + Exception 사용
			List<Integer> arr = new LinkedList<>();
			Random random = new Random();
			while (arr.size() < 6) {
				int num = random.nextInt(45) + 1;
				try {
					if (arr.contains(num))
						throw new InsertSameNumberException();
					arr.add(num);
				} catch (InsertSameNumberException e) {

				}
			}

			return Arrays.stream(arr.toArray()).mapToInt(o -> (int) o).toArray();
		}
		case 5: {
			// 5. TreeSet + hashcode로 랜덤값 생성
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
