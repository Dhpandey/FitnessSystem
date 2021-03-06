package org.mustards;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMain {
	Connection conn = null;
	Statement stmt = null;
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/MustardDB";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";

	public Statement connection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stmt;

	}

	public void close() {
		try {
			if (stmt != null)
				stmt.close();
		} catch (SQLException se2) {

		}
		try {
			if (conn != null)
				System.out.println("Closing onnection");
			conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
