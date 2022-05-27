package kr.ac.kopo.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@192.168.217.202:1521/KOPODA";
		String user = "da2204";
		String password = "rladbsgh1";
		
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
}
