package kr.ac.kopo.day06;

class 고양이 {
	void 잠을잔다() {
		System.out.println("고양이가 잠을 잡니다");
	}
	
	void 냐용거린다() {
		System.out.println("고양이가 냐용합니다.");
	}
}

class Method {
	// 메소드 오버로딩(overloading)
	// 같은 클래스 내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로 다른 것
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
//	void call(int i) {
//		System.out.println("call(int) 메소드 호출...");
//	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(String s, int n) {
		System.out.println("call(String,int) 메소드 호출...");
	}
}

public class MethodMain02 {

	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.call(10);
		m.call(10.9);
		m.call("s", 10);
		
		고양이 나비 = new 고양이();
		
		나비.냐용거린다();
	}
}
