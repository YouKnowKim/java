package javaproject;

public class Admin {

	// 관리자 계정
	private static int userNumber = 0;
	private static String username = "root";
	private static String password = "root";
	
	public static int getUserNumber() {
		return userNumber;
	}
	public static void setUserNumber(int userNumber) {
		Admin.userNumber = userNumber;
	}
	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		Admin.username = username;
	}
	
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		Admin.password = password;
	}
	
	
}
