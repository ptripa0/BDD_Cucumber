package com.pelican.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pelican.util.Constants;
import com.pelican.util.ErrorUtil;
import com.pelican.util.TestBase;
import com.pelican.util.TestUtil;
import com.pelican.pages.TopMenu;

public class DataStorePage extends TestBase {

	public DataStorePage(WebDriver dr) {
		driver = dr;

	}

	public static DataStorePage createHiveDataStore(String dataStore_Name, String dataStore_Desc,
			String dataStore_Host, String namenode_url, String sec_namenode_URL, String JDBC_username, String JDBC_pw,
			String jDBC_Port, String fileSystem, String wH_Directory, String queue_Name, String queue_Value,
			String metaStore_Port, String resource_mngr_URL, String jobHistoryServer_URL, String sparkHistoryServer_URL,
			String appTimeServer_URL, String kerberos_serviceprincipal, String kerberos_userprincipal,
			String userkeytablocation, String testSiteName) throws InterruptedException, AWTException {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		Thread.sleep(4000L);

		driver.navigate().to(testSiteName + "/#/datasources");
		Thread.sleep(6000L);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");

		driver.findElement(By.xpath(Constants.ads_type_hive)).click();

		driver.findElement(By.xpath(Constants.ads_button_newui)).click();
		Thread.sleep(3000L);

		((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight,0)");
		// Thread.sleep(3000L);
		// BASIC SETTINGS
		// driver.findElement(By.xpath("html/body/div[1]/div[2]/section/md-sidenav/div[2]/div[1]/div/span[2]")).click();
		// driver.findElement(By.xpath(Constants.ads_name_newui)).click();

		driver.findElement(By.xpath(Constants.ads_name_newui)).sendKeys(dataStore_Name);
		driver.findElement(By.xpath(Constants.ads_description_newui)).sendKeys(dataStore_Desc);
		driver.findElement(By.xpath(Constants.ads_metastore_host_newui)).sendKeys(dataStore_Host);
		driver.findElement(By.xpath(Constants.ads_namenodeurl_newui)).sendKeys(namenode_url);
		driver.findElement(By.xpath(Constants.ads_sec_namenodeurl_newui)).sendKeys(sec_namenode_URL);

		Thread.sleep(3000);

		driver.findElement(By.xpath(Constants.ads_testconnection_newui)).click();
		Thread.sleep(5000l);

		driver.findElement(By.xpath(Constants.ads_basicsetting_nextbutton_newui)).click();

		Thread.sleep(5000l);

		System.out.println("Basic Connection Settings Test: SUCCESFULL");

		Thread.sleep(5000l);

		WebElement skip = driver.findElement(By.xpath(Constants.skip_security_settings));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", skip);

		Thread.sleep(2000);
		System.out.println("hello");
		driver.findElement(By.xpath("/html/body/div[5]/md-dialog/form/md-dialog-actions/button[2]")).click();
		Thread.sleep(1000);
		// JDBC SETTINGS

		driver.findElement(By.xpath(Constants.ads_jdbcusername_newui)).sendKeys(JDBC_username);
		driver.findElement(By.xpath(Constants.ads_jdbcpw_newui)).sendKeys(JDBC_pw);
		driver.findElement(By.xpath(Constants.ads_jdbc_port_newui)).sendKeys(jDBC_Port);
		driver.findElement(By.xpath(Constants.ads_file_system_newui)).sendKeys(fileSystem);
		driver.findElement(By.xpath(Constants.ads_wh_directory_newui)).sendKeys(wH_Directory);
		driver.findElement(By.xpath(Constants.ads_queueName_newui)).sendKeys(queue_Name);
		driver.findElement(By.xpath(Constants.ads_queueValue_newui)).sendKeys(queue_Value);

		Thread.sleep(3000);
		JavascriptExecutor Scrool1 = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath(Constants.ads_jdbc_testconnection_newui));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);

		System.out.println("click for scroll");
		element.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.ads_jdbcsetting_nextbutton_newui)).click();
		Thread.sleep(2000);

		System.out.println("JDBC Connection Settings Test: SUCCESFULL");

		// METADATA SETTINGS

		driver.findElement(By.xpath(Constants.ads_metastore_port_newui)).sendKeys(metaStore_Port);

		// driver.findElement(By.xpath(Constants.ads_ranger_url_newui)).sendKeys(ranger_URL);
		// driver.findElement(By.xpath(Constants.ads_ranger_uname_newui)).sendKeys(ranger_un);
		// driver.findElement(By.xpath(Constants.ads_ranger_pw_newui)).sendKeys(ranger_pw);
		driver.findElement(By.xpath(Constants.ads_metadata_testconnection_newui)).click();
		Thread.sleep(5000l);

		driver.findElement(By.xpath(Constants.ads_metadatasetting_nextbutton_newui)).click();

		Thread.sleep(5000l);

		System.out.println("METADATA Connection Settings Test: SUCCESFULL");

		// REPORT SETTING
		driver.findElement(By.xpath(Constants.ads_resourcemanager_url_newui)).clear();
		driver.findElement(By.xpath(Constants.ads_resourcemanager_url_newui)).sendKeys(resource_mngr_URL);
		driver.findElement(By.xpath(Constants.ads_reports_testconnection_newui)).click();
		Thread.sleep(5000l);

		driver.findElement(By.xpath(Constants.ads_reportsetting_nextbutton_newui)).click();

		Thread.sleep(5000l);

		System.out.println("REPORT Settings Test: SUCCESFULL");

		// LIEAGE SETTING
		driver.findElement(By.xpath(Constants.ads_jobhistserver_url_newui)).clear();
		driver.findElement(By.xpath(Constants.ads_jobhistserver_url_newui)).sendKeys(jobHistoryServer_URL);
		driver.findElement(By.xpath(Constants.ads_saprkhistserver_url_newui)).clear();
		driver.findElement(By.xpath(Constants.ads_saprkhistserver_url_newui)).sendKeys(sparkHistoryServer_URL);
		driver.findElement(By.xpath(Constants.ads_apptimeserver_url_newui)).clear();
		driver.findElement(By.xpath(Constants.ads_apptimeserver_url_newui)).sendKeys(appTimeServer_URL);
		driver.findElement(By.xpath(Constants.ads_lineage_testconnection_newui)).click();

		Thread.sleep(5000L);
		driver.findElement(By.xpath(Constants.ads_save_testconnection_newui)).click();

		Thread.sleep(5000L);

		System.out.println("LINEAGE Connection Settings Test: SUCCESFULL");
		
		// driver.findElement(By.xpath(Constants.ads_hdfskerberos_enable_newui)).click();
		// Thread.sleep(3000L);
		// driver.findElement(By.xpath(Constants.ads_hdf_ssl_enable_newui)).click();
		// Thread.sleep(3000L);
		// driver.findElement(By.xpath(Constants.ads_hdfkerberos_serviceprincipal_newui)).sendKeys(kerberos_serviceprincipal);
		// driver.findElement(By.xpath(Constants.ads_hdfskerberos_userprincipal_newui)).sendKeys(kerberos_userprincipal);
		// driver.findElement(By.xpath(Constants.ads_userkeytablocation_newui)).sendKeys(userkeytablocation);
		// driver.findElement(By.xpath(Constants.ads_hdfs_testconnection_newui)).click();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.KEY_RELEASED);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
	//	robot.mouseMove(point.get, y);
		
		return PageFactory.initElements(driver, DataStorePage.class);
		
	}

	// DataStoreName_newui DataStoreDesc_newui DataStoreHost_newui
	// JDBCPort_newui JDBCusername_newui JDBCpw_newui DefaultDatabase
	// DataStoreType

	// **TERADTA DATASTORE SETTINGS**//

	public static DataStorePage createTDDataStore_newui(String DataStoreName_newui, String DataStoreDesc_newui,
			String DataStoreHost_newui, String JDBCPort_newui, String JDBCusername_newui, String JDBCpw_newui,
			String DefaultDatabase, String testSiteName) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/a")).click();
		Thread.sleep(1000);
		driver.navigate().to(testSiteName + "/#/datasources");
		Thread.sleep(6000L);
		System.out.println("before click on td");
		driver.findElement(By.xpath("//*[@id='datasources-tree']/ul/li[6]/span/span")).click();
		Thread.sleep(1000);
		System.out.println("after click on td");

		driver.findElement(By.xpath(Constants.ads_button_newui)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_tdname_newui)).sendKeys(DataStoreName_newui);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_tddescription_newui)).sendKeys(DataStoreDesc_newui);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_tddatastore_host_newui)).sendKeys(DataStoreHost_newui);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_tdjdbcusername_newui)).sendKeys(JDBCusername_newui);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_tdjdbcpw_newui)).sendKeys(JDBCpw_newui);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_tdDefaultDB_newui)).sendKeys(DefaultDatabase);

		Thread.sleep(2000L);
		WebElement testconnection = driver.findElement(By.xpath(Constants.ads_tddatastore_testconnection_newui));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", testconnection);
		Thread.sleep(1000);
		testconnection.click();

		Thread.sleep(5000L);

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.ads_tddatastore_save)));

		driver.findElement(By.xpath(Constants.ads_tddatastore_save)).click();

		System.out.println("SUCCESSFULLY CREATED TERADTA DATASTORE");

		Thread.sleep(5000L);
		return PageFactory.initElements(driver, DataStorePage.class);

	}

	// NETEZZA DATASTORE SETTING //

	public static DataStorePage createNZDataStore_newui(String DataStoreName_newui, String DataStoreDesc_newui,
			String DataStoreHost_newui, String JDBCPort_newui, String JDBCusername_newui, String JDBCpw_newui,
			String DefaultDatabase, String testSiteName) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/a")).click();
		Thread.sleep(1000);
		driver.navigate().to(testSiteName + "/#/datasources");
		Thread.sleep(6000L);
		System.out.println("before click on nz");
		driver.findElement(By.xpath("//*[@id='datasources-tree']/ul/li[5]/span/span")).click();
		Thread.sleep(1000);
		System.out.println("after click on nz");

		driver.findElement(By.xpath(Constants.ads_button_newui)).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_nzname_newui)).sendKeys(DataStoreName_newui);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_nzdescription_newui)).sendKeys(DataStoreDesc_newui);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_nzdatastore_host_newui)).sendKeys(DataStoreHost_newui);
		Thread.sleep(1000);
		JDBCPort_newui = JDBCPort_newui.contains(".") ? JDBCPort_newui.substring(0, JDBCPort_newui.indexOf("."))
				: JDBCPort_newui;
		driver.findElement(By.xpath(Constants.ads_nzjdatastore_port_newui)).sendKeys(JDBCPort_newui);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_nzjdbcusername_newui)).sendKeys(JDBCusername_newui);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_nzjdbcpw_newui)).sendKeys(JDBCpw_newui);
		Thread.sleep(1000);
		driver.findElement(By.xpath(Constants.ads_nzDefaultDB_newui)).sendKeys(DefaultDatabase);
		

		Thread.sleep(2000L);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 250);");
		Thread.sleep(3000L);

		driver.findElement(By.xpath(Constants.ads_nzdatastore_testconnection_newui)).click();

		Thread.sleep(5000L);

		driver.findElement(By.xpath(Constants.ads_nzdatastore_save)).click();

		System.out.println("SUCCESSFULLY CREATED NETEZZA DATASTORE");

		Thread.sleep(5000L);
		return PageFactory.initElements(driver, DataStorePage.class);

	}

	// ORACLE DATASTORE SETTING //

	public static DataStorePage createOracleDataStore_newui(String DataStoreName_newui,
			String DataStoreDesc_newui, String DataStoreHost_newui, String JDBCPort_newui, String JDBCusername_newui,
			String JDBCpw_newui, String ssid, String testSiteName) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/a")).click();
		Thread.sleep(1000);
		driver.navigate().to(testSiteName + "/#/datasources");
		Thread.sleep(6000L);
		System.out.println("before click on nz");
		driver.findElement(By.xpath("//*[@id='datasources-tree']/ul/li[7]/span/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(Constants.ads_button_newui)).click();
		driver.findElement(By.xpath(Constants.ads_orname_newui)).sendKeys(DataStoreName_newui);
		driver.findElement(By.xpath(Constants.ads_ordescription_newui)).sendKeys(DataStoreDesc_newui);
		driver.findElement(By.xpath(Constants.ads_ordatastore_host_newui)).sendKeys(DataStoreHost_newui);
		driver.findElement(By.xpath(Constants.ads_ordatastore_port_newui)).sendKeys(JDBCPort_newui);
		driver.findElement(By.xpath(Constants.ads_orjdbcusername_newui)).sendKeys(JDBCusername_newui);
		driver.findElement(By.xpath(Constants.ads_orjdbcpw_newui)).sendKeys(JDBCpw_newui);
		driver.findElement(By.xpath(Constants.ads_orSSID_newui)).sendKeys(ssid);
		driver.findElement(By.xpath(Constants.ads_ordatastore_testconnection_newui)).click();

		Thread.sleep(5000L);

		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.ads_ordatastore_save)));

		driver.findElement(By.xpath(Constants.ads_ordatastore_save)).click();

		System.out.println("SUCCESSFULLY CREATED ORACLE DATASTORE");

		return PageFactory.initElements(driver, DataStorePage.class);

	}

	// MS MYSQL SETTING //

	public static DataStorePage createMySqlDataStoreTest(String DataStoreName_newui, String DataStoreDesc_newui,
			String DataStoreHost_newui, String JDBCPort_newui, String JDBCusername_newui, String JDBCpw_newui,
			String testSiteName) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/a")).click();
		Thread.sleep(1000);
		driver.navigate().to(testSiteName + "/#/datasources");
		Thread.sleep(6000L);
		System.out.println("before click on nz");
		driver.findElement(By.xpath("//*[@id='datasources-tree']/ul/li[8]/span/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(Constants.ads_button_newui)).click();
		driver.findElement(By.xpath(Constants.ads_mysqlname_newui)).sendKeys(DataStoreName_newui);
		driver.findElement(By.xpath(Constants.ads_mysqldescription_newui)).sendKeys(DataStoreDesc_newui);
		driver.findElement(By.xpath(Constants.ads_mysqldatastore_host_newui)).sendKeys(DataStoreHost_newui);
		driver.findElement(By.xpath(Constants.ads_mysqldatastore_port_newui)).sendKeys(JDBCPort_newui);
		driver.findElement(By.xpath(Constants.ads_mysqljdbcusername_newui)).sendKeys(JDBCusername_newui);
		driver.findElement(By.xpath(Constants.ads_mysqljdbcpw_newui)).sendKeys(JDBCpw_newui);
		driver.findElement(By.xpath(Constants.ads_mysqldatastore_testconnection_newui)).click();

		Thread.sleep(5000L);

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.ads_msdatastore_save)));

		driver.findElement(By.xpath(Constants.ads_msdatastore_save)).click();

		System.out.println("SUCCESSFULLY CREATED ORACLE DATASTORE");

		return PageFactory.initElements(driver, DataStorePage.class);

	}

	// HDFS DATA STORE //

	public static DataStorePage createhdfsDataStore_newui(String DataStoreName_newui, String DataStoreDesc_newui,
			String WebHdfs_URL, String WebHdfs_name, String hdfsdirpath, String hdfsmappedhivetable,
			String rangerusername, String rangerpw, String kerberos_serviceprincipal, String kerberos_userprincipal,
			String userkeytablocation, String testSiteName) throws InterruptedException {

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/a")).click();
		Thread.sleep(1000);
		driver.navigate().to(testSiteName + "/#/datasources");
		Thread.sleep(6000L);
		System.out.println("before click on nz");
		driver.findElement(By.xpath("//*[@id='datasources-tree']/ul/li[3]/span/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath(Constants.ads_button_newui)).click();
		driver.findElement(By.xpath(Constants.ads_hdfsname_newui)).sendKeys(DataStoreName_newui);
		driver.findElement(By.xpath(Constants.ads_hdfsdescription_newui)).sendKeys(DataStoreDesc_newui);
		driver.findElement(By.xpath(Constants.ads_hdfsdatastore_WebHdfs_URL_newui)).sendKeys(WebHdfs_URL);
		driver.findElement(By.xpath(Constants.ads_hdfsdatastore_WebHdfs_name_newui)).sendKeys(WebHdfs_name);
		driver.findElement(By.xpath(Constants.ads_hdfsdirpath_newui)).sendKeys(hdfsdirpath);
		// //driver.findElement(By.xpath(Constants.ads_hdfsmappedhivetable_newui)).sendKeys(hdfsmappedhivetable);
		// driver.findElement(By.xpath(Constants.ads_hdfsdatastore_rangerusername_newui)).sendKeys(rangerusername);
		// driver.findElement(By.xpath(Constants.ads_hdf_rangerpw_newui)).sendKeys(rangerpw);
		// driver.findElement(By.xpath(Constants.ads_hdfadvancesettings_newui)).click();
		// Thread.sleep(4000L);
		// driver.findElement(By.xpath(Constants.ads_hdfskerberos_enable_newui)).click();
		// driver.findElement(By.xpath(Constants.ads_hdf_ssl_enable_newui)).click();
		// Thread.sleep(4000L);
		// driver.findElement(By.xpath(Constants.ads_hdfkerberos_serviceprincipal_newui)).sendKeys(kerberos_serviceprincipal);
		// driver.findElement(By.xpath(Constants.ads_hdfskerberos_userprincipal_newui)).sendKeys(kerberos_userprincipal);
		// driver.findElement(By.xpath(Constants.ads_userkeytablocation_newui)).sendKeys(userkeytablocation);

		Thread.sleep(2000L);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 250);");
		Thread.sleep(3000L);

		driver.findElement(By.xpath(Constants.ads_hdfs_testconnection_newui)).click();

		// driver.findElement(By.xpath("/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[4]/md-dialog-actions/button[1]/span")).click();

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.ads_hdfs_savedatastore_newui)));

		driver.findElement(By.xpath(Constants.ads_hdfs_savedatastore_newui)).click();

		System.out.println("SUCCESSFULLY CREATED HDFS DATASTORE");
		Thread.sleep(5000L);
		return PageFactory.initElements(driver, DataStorePage.class);

	}

}
