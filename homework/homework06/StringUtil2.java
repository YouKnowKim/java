package homework06;

import java.util.Arrays;

public class StringUtil2 {

	// 1번
	public boolean isUpperCase(char c) {

		if (c >= 'A' && c <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	// 2번
	public boolean isLowerCase(char c) {
		if (c >= 'a' && c <= 'z') {
			return true;
		} else {
			return false;
		}
	}

	// 3번
	public int max(int i, int j) {
		return i > j ? i : j;
	}

	// 4번
	public int min(int i, int j) {
		return i < j ? i : j;
	}

	// 5번
	public String reverseString(String str) {
		char[] reverseStrArray = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			reverseStrArray[i] = str.toCharArray()[str.length() - 1 - i];
		}

		return new String(reverseStrArray);
	}

	// 6번
	public String toUpperString(String str) {
		char[] upperStrArray = new char[str.length()];
		final int diff = 'a' - 'A';
		for (int i = 0; i < str.length(); i++) {
			char character = str.toCharArray()[i];
			if (character >= 'a' && character <= 'z') {
				upperStrArray[i] = (char) (character - diff);
			} else {
				upperStrArray[i] = character;
			}

		}
		return new String(upperStrArray);
	}
	
	// 7번
	public String toLowerString(String str) {
		char[] upperStrArray = new char[str.length()];
		final int diff = 'a' - 'A';
		for (int i = 0; i < str.length(); i++) {
			char character = str.toCharArray()[i];
			if (character >= 'A' && character <= 'Z') {
				upperStrArray[i] = (char) (character + diff);
			} else {
				upperStrArray[i] = character;
			}

		}
		return new String(upperStrArray);
	}
	
	public static int checkChar(String strData, char ch) {
		char[] charArray = strData.toCharArray();
		int count = 0;
		for(int i=0; i<charArray.length; i++) {
			if(ch==charArray[i]) {
				count++;
			}
		}
		return count;
	}
	
	public static String removeChar(String oriStr, char delChar) {
		char[] charArray = oriStr.toCharArray();
		int[] checkArray = new int[charArray.length];
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i]==delChar) {
				checkArray[i]=1;
			}
		}
		char[] newCharArray = new char[charArray.length];
		
		int i=0;
		int j=0;
		while(i<charArray.length) {
			if(checkArray[i]==0) {
				newCharArray[j]=charArray[i];
				j++;
			}
			i++;
		}
		
		return new String(newCharArray);
	}
	

}
