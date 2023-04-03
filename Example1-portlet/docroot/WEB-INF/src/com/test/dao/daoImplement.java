package com.test.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Statement;

public class daoImplement {

	public static int getRecord() throws Exception{
		
		Connection con = dbConnect.getRecord();
		Statement statement = con.createStatement();
		
		int id=0;
		String query="select *from smallwork ORDER BY id_ DESC LIMIT 1";
		
		ResultSet result = statement.executeQuery(query);
		
		while(result.next())
		{
			id = result.getInt(1);
		}	
		
		return id;
	
	}
	}
