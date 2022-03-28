package javaproject;

public class Admin {

	private static String username = "root";
	private static String password = "root";
	
	
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
