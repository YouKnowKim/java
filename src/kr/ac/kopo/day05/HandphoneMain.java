package kr.ac.kopo.day05;

class Handphone {

	String name; // 실사용자명
	String phoneNumber; // 핸드폰번호
	String company; // 제조사

}

public class HandphoneMain {

	public static void main(String[] args) {

		Handphone hp = new Handphone();
		hp.name = "홍길동";
		hp.phoneNumber = "010-1111-2222";
		hp.company = "삼성";

		Handphone hp2 = new Handphone();
		hp2.name = "강길동";
		hp2.phoneNumber = "010-3333-4444";
		hp2.company = "애플";

		Handphone hp3 = new Handphone();
		hp3.name = "윤길동";
		hp3.phoneNumber = "010-4444-5555";
		hp3.company = "화웨이";

		Handphone[] hpArr = { hp, hp2, hp3 };

		for (Handphone phone : hpArr) {
			System.out.println("사용자 : " + phone.name + ", 전화번호 : " + phone.phoneNumber + ", 제조사 : " + phone.company);
		}

	}
}
