package 단어공부;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().toLowerCase();
		char[] alphabets = new char[30];
		int[] checkList = new int[30];
		char ab = 'a';
		int i=0;
		while(ab <= 'z') {
			alphabets[i] = ab;
			i++;
			ab = (char)(ab+1);
		}
		
		for(int j=0; j<str.length(); j++) {
			for(char x : alphabets) {
				
			}
		}
		
		
//		Map<String,Integer> map = new HashMap<String,Integer>();
//		Set<String> set = new HashSet<String>();
//		
//		for(int i=0; i<str.length(); i++) {
//			set.add(str.charAt(i)+"");
//		}
//		
//		for(String s : set) {
//			map.put(s, 0);
//		}
//		
//		for(int i=0; i<str.length(); i++) {
//			if(map.containsKey(str.charAt(i)+"")) {
//				map.put(str.charAt(i)+"", map.get(str.charAt(i)+"")+1);
//			}
//		}
//		for(String s : map.keySet()) {
//			System.out.println(s + " : " + map.get(s));
//		}
	}
}




