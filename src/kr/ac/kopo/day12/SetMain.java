package kr.ac.kopo.day12;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set : 순서(X), 중복(X)
 * - HashSet
 * - TreeSet
 */
public class SetMain {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>();
		System.out.println("one 입력성공여부 : " +set.add("one"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("one");
		System.out.println("one 입력성공여부 : " +set.add("one"));
		
		System.out.println("전체 원소의 개수 : " + set.size());
		
		/*
		 * 전체 데이터 접근방법 3가지
		 * 1. 1.5버전 for문 이용
		 * 2. toArray() 메소드 이용
		 * 3. Iterator 객체 이용
		 */
		
		System.out.println("< 1.5 for문 이용한 출력");
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println("< toArray() 이용한 출력 >");
		Object[] arr = set.toArray();
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " : " + ((String)arr[i]).length());
		}
		
		/*
		 *  Iterator(순환객체) 주요 메소드
		 *  	- hasNext() : 데이터 존재여부 판단
		 *  	- next()    : 데이터 접근
		 */
		System.out.println("< Iterator 이용한 출력 >");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
	}
}















