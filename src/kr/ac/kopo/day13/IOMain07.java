package kr.ac.kopo.day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.ac.kopo.util.FileClose;

/*
 *  iotest/IOMain05.java -> IOMain05.java.txt 복사
 */
public class IOMain07 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			
			fr = new FileReader("iotest/IOMain05.java");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("iotest/IOMain05.java.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			while(true){
				String data = br.readLine();
				if(data ==null) break;
				pw.println(data);
			}
			pw.flush();
			System.out.println("파일 복사 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br);
			FileClose.close(fr);
			FileClose.close(bw);
			FileClose.close(fw);
			FileClose.close(pw);
		}
		
	}
}










