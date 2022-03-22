package kr.ac.kopo.day09.abs01;

public class Printer {

	private String model;
	
	public Printer(String model) {
		this.model=model;
	}
	
	public Printer() {
		
	}
	
	void print() {
		System.out.println("프린트중...");
	}
}
