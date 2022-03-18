package kr.ac.kopo.day07;

public class Member {

	String name;
	int age;
	String bloodType;

	Member() {
		this("알수없음", -1, "알수없음");
	}

	Member(String name) {
		this.name = name;
		this.age = -1;
		this.bloodType = "알수없음";
	}

	Member(String name, int age) {
		this(name, age, "알수없음");
	}

	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}

	void info() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age + " 혈액형 : " + this.bloodType);
	}
}
