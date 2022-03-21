package kr.ac.kopo.day08;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee.cntInfo();
		
		Employee e = new Employee("홍길동", 3300, "사원");
		Employee.cntInfo();
		
		Employee e2 = new Employee("강기동", 3800, "대리");
		Employee.cntInfo();
		e.info();
		e2.info();
	}
	/*
	 * xx.xx.car
	 * aaa:int
	 * info():void
	 */
}
