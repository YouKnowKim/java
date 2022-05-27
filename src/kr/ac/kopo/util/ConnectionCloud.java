package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCloud {

	public Connection getConnection() throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@youknowkim1_high?TNS_ADMIN=/JAVA/lib/Wallet_youknowkim1.zip";
		String user = "admin";
		String password = "Dbsgh1234!@#$";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
}
