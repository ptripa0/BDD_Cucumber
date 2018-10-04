package com.pelican.jdbc.stepDef;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pelican.pages.LandingPage;
import com.pelican.pages.LoginPage;
import com.pelican.util.*;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//@Test(groups ={"CucumberTestSuite"})
public class TC_LoginTest extends TestBase{
	
	String mysqldriver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/";
	String dbname = "qadatabase";		
	String username = "root";
	String password = "root";
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	LandingPage landingPage=null;
	String testSiteName=null;
	String groupname=null;
	
	@BeforeSuite
	public void initialize() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		initConfig();
		initDriver();
		
	}

	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}

	@Parameters({ "testSite_Url", "group_name" })
	@BeforeMethod
	public void beforeTest(String testSiteUrl, String group_name) {
		testSiteName = testSiteUrl;
		groupname = group_name;
	
	}

	
	
	
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
	
	
	@Test(priority=1)
	public void DbTest() {
		
		try {
			pstmt = con.prepareStatement("select * from qadatabase.employee where name=?");
			pstmt.setString(1, "tom");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
		//	Assert.assertTrue(rs.getString("name").contains("tom"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	@Test(dataProvider="getTestData", priority=2)
	public void loginTest(Hashtable<String,String> testdataArray) throws IOException, SQLException, InterruptedException{
		
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);

	if(!TestUtil.isExecutable("TC_LoginTest", xls))	{
		throw new SkipException("Skipping the Test");
	}
		
		
	if(groupname.contentEquals("SetupTestSuite")){
		System.out.println("SetupTestSuite test suite is executing...");
	}
	else if(groupname.contentEquals("CucumberTestSuite")){
		System.out.println("CucumberTestSuite test suite is executing...");
	}
	else if(groupname.contentEquals("NetezzaToBigQuery")){
		System.out.println("NetezzaToBigQuery test suite is executing...");
	}
	
	else if(groupname.contentEquals("NonFunctionalTestSuite")){
		System.out.println("NonFunctional test suite is executing...");
	}
	else {
		System.out.println("test suite name not avaialble...");
	}
	//application_logs.debug("Login test executing....");
	System.out.println("Login test executing....");
	
	
	if(!isLoggedIn){
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		landingPage = lp.doLogin(testdataArray.get("Username"),testdataArray.get("Password"), testSiteName);
	}
	
	else {
		landingPage = TestBase.getTopMenu().gotoLandingPage();

	}
	// test logic
	
	if (driver.findElement(By.xpath(Constants.loggedInUserName)).getText().equalsIgnoreCase(testdataArray.get("Username")))
		System.out.println("Login Test passed");
	else{
		System.out.println("Login Test failed");
		Assert.fail("Login test failed");
	}
	   
}
	
	

	@DataProvider(parallel = true)
	public Object[][] getTestData(){
		return TestUtil.getData("TC_LoginTest", xls);
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
