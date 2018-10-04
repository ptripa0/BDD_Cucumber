package com.pelican.util;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import com.pelican.pages.LandingPage;
import com.pelican.pages.LoginPage;
import com.pelican.pages.TopMenu;

import io.restassured.RestAssured;


//singleton class
public abstract class  TestBase {

	//TODO change access modifiers to least (private or protected)
	protected static Logger application_logs=null;
	protected static WebDriver driver = null;
	protected static Properties config = null;
	protected static Properties csvMessages = null;
	protected static TopMenu topmenu = null;
	protected static boolean isLoggedIn = false;
	protected static boolean isLoggedInUpgrade = false;
	protected static Connection con = null;
	protected Statement stmt = null;
	protected static String access_token = null;
	static Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
	protected static long ts1 = timestamp1.getTime();
	//protected String baseURL = getConfig().getProperty("testSiteName");
	protected Xls_Reader xls = new Xls_Reader(Constants.test_data_path);
	//protected static Xls_Reader apixls = new Xls_Reader(Constants.api_test_path);
	protected Integer returnCode=null;
	
	//TODO change access modifiers to least (private or protected)
	protected void initConfig() throws IOException{
	//TODO implement logger 
	if(config==null){
		application_logs = Logger.getLogger("devpinoyLogger");
	
		//TODO load using PropertiesUtil
		//TODO change case for variable name
		config = new Properties();
		try{
			FileInputStream fs = new FileInputStream(Constants.config_file_path);
			config.load(fs);
		} catch (Throwable e){
		ErrorUtil.addVerificationFailure(e);
			}
		}	

}

	//TODO multi threaded safe
	
	protected void initDriver(){
		if (driver == null){
			 if ("chrome".equalsIgnoreCase(config.getProperty("browser"))) {

					System.setProperty("webdriver.chrome.driver", Constants.chromeDriver_path);
					String downloadFilepath = Constants.CSV_DOWNLOAD_PATH;
					HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
					chromePrefs.put("profile.default_content_settings.popups", 0);
					chromePrefs.put("download.default_directory", downloadFilepath);
					ChromeOptions options = new ChromeOptions();
					//options.addArguments("--start-maximized");
					//options.addArguments("disable-infobars");
					//options.addArguments("headless");
	                //options.addArguments("window-size=1200x600");
					options.setExperimentalOption("prefs", chromePrefs);
					DesiredCapabilities cap = DesiredCapabilities.chrome();
					cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
					cap.setCapability(ChromeOptions.CAPABILITY, options);
					driver = new ChromeDriver(cap);
					/* driver = new ChromeDriver(); */
			}
			else if("ie".equalsIgnoreCase(config.getProperty("browser"))){
				driver = new InternetExplorerDriver();
			}
		}
	}
	
	//Datastore set up
	//Datastore setup is a one time config activity, so including it as a part of pelican installation script
/*	
	protected void setupDataStores() {
		
	//Execute db script to set up datastores
	String command="bash /opt/qascripts/pelican_scripts/datastore_setup.sh pelicandb_qa0500fr /opt/qascripts/pelican_scripts/datastore_setup.sql ecatuser ecatuser";	
		
	returnCode=HadoopUtil.executeWrapper(config.getProperty("vm_ip"), config.getProperty("vm_user"), config.getProperty("vm_pw"), command);
	
			if(returnCode == 0) {
				System.out.println("\n"+"Datastore configurations are done....................");
			}
	}
*/	
	
	protected void createAuthAccessToken() {
		
		access_token = RestAssured
		.given()
		.parameters("grant_type", "client_credentials")
		.auth()
		.preemptive()
		.basic("ecat", "ecat")
		.when()
		.post(config.getProperty("api_baseuri")+"/oauth/token")
		.then()
		.log()
		.all()
		.extract()
		.path("access_token")
		;
		
		System.out.println("Auth2 access token is -> "+access_token);
		
	};
	
	
	
    //TODO create a DBUtil which will execute SQLs and return result 
    protected void dbInit() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException{
		
		//static String JDBCDriver = "org.apache.hive.jdbc.HiveDriver";
		//TODO define in config.properties
		String url = config.getProperty("databaseUrl");
		String username = config.getProperty("dbDefaultUsername");
		String password = config.getProperty("dbDefaultPassword");
		
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
		/*	con = DriverManager.getConnection(url, username, password);
								
			stmt = con.createStatement();
		*/
	}
	
	
    public static Boolean checkNotification(String Notification_msg_exp) throws InterruptedException, IOException {
		// validate notification
		boolean isNotified = false;

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div/ul[2]/li[1]/a[1]/noti-popup/span")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@id='hoursChart3']/div/div")).click();
		String Notification_msg_act = driver.findElement(By.xpath("//*[@id='top-slider-content']/div[1]/div/div[5]/span[4]")).getText();
		System.out.println("Actual notification message is ->  "+Notification_msg_act);
		if (Notification_msg_act.equalsIgnoreCase(Notification_msg_exp)) {
			isNotified = true;
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='top-slider-content']/div[1]/div/div[4]/i[1]")).click();
		
		return isNotified;
	}
	
  
	//TODO remove static, public if not required
	public static void quitDriver(){
		driver.quit();
		driver=null;
	}
	
	public static TopMenu getTopMenu(){
		if (topmenu == null){
		topmenu = PageFactory.initElements(driver, TopMenu.class);
		}
		return topmenu;
		
	}
	
	
	protected void logOut(){
		driver.quit();
		driver=null;
		isLoggedIn=false;
		isLoggedInUpgrade=false;
	}
	
	
	public static Properties getConfig(){
		return config;
	}
	
	protected static Boolean isLoggedIn(){
		return isLoggedIn;
	}
	
	public static void setLoggedIn(Boolean loggedIn){
		isLoggedIn = loggedIn;
	}
	
	public static void setLoggedInUpgrade(Boolean loggedInUpgrade){
		isLoggedInUpgrade = loggedInUpgrade;
	}
	
		

}
