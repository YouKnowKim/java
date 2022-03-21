package kr.ac.kopo.day08.extend;

// 관리자는 사원의 한 형태다 조건 부합 => 상속관계 표현
public class Manager02 extends Employee {

	Employee[] empList; // 관리사원목록

	Manager02() {
		super();
	}

	Manager02(String name, int salary, String grade, Employee[] empList) {
		super.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}

	@Override
	void info() {
		super.info();
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
		System.out.println("-----------------------------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("-----------------------------------------------------------");
		for (Employee e : empList) {
			e.info();
		}
		System.out.println("-----------------------------------------------------------");

	}
}
