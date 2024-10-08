package DesignPattern.ObjectPoolDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private Connection dbConnection;

	public DBConnection() {
		try {
			dbConnection = DriverManager.getConnection("url", "username", "password");
		} catch (SQLException e) {
		}
	}
}
