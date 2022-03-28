package kr.ac.kopo.day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

public class IOMain08 {

	public static void write() {
		Icecream ice = new Icecream("비비빅", 1000);
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			
			fos = new FileOutputStream("iotest/icecream.txt");
			dos = new DataOutputStream(fos);
			
			dos.writeUTF(ice.getName() + "#" + ice.getPrice());
			
			dos.flush();
			
			System.out.println("icecream.txt에 저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			
			fis = new FileInputStream("iotest/icecream.txt");
			dis = new DataInputStream(fis);
			
			String[] data = dis.readUTF().split("#");
			
			System.out.println(Arrays.toString(data));
			
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			
			Icecream ice = new Icecream(name, price);
			System.out.println(ice);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
	}
	
	public static void main(String[] args) {
		read();
//		write();
	}
}
