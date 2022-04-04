package javaproject;

import java.io.Serializable;
import java.util.Calendar;

public class Book implements Serializable{

	// 고유 번호를 매기기 위한 정보
	private static int bookNumbering = 0;
	
	private int bookNo;
	private String bookName;
	private Member rentMember;
	private Calendar rentDay;
	private Calendar returnDay;
	private int overdueCheck; // 0 : 연체X, 1 : 연체O
	
	public Book() {
		super();
	}
	
	public Book(String bookName) {
		super();
		this.bookName = bookName;
		this.bookNo = ++bookNumbering;
	}


	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", bookName=" + bookName + ", rentMember=" + ", rentDay="
				+ rentDay + ", returnDay=" + returnDay + ", overdueCheck=" + overdueCheck + "]";
	}
	public static int getBookNumbering() {
		return bookNumbering;
	}
	public static void setBookNumbering(int bookNumbering) {
		Book.bookNumbering = bookNumbering;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Member getRentMember() {
		return rentMember;
	}
	public void setRentMember(Member rentMember) {
		this.rentMember = rentMember;
	}
	public Calendar getRentDay() {
		return rentDay;
	}
	public void setRentDay(Calendar rentDay) {
		this.rentDay = rentDay;
	}
	public Calendar getReturnDay() {
		return returnDay;
	}
	public void setReturnDay(Calendar returnDay) {
		this.returnDay = returnDay;
	}
	public int getOverdueCheck() {
		return overdueCheck;
	}
	public void setOverdueCheck(int overdueCheck) {
		this.overdueCheck = overdueCheck;
	}
	
	
}
