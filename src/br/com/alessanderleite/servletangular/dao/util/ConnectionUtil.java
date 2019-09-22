package br.com.alessanderleite.servletangular.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getNewConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db?useSSL=false", "root", "root");
	}
}
