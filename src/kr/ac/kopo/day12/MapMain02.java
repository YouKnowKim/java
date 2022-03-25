package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* alt + shift + s 누른 후  c 선택 => 기본생성자
 * 						  o 선택 => 매개변수 생성자
 * 						  r 선택 => getter/setter 메소드
 * 						  v 선택 => override/implement 메소드
 *                        s 선택 => toString() 메소드
*/




public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> map = new HashMap<Member, Car>();
		
		map.put(new Member("홍길동","010-1111-2222"), new Car("소나타", "33가3333"));
		map.put(new Member("윤길동","010-2222-3333"), new Car("카니발", "44가7878"));
		map.put(new Member("홍길동", "010-1111-2222"), new Car("카니발", "82다8282"));
		
		Set<Entry<Member, Car>> entrys = map.entrySet();
		for(Entry<Member, Car> data : entrys) {
			Member member = data.getKey();
			Car car = data.getValue();
			
			System.out.println(member);
			System.out.println(car);
		}
		
	}
}

















