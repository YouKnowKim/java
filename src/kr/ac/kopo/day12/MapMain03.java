package kr.ac.kopo.day12;

public class MapMain03 {

	public static void main(String[] args) {
		
		Member m = new Member("홍길동", "010-1111-2222");
		Member m1 = new Member("홍길동", "010-1111-2222");
		
		if(m.equals(m1)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}
}
