package 분해합;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		Solution solution = new Solution();
		System.out.println(solution.solution(input));
	}
}


class Solution {
	int solution(int input) {
		int answer=0;
		
		for(int a=1; a<input; a++) {
			int eachSum = 0;
			int temp1A = a;
			int temp2A = a;
			while(temp1A>0) {
				eachSum += temp1A%10;
				temp1A/=10;
			}
			if((temp2A+eachSum) == input) {
				answer = temp2A;
				break;
			}
		}
		
		return answer;
	}
}