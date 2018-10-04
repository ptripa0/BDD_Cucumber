package com.pelican.jdbc.runner;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) {
		
		Connection con = null;
		
		String url = "jdbc:mysql://localhost:3306/";
		String username = "root";
		String password = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbname = "qadatabase";
		
		try {
			
			Class.forName(driver).newInstance(); //created the object of driver class
			con = DriverManager.getConnection(url+dbname+"?autoReconnect=true&useSSL=false", username, password); //initialize the connection object
			
			System.out.println(con.isClosed());
	//		Statement st = con.createStatement();
	//		ResultSet rs = st.executeQuery("select * from qadatabase.employee");
			
//		while(rs.next()) {
		//	System.out.println(rs.first());
		//	System.out.println(rs.getArray(1));
//			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
//		}
		
	//	st.executeUpdate("insert into qadatabase.employee values('ganesh', 'beed', 46)");
	
		PreparedStatement prst = con.prepareStatement("select * from qadatabase.employee where name=? and age=?");
		prst.setString(1, "tom");
		prst.setInt(2, 30);
		
		ResultSet rs2 = prst.executeQuery();
		
		while(rs2.next()) {
			//	System.out.println(rs.first());
			//	System.out.println(rs.getArray(1));
				System.out.println(rs2.getString(1)+" "+rs2.getString(2)+" "+rs2.getInt(3));
			}
		
		
		//stored procedure
		CallableStatement cstmt = con.prepareCall("{call getTestData(?,?,?)}");
		cstmt.registerOutParameter(1, java.sql.Types.DECIMAL);
		cstmt.setString(2, "xyz");
		cstmt.setInt(3, 1000);
		
		}
		
		catch(Exception e) {
			e.printStackTrace();
			}
		
		finally {
			try {
				if(con != null  && (!con.isClosed())) {
					con.close();
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
