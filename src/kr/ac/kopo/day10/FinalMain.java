package kr.ac.kopo.day10;

import java.util.Random;

/*final*/ class Super{
	private double PI = 3.14;
	
	Super(){
		PI = 3.141592;
	}
	
	/*final*/ void call() {
		System.out.println("SUPER::call()");
	}
}

class Sub extends Super{
	void call() {
		System.out.println("SUB::call()");
	}
}

class MyRandom extends Random{
	
	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound)+1;
	}
	
	public int nextInt(int start, int end) {
		return super.nextInt(end-start+1) + start;
	}
}

public class FinalMain {

	public static void main(String[] args) {
		
		Random r = new Random();
		int random = r.nextInt(90) + 10;
		
		MyRandom mr = new MyRandom();
		int myRandom = mr.nextInt(10);
		
		System.out.println(myRandom);
	}
}
