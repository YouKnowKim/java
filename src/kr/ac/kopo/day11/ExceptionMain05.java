package kr.ac.kopo.day11;

import java.io.FileReader;

public class ExceptionMain05 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		for(int i=0; i<5; i++) {
			try {
				if(i==3) {
					FileReader fr = new FileReader("a.txt");					
				}
				
			} catch(Exception e){
				e.printStackTrace();
				break;
			} finally {
				System.out.println("end loop...");
			}
			System.out.println("loop...");
		}
		
		System.out.println("main end...");
	}
}
