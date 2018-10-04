package com.pelican.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pelican.pages.DashboardPage;
import com.pelican.pages.LandingPage;

import com.pelican.pages.DataStorePage;

import com.pelican.util.Constants;

public class TopMenu {

	public static TopMenu topmenu = null;

	// Dashboard
	@FindBy(xpath = Constants.dashboardLink)
	public WebElement Dashboard;

	// Setup
	@FindBy(xpath = Constants.setupLink)
	public WebElement Setup;

	// Setup - Organisation Hierarchy

	@FindBy(xpath = Constants.organisationHierarchy)
	public WebElement OrganisationHierarchy;

	@FindBy(xpath = Constants.organizationEntityTypeLink)
	public WebElement OrganizationEntityType;

	@FindBy(xpath = Constants.organizationEntityLink)
	public WebElement OrganizationEntity;

	// Setup - Data Stores
	@FindBy(xpath = Constants.dataStores)
	public WebElement DataStore;

	// Setup - Schedulars
	@FindBy(xpath = Constants.schedulars)
	public WebElement Schedulars;

	// Setup - UserManagement
	@FindBy(xpath = Constants.userManagement)
	public WebElement UserManagement;

	@FindBy(xpath = Constants.Authentication)
	public WebElement Authentication;

	@FindBy(xpath = Constants.User)
	public WebElement User;

	@FindBy(xpath = Constants.AccessControl)
	public WebElement AccessControl;

	@FindBy(xpath = Constants.AdminPassword)
	public WebElement AdminPassword;

	// metadata
	@FindBy(xpath = Constants.metadataLink)
	public WebElement metadata;

	// metadata - Browse
	@FindBy(xpath = Constants.Browse)
	public WebElement browse;

	@FindBy(xpath = Constants.BrowsebyTemplate)
	public WebElement BrowsebyTemplate;

	// metadata - BulkUpload
	@FindBy(xpath = Constants.BulkUpload)
	public WebElement BulkUpload;

	// metadata - UserDefinedMetadata
	@FindBy(xpath = Constants.UserDefinedMetadata)
	public WebElement UserDefinedMetadata;

	@FindBy(xpath = Constants.Enrich)
	public WebElement Enrich;

	@FindBy(xpath = Constants.PropertyMapping)
	public WebElement PropertyMapping;

	// metadata - BusinessRules
	@FindBy(xpath = Constants.BusinessRule)
	public WebElement BusinessRule;

	// metadata - Reverese Engg
	@FindBy(xpath = Constants.RevereseEngineering)
	public WebElement ReverseEngineering;

	// metadata - Fwd Engg
	@FindBy(xpath = Constants.forwardEngineering)
	public WebElement forwardEngineering;

	@FindBy(xpath = Constants.LogicalDataType)
	public WebElement LogicalDataType;

	@FindBy(xpath = Constants.PhysicalDataType)
	public WebElement PhysicalDataType;

	@FindBy(xpath = Constants.AttributeModeling)
	public WebElement AttributeModeling;

	@FindBy(xpath = Constants.tableModeling)
	public WebElement Table;

	// Lineage
	@FindBy(xpath = Constants.lineageLink)
	public WebElement Lineage;

	@FindBy(xpath = Constants.dataLineageLink)
	public WebElement DataLineage;

	// Profiling
	@FindBy(xpath = Constants.profilingLink)
	public WebElement Profiling;

	// Profiling - Configure
	@FindBy(xpath = Constants.configureProfiling)
	public WebElement ConfigureProfiling;

	// Profiling - Basic
	@FindBy(xpath = Constants.basicDataProfilingLink)
	public WebElement BasicDataProfiling;

	// Profiling - Advanced
	@FindBy(xpath = Constants.advancedDataProfilingLink)
	public WebElement AdvancedDataProfiling;

	// Reports
	@FindBy(xpath = Constants.reportsLink)
	public WebElement Reports;

	// Reports - Delta
	@FindBy(xpath = Constants.deltaReportLink)
	public WebElement DeltaReport;

	// Reports - Custom Metadata
	@FindBy(xpath = Constants.customReportLink)
	public WebElement CustomReport;

	// Reports - Top Accessed
	@FindBy(xpath = Constants.topAccessedReportLink)
	public WebElement TopAccessedReport;

	// Reports - Last Accessed
	@FindBy(xpath = Constants.lastAccessedReportLink)
	public WebElement LastAccessedReport;

	// Search
	@FindBy(xpath = Constants.searchLink)
	public WebElement Search;

	// Search - Keyword Based Search
	@FindBy(xpath = Constants.keywordBasedLink)
	public WebElement KeywordBasedSearch;

	// Search - Browse By Tags
	@FindBy(xpath = Constants.browseByTagsLink)
	public WebElement BrowseByTags;

	// Help
	@FindBy(xpath = Constants.helpLink)
	public WebElement Help;
	
	// metadata configuration
	@FindBy(xpath = Constants.metadataConfig)
	public WebElement metadataConfig;
		
	// metadata define
	@FindBy(xpath = Constants.metadataDefine)
	public WebElement metadataDefine;

	// TopMenu constructor initializes the object of TopMenu
	WebDriver driver;

	public TopMenu(WebDriver dr) {
		driver = dr;
	}

	// goto functions
	public LandingPage gotoLandingPage() throws InterruptedException {
		if (driver.findElements(By.xpath(Constants.closePopUp)).size()!=0){
			driver.findElement(By.xpath(Constants.closePopUp)).click();
			Thread.sleep(2000l);
		}
		Dashboard.click();
		return PageFactory.initElements(driver, LandingPage.class);
	}

	// Not used
	public DashboardPage gotoDashboard() {
		Dashboard.click();
		return PageFactory.initElements(driver, DashboardPage.class);
	}

	
	// DataStores

	public DataStorePage gotoDataStores() {
		DataStore.click();
		return PageFactory.initElements(driver, DataStorePage.class);
	}
	
	
}
