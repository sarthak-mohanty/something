package com.project.utils;

import java.sql.*;


public class ConnectionUtility {

	public static Connection getDerbyConnection() {
		Connection derbyConnection=null;
		
		try
		{
			String derbyURL = "jdbc:derby:BugProjectDB;create=true";
			
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			
			derbyConnection = DriverManager.getConnection(derbyURL);
			
//			Statement stmt;
//			
//			stmt=derbyConnection.createStatement();
//			
//			String sql="create table project(projectId int primary key,projectName varchar(20),projectDescription varchar(100), startDate date,projectStatus varchar(10))";
//			
//			stmt.execute(sql);
			
			if(derbyConnection!=null) {
				System.out.println("Connection Established");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return derbyConnection;
	}
	
	
	
}
