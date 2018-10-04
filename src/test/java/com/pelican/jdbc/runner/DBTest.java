package com.pelican.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DBTest {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@BeforeTest
	public void connection() {
	
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String username = "root";
		String password = "root";
		String dbname = "qadatabase";
		
		try {
			try {
				Class.forName(driver).newInstance();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //creating object of driver
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url+dbname+"?useSSL=false", username, password); //initializing jdbc connection
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//	Assert.fail("could not estabish connection in befor test method");
			throw new SkipException("could not estabish connection in before test method");
		}
		
	}
	
	@Test
	public void test1() {
	
		try {
			pstmt = con.prepareStatement("select * from qadatabase.employee where name=? and age=?");
			pstmt.setString(1, "rose");
			pstmt.setInt(2, 35);
			rs = pstmt.executeQuery();
		
			while(rs.next()) {
				System.out.println(rs.getString("name")+" "+rs.getString("place")+" "+rs.getString("age"));
				
					Assert.assertEquals(rs.getString("name"), "rose");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail("test1 test failed");
		}
		
	}
	
	@AfterTest
	public void closeConnection() {
	
		try {
			if(rs != null) {
				rs.close();
			}
			
			if(pstmt != null) {
				pstmt.close();
			}
			
			if(con != null && (!con.isClosed())) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("connections could not be closed");
		}
	}
	
}
