package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain06 {

	public static void main(String[] args) {

		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}
		a();
	}

	public static void b() throws FileNotFoundException {

		FileReader fr = new FileReader("a.txt");
	}

	public static void a() {

		try {
			String str = null;
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
	}
}
