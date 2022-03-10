package kr.ac.kopo.day01;

public class PrintMain02 {
	/*
	 	ASCII CODE(0 - 256) : 1byte
	 		대문자, 소문자, 숫자문자, 특수문자, 공백문자를 숫자로 일대일 매칭시킨 숫자표
	 		
	 	UNICODE(0 ~ 65500) : 2byte
	 		다국어 지원 숫자표(ASCII CODE + 한글, 한자, ...)
	 		자바의 문자인식
	 		
	 		'A' : 65	0x41
	 		'a' : 97	0x61
	 		'0' : 48	0x30
	 */

	public static void main(String[] args) {
		
		System.out.println('A');
		System.out.println('A' + 'B');
		System.out.println(' ' + 10);
		System.out.println('\t' + 1);
		System.out.println('\n' + 1);
		System.out.println(0x41 + 0x42);
	}
}
