package javaproject;

import java.io.Serializable;
import java.util.List;

public class Member implements Serializable{

	private static int memberNumbering = 0;
	private int userNumber;	
	private String username;
	private String password;
	private String name;
	private int memberState; // 0 : 기본, 1:대여 정지, 2 : 탈퇴 상태
	private List<Book> rentList; // 책 번호만 저장
	
	public Member() {
		
	}
	
	public Member(int userNumber) {
		this.userNumber = userNumber;
	}
	
	public Member(int userNumber, String username, String password) {
		this.userNumber = userNumber;
		this.username = username;
		this.password = password;
	}
	
	public Member(String username, String password, String name) {
		super();
		this.userNumber = ++Member.memberNumbering;
		this.username = username;
		this.password = password;
		this.name = name;
		this.memberState = 0;
	}
	
	@Override
	public String toString() {
		return "Member [userNumber=" + userNumber + ", username=" + username + ", password=" + password + ", name="
				+ name + ", memberState=" + memberState + ", rentList=" + rentList + "]";
	}



	public static int getMemberNumbering() {
		return memberNumbering;
	}
	public static void setMemberNumbering(int memberNumbering) {
		Member.memberNumbering = memberNumbering;
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMemberState() {
		return memberState;
	}
	public void setMemberState(int memberState) {
		this.memberState = memberState;
	}
	public List<Book> getRentList() {
		return rentList;
	}
	public void setRentList(List<Book> rentList) {
		this.rentList = rentList;
	}
	
	
	
	
}
