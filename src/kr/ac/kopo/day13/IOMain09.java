package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain09 {

	public static void write() {
		
		Icecream ice = new Icecream("월드콘", 2000, "해태");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/object.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ice); // 객체 직렬화 : 객체를 byte로 바꾸는 것 (implements Serializable)
			
			System.out.println("object.txt 저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos, fos);
		}
	}
	
	public static void read() {
		
		Icecream ice = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("iotest/object.txt");
			ois = new ObjectInputStream(fis);
			
			ice = (Icecream)ois.readObject();
			System.out.println(ice);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(ois, fis);
		}
	}
	
	public static void main(String[] args) {
		
		write();
		read();
	}
}
