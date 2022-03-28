package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

/*
 *  Koala.jpg -> Koala2.jpg 복사
 */

public class IOMain04 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream("iotest/Koala3.jpg");
			bos = new BufferedOutputStream(fos);

			long start = System.currentTimeMillis();

			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			fos.flush();

			long end = System.currentTimeMillis();

			System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);

//			FileClose.close(bis);
//			FileClose.close(bos);
//
//			FileClose.close(fis);
//			FileClose.close(fos);
		}
		System.out.println("파일복사가 완료되었습니다.");
	}
}
