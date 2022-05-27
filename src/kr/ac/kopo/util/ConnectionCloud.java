package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCloud {

	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("ab");
		String url = "jdbc:oracle:thin:@youknowkim1_high?TNS_ADMIN=C:\\Wallet_youknowkim1\\";
		String user = "admin";
		String password = "Dbsgh1234!@#$";
		
		Connection conn = DriverManager.getConnection(url,user,password);
		return conn;
	}
}
