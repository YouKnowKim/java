package homework09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoUtil {

	public void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("게임 수 입력 : ");
		int cnt = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < cnt; i++) {
			System.out.println("게임" + (i + 1) + " : " + Arrays.toString(getNumbers5()));
		}
	}

	// Random 클래스 사용
	private int[] getNumbers1() {
		int[] arr = new int[6];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
				}
			}
		}

		return arr;
	}

	// Math클래스 사용
	private int[] getNumbers2() {
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
				}
			}
		}

		return arr;
	}

	// 셔플
	private int[] getNumbers3() {
		int[] shuffle = new int[45];
		int[] arr = new int[6];

		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = (i + 1);
		}

		for (int i = 0; i < shuffle.length; i++) {
			int j = (int) (Math.random() * (45 - i)) + i;
			swap(shuffle, i, j);
		}
		System.arraycopy(shuffle, 0, arr, 0, arr.length);

		return arr;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// Set
	private int[] getNumbers4() {
		int[] arr = new int[6];
		Set<Integer> set = new HashSet<Integer>();

		while (set.size() < 6) {
			Integer j = (int) (Math.random() * 45) + 1;
			set.add(j);
		}
		int i = 0;
		for (Object obj : set) {
			arr[i] = (Integer) obj;
			i++;
		}

		return arr;
	}

	// 모든 경우의 수에서 하나 고르기
	private int[] getNumbers5() {
		int[] lottoArray = new int[45];
		boolean[] visited = new boolean[lottoArray.length];
		int n = lottoArray.length;
		int r = 6;
		List<int[]> list = new ArrayList<int[]>();
		
		for(int i=0; i<lottoArray.length; i++) {
			lottoArray[i] = (i+1);
		}
		
		combination(lottoArray, visited, 0, n, r, list);
		int[] temp = list.get((int)(Math.random()*list.size()));
		return temp;
	}

	private void combination(int[] arr, boolean[] visited, int depth, int n, int r, List<int[]> al) {
		if (r == 0) {
			al.add(getCases(arr, visited));
			return;
		}
		if (depth == arr.length) {
			return;
		} else {
			visited[depth] = true;
			combination(arr, visited, depth + 1,n, r - 1, al);

			visited[depth] = false;
			combination(arr, visited, depth + 1,n, r, al);
		}
	}

	private int[] getCases(int[] arr, boolean[] visited) {
		int[] newArr = new int[6];
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true && arr[i]!=0) {
				newArr[j] = arr[i];
				j++;
			}
		}
		return newArr;
	}
}
