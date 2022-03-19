package homework05;

public class Calculator {

	public static int addition(int i, int j) {
		return i+j;
	}
	
	public static int subtraction(int i, int j) {
		return i-j;
	}
	
	public static int multiplication(int i, int j) {
		return i*j;
	}
	
	public static double division(int i, int j) {
		return (double)i/(double)j;
	}
	
	public static void printCheckPrimeNumber(int i, int j) {
		boolean checkI=true;
		boolean checkJ=true;
		
		checkI = i==1 ? false : true;
		checkJ = j==1 ? false : true;
		
		for(int k=2; k<=Math.sqrt(i); k++) {
			if(i%k==0)
				checkI=false;
		}
		
		for(int k=2; k<=Math.sqrt(j); k++) {
			if(j%k==0)
				checkJ=false;
		}
		
		System.out.printf("%d 소수체크 : %b\n",i,checkI);
		System.out.printf("%d 소수체크 : %b\n",j,checkJ);
	}
	
}
