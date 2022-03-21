package kr.ac.kopo.day08.extend;

// 관리자는 사원의 한 형태다 조건 부합 => 상속관계 표현
public class Manager03 extends Employee {

	Employee[] empList; // 관리사원목록

	Manager03() {
		super();
	}

	Manager03(String name, int salary, String grade, Employee[] empList) {
		super(name, salary, grade);
		this.empList = empList;
	}

	@Override
	void info() {
		super.info();
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("-----------------------------------------------------------");
		for (Employee e : this.empList) {
			e.info();
		}
		System.out.println("-----------------------------------------------------------");

	}
}
