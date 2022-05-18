package 피보나치수열;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input1 = Integer.parseInt(scanner.nextLine());
		String inputString1 = scanner.nextLine();
		String[] inputS1 = inputString1.split(" ");
		int[] inputs1 = new int[input1];
		
		for(int i=0; i<inputS1.length; i++) {
			inputs1[i] = Integer.parseInt(inputS1[i]);
		}
		
		int input2 = Integer.parseInt(scanner.nextLine());
		String inputString2 = scanner.nextLine();
		String[] inputS2 = inputString2.split(" ");
		int[] inputs2 = new int[input2];
		
		for(int i=0; i<inputS2.length; i++) {
			inputs2[i] = Integer.parseInt(inputS2[i]);
		}
		
		int[] listCheck = new int[inputS2.length];
		
		for(int i=0; i<inputs1.length; i++) {
			for(int j=0; j<inputs2.length; j++) {
				if(inputs1[i] == inputs2[j]) {
					listCheck[j] = 1;
				}
			}
		}
		for(int i=0; i<listCheck.length; i++) {
			System.out.println(listCheck[i]);
		}
		
	}
}

class Solution {
	int solution(int input) {
		int answer=0;
		
		
		return answer;
	}
}