package com.vogella.build.maven.java.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/TCC","root","");
		} catch (SQLException e) {
//			relançando a exception
			throw new RuntimeException(e);
			
		}
	}

}
