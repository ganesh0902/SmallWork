package com.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {

	public static Connection getRecord() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/liferayDemo";
		String username="root";
		String password="Ganesh@123";
		
		return DriverManager.getConnection(url,username,password);

	}
}