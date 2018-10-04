package com.pelican.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class MyHoliday{
	
	String mysqldriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/";
	String dbname = "qadatabase";		
	String username = "root";
	String password = "root";
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@BeforeClass
	public void initDbConnection() {
		
		
		
		try {
			Class.forName(mysqldriver).newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url+dbname+"?autoReconnect=true&useSSL=false", username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	@AfterClass
	public void closeDbConnection() {
		
		try {
			if(!con.isClosed() && con != null) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	if(pstmt != null) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	}
	
	
	@Test
	public void DbTest() {
		
		try {
			pstmt = con.prepareStatement("select * from qadatabase.employee where name=?");
			pstmt.setString(1, "tom");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//scenario1	
	@Given("^I live in Pune$")
	public void i_live() {
		System.out.println("I live in Pune");
	}
	
	@And("^Going to visit ([a-zA-Z]{1,}) for holiday around kms$")
	public void goint_to(String city, List<Map<String,String>> kms) {
		System.out.println("Going to visit "+city+" for holiday around kms "+kms.toString());
	}
		
	@When("^Holiday from ([^\"]*) to ([^\"]*)$")
	public void holiday_from(String startdate, String enddate) {
		System.out.println("Holiday from "+startdate+" th to "+enddate);
	}
		
	@And("^There are 2 adults and a child$")
	public void there_are() {
		System.out.println("There are 2 adults and a child");
	}
		
	@Then("^If flights are not available, book train tickets$")
	public void if_flight() {
		System.out.println("If flights are not available, book train tickets");
	}
		
	
	@And("^AC tickets only$")
	public void ac_only() {
		System.out.println("AC tickets only");
	}
	
//scenario2
	@Given("^We are 2 adult and a child$")
	public void we_are() {
		System.out.println("We are 2 adult and a child");
	}
	
	@And("^need double room$")
	public void need_double() {
		System.out.println("need double room");
	}
	
	@When("^From 15th Nov 2018 to 19th Nov 2018$")
	public void from_15() {
		System.out.println("From 15th Nov 2018 to 19th Nov 2018");
	}

	@And("^Need a bike$")
	public void need_a() {
		System.out.println("Need a bike");
	}


	@Then("^Stay should be comfertable$")
	public void stay_should() {
		System.out.println("Stay should be comfertable");
	}
	
	@And("^With swimming pool$")
	public void with_swimming() {
		System.out.println("With swimming pool");
	}

}
