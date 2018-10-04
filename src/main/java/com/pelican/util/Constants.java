package com.pelican.util;

import java.io.File;

public class Constants {
	public static final String SEP = File.separator;
	// PATHS
	public static final String config_file_path = System.getProperty("user.dir") + SEP + "src" + SEP + "test" + SEP
			+ "resources" + SEP + "config" + SEP + "config.properties";
	public static final String csv_messages_file_path = System.getProperty("user.dir") + SEP + "src" + SEP + "test"
			+ SEP + "resources" + SEP + "config" + SEP + "csv_messages.properties";
	public static final String test_data_path = System.getProperty("user.dir")
			+ "//src//test//resources//data//Test Cases.xlsx";
	public static final String test_data_path_1 = System.getProperty("user.dir")
			+ "//src//test//resources//data//Test_Cases_1.xlsx";
	public static final String api_test_path = System.getProperty("user.dir")
			+ "//src//test//resources//data//APItest.xlsx";
	public static final String chromeDriver_path = System.getProperty("user.dir")
			+ "//src//test//resources//config//chromedriver.exe";

	public static final String CSV_DOWNLOAD_PATH = System.getProperty("user.dir") + SEP + "src" + SEP + "test" + SEP
			+ "resources" + SEP + "data" + SEP + "csv" + SEP;
	public static final String CSV_path = System.getProperty("user.dir") + SEP + "src" + SEP + "test" + SEP
			+ "resources" + SEP + "data" + SEP + "validdata.csv";
	public static final String autoit_exe_path = System.getProperty("user.dir") + SEP + "src" + SEP + "test" + SEP
			+ "resources" + SEP + "data" + SEP + "fileupload.exe";
	public static final String CSV_path_append = System.getProperty("user.dir");

	public static final String documentUploadPathWord = System.getProperty("user.dir") + SEP + "src" + SEP + "test"
			+ SEP + "resources" + SEP + "data" + SEP + "documents" + SEP + "WordDocument.docx";
	public static final String documentUploadPathText = System.getProperty("user.dir") + SEP + "src" + SEP + "test"
			+ SEP + "resources" + SEP + "data" + SEP + "documents" + SEP + "TextDocument.txt";
	/*
	 * public static final String documentUploadPathWord =
	 * System.getProperty("user.dir") +
	 * "//src//test//resources//data//documents//WordDocument.docx"; public
	 * static final String documentUploadPathText =
	 * System.getProperty("user.dir") +
	 * "//src//test//resources//data//documents//TextDocument.txt";
	 */

	// xpaths, ids, buttons
	// Login Page
	public static final String username = "//*[@id='username']";
	public static final String password = "//*[@id='password']";
	public static final String error_msg_login_text = "html/body/div[1]/div/div[2]/div[1]";
	public static final String login_button = "html/body/div[1]/div/div[2]/form/button";
	public static final String logout_button = "html/body/div[1]/div[1]/nav/div/ul[2]/li[3]/a[1]/span";
	public static final String dashboardIconLink = "html/body/div[1]/div[2]/div/div[1]/span";
	public static final String loggedInUserName = "html/body/div[1]/div[1]/nav/div/ul[2]/li[2]/a[1]/span[2]";

	// Top Menu
	// public static final String dashboardLink =
	// "html/body/div[1]/div[1]/div[1]/ul/li[1]/a/label";
	public static final String dashboardLink = "html/body/div[1]/div[1]/nav/div/ul[1]/li[1]/a";

	public static final String setupLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/a/label";
	public static final String organisationHierarchy = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[1]/a"; // businessModelingLink
	public static final String dataStores = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[2]/a";
	public static final String schedulars = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[3]/a/label";
	public static final String userManagement = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[4]/a";
	public static final String Authentication = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[4]/ul/li[1]/a/label";
	public static final String User = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[4]/ul/li[2]/a/label";
	public static final String AccessControl = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[4]/ul/li[3]/a/label";
	public static final String AdminPassword = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[4]/ul/li[4]/a/label";
	public static final String Browse = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[1]/a";
	public static final String BrowsebyTemplate = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[1]/ul/li/a/label";
	public static final String BulkUpload = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[3]/a/label";
	public static final String UserDefinedMetadata = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[3]/a";
	// public static final String PropertyMapping =
	// "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[2]/a/label";
	public static final String PropertyMapping = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[3]/ul/li[1]/a";
	// public static final String Enrich =
	// "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[2]/a/label";
	public static final String Enrich = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[3]/ul/li[2]/a";
	public static final String BusinessRule = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[4]/a/label";
	public static final String RevereseEngineering = "/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/ul/li[5]/a";
	public static final String SchemaRevereseEngineering = "/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/ul/li[5]/ul/li[1]/a/label";

	// newly added Menu links end

	public static final String LogicalDataType = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[6]/ul/li[1]/a/label";
	public static final String PhysicalDataType = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[6]/ul/li[2]/a/label";
	public static final String AttributeModeling = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[6]/ul/li[3]/a/label";
	public static final String organizationEntityTypeLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[1]/ul/li[1]/a/label";
	// "//a[contains(@href,' /#/orgtypes')]";
	// "//span[contains(@class,'fa fa-Organization Entity Type')]";
	// "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[1]/ul/li[1]/a/label";
	// "fa fa-Organization Entity Type";

	// public static final String entityTypeTab =
	// "//*[@id='organizationHierarchyContainer']/div[1]/ul/li[1]/a";
	public static final String entityTypeTab = "//*[@id='org-hierarchy-inner-container']/div[1]/ul/li[1]/a";
	// *[@id="org-hierarchy-inner-container"]/div[1]/ul/li[1]/a
	public static final String oet_AddEntityType_Button = "/html/body/div[1]/div[2]/section/div[2]/div[3]/div/div/div/div/div[2]/div/div[1]/div[1]/button[1]";
	public static final String oet_Entity_Type_Name_Text = "/html/body/div[1]/div[2]/section/div[2]/div[3]/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/form/div[1]/div/input";
	public static final String oet_Entity_Type_Desc = "/html/body/div[1]/div[2]/section/div[2]/div[3]/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/form/div[2]/div/input";
	public static final String oet_Entity_Type_Owner = "/html/body/div[1]/div[2]/section/div[2]/div[3]/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/form/div[3]/div/input";
	public static final String oet_done_button = "/html/body/div[1]/div[2]/section/div[2]/div[3]/div/div/div/div/div[2]/div/div[1]/div[1]/div[3]/form/div[5]/div/button[1]";
	public static final String oet_LeftPanel = "/html/body/div[1]/div[2]/section/div[2]/div[3]/div/div/div/div/div[1]/div/div[1]/div/div[2]/ul/li/span/span";
	public static final String oet_newEntityType = "html/body/div[1]/div[2]/div/div/div[2]/div[1]/div/div[2]/ul/li/div/ul/li[5]/span/span";
	public static final String oet_deleteButton = "html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/button";
	public static final String oet_deleteOk = "html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/input[1]";

	public static final String organizationEntityLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[1]/ul/li[2]/a";
	public static final String oe_AddEntity_Button = "//*[@id='viewOne']/div[2]/div[2]/div[1]/button[1]/span";
	// "//*[@id='viewOne']/div[2]/div[2]/div[1]/button[1]";

	public static final String oe_Entity_Type_Name_Combo = "//*[@id='viewOne']/div[2]/div[2]/div[1]/div/div[2]/form/div[1]/div/select";

	public static final String oe_Entity_Type_Name_ComboSelect = "";
	public static final String oe_Entity_Name = "//*[@id='viewOne']/div[2]/div[2]/div[1]/div/div[2]/form/div[2]/div/input";

	public static final String oe_Entity_desc = "//*[@id='viewOne']/div[2]/div[2]/div[1]/div/div[2]/form/div[3]/div/input";
	public static final String oe_owner = "//*[@id='viewOne']/div[2]/div[2]/div[1]/div/div[2]/form/div[4]/div/input";
	public static final String oe_done_button = "//*[@id='viewOne']/div[2]/div[2]/div[1]/div/div[2]/form/div[7]/div/button[1]";
	// *[@id="viewOne"]/div[2]/div[2]/div[1]/div/div[2]/form/div[7]/div/button[1]
	public static final String oe_LeftPanel = "/html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[2]/ul/li";
	public static final String oe_newEntity = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/ul/li/div/ul/li[5]/span/span";

	public static final String oe_deleteButton = "//*[@id='viewOne']/div[2]/div[2]/div[1]/div[1]/button";
	public static final String oe_deleteOk = "//*[@id='viewOne']/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]";
	public static final String oe_lt_tab = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/ul/li[2]";
	public static final String oe_lt_addButton = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[2]/md-button/button";
	public static final String oe_lt_addForm = "html/body/div[3]/md-dialog/md-content/form";
	public static final String oe_lt_tableNameText = "html/body/div[3]/md-dialog/md-content/form/div[1]/input";
	public static final String oe_lt_tableDesc = "html/body/div[3]/md-dialog/md-content/form/div[2]/input";
	public static final String oe_lt_selectAttributeCombo = "html/body/div[3]/md-dialog/md-content/form/div[3]/div[1]/div/a/span";
	public static final String oe_lt_selectAttribute = "html/body/div[3]/md-dialog/md-content/form/div[3]/div[1]/div/a";
	public static final String oe_lt_saveButton = "html/body/div[3]/md-dialog/md-content/form/div[4]/md-button[1]/button";
	public static final String oe_lt_table = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table";

	public static final String browseByTagsLink = "html/body/div[1]/div[1]/div[1]/ul/li[7]/ul/li[2]/a/label";
	public static final String informationModelingLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[2]/a";

	public static final String logicalDataTypeLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[2]/ul/li[1]/a/label";
	public static final String ldt_dataStoreType = "html/body/div[1]/div[2]/div/div/div[2]/select";
	public static final String ldt_SelectAdataStoreType = "html/body/div[1]/div[2]/div/div/div[2]/select/option[2]";
	public static final String ldt_WebTable = "html/body/div[1]/div[2]/div/div/table/tbody/tr/td";

	public static final String dataTypeLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[2]/ul/li[2]/a/label";
	public static final String dt_dataStoreType = "html/body/div[1]/div[2]/div/div/table/thead/tr[2]/th[1]/input";
	public static final String dataTypeWebTable = "html/body/div[1]/div[2]/div/div/table/tbody[1]/tr/td";

	public static final String dataStoreLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[2]/ul/li[3]/a";
	public static final String ads_button = "html/body/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[1]/input";
	public static final String ads_Dialog = "html/body/div[3]/md-dialog/md-content";

	// public static final String ads_name_newui =
	// "//input[@ng-model='newDataSource.name']";
	public static final String ads_button_newui = "html/body/div[1]/div[2]/section/div[3]/div/div[1]/div[1]/span[2]/span/a/span";
	                                             
	// BASIC SETTINGS
	public static final String ads_type_hive = "//*[@id='datasources-tree']/ul/li[1]/span/span";

	public static final String ads_name_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[1]/tbody/tr[3]/td/input";

	public static final String ads_description_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[2]/tbody/tr[3]/td/input";
	public static final String ads_metastore_host_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[3]/tbody/tr[3]/td/input";
	public static final String ads_namenodeurl_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[4]/tbody/tr[3]/td/input";
	public static final String ads_sec_namenodeurl_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[5]/tbody/tr[3]/td/input";
	public static final String ads_testconnection_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/div/md-dialog-actions/button[2]/span";
	public static final String ads_basicsetting_nextbutton_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/div/md-dialog-actions/button[3]/span[2]";
	public static final String skip_security_settings = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/div/md-dialog-actions/button[3]/span[1]";

	// JDBC SETTINGS

	public static final String ads_jdbcusername_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[1]/tbody/tr[3]/td/input";
	public static final String ads_jdbcpw_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[2]/tbody/tr[3]/td/input";
	public static final String ads_jdbc_port_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[3]/tbody/tr[3]/td/input";
	public static final String ads_file_system_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[4]/tbody/tr[3]/td/input";
	public static final String ads_wh_directory_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[5]/tbody/tr[3]/td/input";
	public static final String ads_queueName_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[6]/tbody/tr[3]/td/input";
	public static final String ads_queueValue_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/table[7]/tbody/tr[3]/td/input";
	public static final String ads_jdbc_testconnection_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/div/md-dialog-actions/button[2]";
	public static final String ads_jdbcsetting_nextbutton_newui = "//*[@id='genericDataStoreInstanceObj2']/form/div[7]/div/md-dialog-actions/button[3]";

	// *[@id="genericDataStoreInstanceObj2"]/form/div[7]/table[2]/tbody/tr[3]/td/input
	// /html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[2]/md-dialog-actions/button[1]/span
	// METADATA SETTINGS

	public static final String ads_metastore_port_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table/tbody/tr[3]/td/input";
	public static final String ads_ranger_url_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table[2]/tbody/tr[3]/td/input";
	public static final String ads_ranger_uname_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table[3]/tbody/tr[3]/td/input";
	public static final String ads_ranger_pw_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table[4]/tbody/tr[3]/td/input";
	public static final String ads_metadata_testconnection_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/div/md-dialog-actions/button[2]";
	public static final String ads_metadatasetting_nextbutton_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/div/md-dialog-actions/button[3]";

	// REPORT SETTING

	public static final String ads_resourcemanager_url_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table/tbody/tr[3]/td/input";
	public static final String ads_reports_testconnection_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/div/md-dialog-actions/button[2]";
	public static final String ads_reportsetting_nextbutton_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/div/md-dialog-actions/button[3]";

	// LINEAGE SETTING
	public static final String ads_jobhistserver_url_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table[1]/tbody/tr[3]/td/input";
	public static final String ads_saprkhistserver_url_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table[2]/tbody/tr[3]/td/input";
	public static final String ads_apptimeserver_url_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table[3]/tbody/tr[3]/td/input";
	public static final String ads_lineage_testconnection_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/div/md-dialog-actions/button[2]";

	public static final String ads_save_testconnection_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[2]/md-dialog-actions/button[2]";

	// Security Settings

	public static final String ads_edit_kerberos_newui = "html/body/div[1]/div[2]/section/div[3]/div/div[2]/div[1]/div/div/div[1]/div[6]/div[1]/div/div[2]/a/div";

	public static final String ads_hivekerberos_enable_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table[1]/tbody/tr[3]/td/input";
	public static final String ads_hive_ssl_enable_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table[2]/tbody/tr[3]/td/input";
	public static final String ads_hivekerberos_serviceprincipal_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table[3]/tbody/tr[3]/td/input";
	public static final String ads_hivekerberos_userprincipal_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table[4]/tbody/tr[3]/td/input";
	public static final String ads_hive_userkeytablocation_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/table[5]/tbody/tr[3]/td/input";
	public static final String ads_kerberos_testconnection_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/div[7]/div/md-dialog-actions/button[2]";
	public static final String ads_kerberos_savedatastore_newui = "	html/body/div[1]/div[2]/section/div[2]/div/div/div/div[4]/md-dialog-actions/button[2]";
	public static final String ads_savedatastore_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[2]/md-dialog-actions/button[2]";

	// NETEZA DATASTORE LOCATORS//

	public static final String ads_nzdatastore_newui = "html/body/div[1]/div[2]/section/md-sidenav/div[2]/div[5]/div/span[2]";

	public static final String ads_nzname_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[1]/tbody/tr[3]/td/input";
	public static final String ads_nzdescription_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[2]/tbody/tr[3]/td/input";
	public static final String ads_nzdatastore_host_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[3]/tbody/tr[3]/td/input";
	public static final String ads_nzjdatastore_port_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[4]/tbody/tr[3]/td/input";

	public static final String ads_nzjdbcusername_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[5]/tbody/tr[3]/td/input";
	public static final String ads_nzjdbcpw_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[6]/tbody/tr[3]/td/input";
	public static final String ads_nzDefaultDB_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[7]/tbody/tr[3]/td/input";
	public static final String ads_nzdatastore_testconnection_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[2]/md-dialog-actions/button[1]/span";
	public static final String ads_nzdatastore_save = "/html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[2]/md-dialog-actions/button[2]/span";

	// TERADATA DATASTORE LOCATORS//

	public static final String ads_tddatastore_newui = "html/body/div[1]/div[2]/section/md-sidenav/div[2]/div[6]/div/span[2]";

	public static final String ads_tdname_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[1]/tbody/tr[3]/td/input";
	public static final String ads_tddescription_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[2]/tbody/tr[3]/td/input";
	public static final String ads_tddatastore_host_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[3]/tbody/tr[3]/td/input";
	public static final String ads_tdjdbcusername_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[4]/tbody/tr[3]/td/input";
	public static final String ads_tdjdbcpw_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[5]/tbody/tr[3]/td/input";
	public static final String ads_tdDefaultDB_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[6]/tbody/tr[3]/td/input";
	public static final String ads_tddatastore_testconnection_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[2]/md-dialog-actions/button[1]/span";
	public static final String ads_tddatastore_save = "/html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[2]/md-dialog-actions/button[2]";

	// ORACLE DATASTORE LOCATORS//

	public static final String ads_ordatastore_newui = "html/body/div[1]/div[2]/section/md-sidenav/div[2]/div[7]/div/span[2]";

	public static final String ads_orname_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[1]/tbody/tr[3]/td/input";
	public static final String ads_ordescription_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[2]/tbody/tr[3]/td/input";
	public static final String ads_ordatastore_host_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[3]/tbody/tr[3]/td/input";
	public static final String ads_ordatastore_port_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[4]/tbody/tr[3]/td/input";
	public static final String ads_orjdbcusername_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[5]/tbody/tr[3]/td/input";
	public static final String ads_orjdbcpw_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[6]/tbody/tr[3]/td/input";
	public static final String ads_orSSID_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[7]/tbody/tr[3]/td/input";
	public static final String ads_ordatastore_testconnection_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[2]/md-dialog-actions/button[1]/span";
	public static final String ads_ordatastore_save = "/html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[2]/md-dialog-actions/button[2]/span";

	// MS MYSQL DATASTORE LOCATORS//

	public static final String ads_mysqldatastore_newui = "html/body/div[1]/div[2]/section/md-sidenav/div[2]/div[8]/div/span[2]";
	public static final String ads_mysqlname_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[1]/tbody/tr[3]/td/input";
	public static final String ads_mysqldescription_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[2]/tbody/tr[3]/td/input";
	public static final String ads_mysqldatastore_host_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[3]/tbody/tr[3]/td/input";
	public static final String ads_mysqldatastore_port_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[4]/tbody/tr[3]/td/input";

	public static final String ads_mysqljdbcusername_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[5]/tbody/tr[3]/td/input";
	public static final String ads_mysqljdbcpw_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[6]/tbody/tr[3]/td/input";
	public static final String ads_mysqlinstance_name_newui = "//*[@id='genericDataStoreInstanceObj1']/form/table[7]/tbody/tr[3]/td/input";
	public static final String ads_mysqldatastore_testconnection_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[2]/md-dialog-actions/button[1]/span";
	public static final String ads_msdatastore_save = "/html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[2]/md-dialog-actions/button[2]/span";

	// HDFS DATASTORE LOCATORS//

	public static final String ads_hdfsdatastore_newui = "html/body/div[1]/div[2]/section/md-sidenav/div[2]/div[3]/div/span[2]";
	public static final String ads_hdfsname_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/table/tbody/tr[3]/td/input";
	public static final String ads_hdfsdescription_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/table/tbody/tr[6]/td/input";
	public static final String ads_hdfsdatastore_WebHdfs_URL_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/table/tbody/tr[9]/td/input";
	public static final String ads_hdfsdatastore_WebHdfs_name_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/table/tbody/tr[12]/td/input";
	public static final String ads_hdfsdirpath_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/table/tbody/tr[15]/td/input";
	public static final String ads_hdfsmappedhivetable_newui = "html/body/div[1]/div[2]/section/div[2]/div/div/div[2]/div[1]/fieldset/form/table[6]/tbody/tr[3]/td/input";
	public static final String ads_hdfsrangerURL_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/table/tbody/tr[21]/td/input";
	public static final String ads_hdfsdatastore_rangerusername_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/table/tbody/tr[24]/td/input";
	public static final String ads_hdf_rangerpw_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/table/tbody/tr[27]/td/input";
	public static final String ads_hdfadvancesettings_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/div/a";
	public static final String ads_hdfskerberos_enable_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/div/table/tbody/tr[3]/td/input";
	public static final String ads_hdf_ssl_enable_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/div/table/tbody/tr[6]/td/input";
	public static final String ads_hdfkerberos_serviceprincipal_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/div/table/tbody/tr[9]/td/input";
	public static final String ads_hdfskerberos_userprincipal_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/div/table/tbody/tr[12]/td/input";
	public static final String ads_userkeytablocation_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[2]/div/table/tbody/tr[15]/td/input";
	public static final String ads_hdfs_testconnection_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[4]/md-dialog-actions/button[1]";
	public static final String ads_hdfs_savedatastore_newui = "/html/body/div[1]/div[2]/section/div[2]/div/div/div/div[4]/md-dialog-actions/button[2]/span";

	// ---------------------------------------------------------------------------------------------
	public static final String ads_name = "//input[@ng-model='newDataSource.name']";
	public static final String ads_description = "//input[@ng-model='newDataSource.description']";
	public static final String ads_metastore_host = "//input[@ng-model='newDataSource.dataStoreHost']";
	public static final String ads_metastore_port = "//input[@ng-model='newDataSource.dataStoreMetaStoreThriftServerURL']";
	public static final String ads_jdbc_port = "//input[@ng-model='newDataSource.dataStoreJdbcURL']";
	public static final String ads_file_system = "//input[@ng-model='newDataSource.fileSystem']";
	public static final String ads_wh_directory = "//input[@ng-model='newDataSource.warehouseDir']";
	public static final String ads_jobhistserver_url = "//input[@ng-model='newDataSource.jobHistoryServerUrl']";
	public static final String ads_testurl = "//input[@ng-model='newDataSource.fileSystem']";
	public static final String ads_testurl_mgs = "//input[@ng-model='newDataSource.fileSystem']";
	// public static final String ads_apptimeserver_url=
	// "//input[@ng-model='newDataSource.timelineServerUrl']";
	// public static final String
	// ads_apptimeserver_url="/html/body/div[1]/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[9]/td/input";
	public static final String ads_apptimeserver_url = "//input[@ng-model='newDataSource.timelineServerUrl']";
	public static final String ads_resourcemanager_url = "//input[@ng-model='newDataSource.resourceManagerServerUrl']";
	public static final String ads_jdbcusername = "//input[@ng-model='newDataSource.dataStoreJdbcUserId']";
	public static final String ads_jdbcpw = "//input[@ng-model='newDataSource.dataStoreJdbcUserPasswd']";
	public static final String ads_queueName = "//input[@ng-model='newDataSource.queueName']";
	public static final String ads_queueValue = "//input[@ng-model='newDataSource.queueValue']";
	public static final String ads_kerberosEanbled = "//input[@ng-model='newDataSource.kerberosEnabled']";
	public static final String ads_testconnection = "//input[@name='hiveTestConnection']";
	// public static final String ads_testconnection =
	// ".//*[@id='dialogContent_0']/md-content/md-dialog-actions/input[1]";
	public static final String ads_save = "//input[@name='saveHiveDataStore']";
	// public static final String ads_save =
	// ".//*[@id='dialogContent_0']/md-content/md-dialog-actions/input[2]";
	public static final String ads_cancel = "//input[@title='Cancel']";
	public static final String ads_close = "html/body/div[3]/md-dialog/md-content/md-toolbar/div/span[2]";
	public static final String ads_LeftPanel = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/ul";
	public static final String ads_hiveDataStore = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/ul/li[1]/span/span";
	public static final String ads_deleteDataStore = "html/body/div[1]/div[2]/div/div/div[2]/div/form/div/div[2]/input[2]";
	public static final String ads_deleteDataStoreOk = "html/body/div[1]/div[2]/div/div/div[2]/div/form/div/div[4]/input[1]";
	public static final String deletedataStore = "html/body/div[1]/div[2]/div/div/div[2]/div/form/div/div[2]/input[2]";
	public static final String deletedataStoreOk = "html/body/div[1]/div[2]/div/div/div[2]/div/form/div/div[4]/input[1]";

	public static final String ads_nzname = "html/body/div[3]/md-dialog/md-content/form/table/tbody/tr[1]/td/input";
	public static final String ads_nzdescription = "html/body/div[3]/md-dialog/md-content/form/table/tbody/tr[2]/td/input";
	public static final String ads_nzmetastore_host = "html/body/div[3]/md-dialog/md-content/form/table/tbody/tr[3]/td/input";
	public static final String ads_nzjdbc_port = "html/body/div[3]/md-dialog/md-content/form/table/tbody/tr[4]/td/input";
	public static final String ads_nzjdbcusername = "html/body/div[3]/md-dialog/md-content/form/table/tbody/tr[5]/td/input";
	public static final String ads_tdjdbcusername = "html/body/div[3]/md-dialog/md-content/form/table/tbody/tr[4]/td/input";
	public static final String ads_nzjdbcpw = "html/body/div[3]/md-dialog/md-content/form/table/tbody/tr[6]/td/input";
	public static final String ads_tdjdbcpw = "html/body/div[3]/md-dialog/md-content/form/table/tbody/tr[5]/td/input";
	public static final String ads_nzDefaultDB = "html/body/div[3]/md-dialog/md-content/form/table/tbody/tr[7]/td/input";
	public static final String ads_tdDefaultDB = "html/body/div[3]/md-dialog/md-content/form/table/tbody/tr[6]/td/input";
	public static final String ads_nzcancel = "html/body/div[3]/md-dialog/md-content/div[2]/input[3]";
	public static final String ads_nzDataStore = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/ul/li[5]/span/span";
	public static final String ads_tdDataStore = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div/div/div/ul/li[6]/span/span";
	public static final String deletenzdataStore = "html/body/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[2]/input[2]";
	public static final String deletenzdataStoreOk = "html/body/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[4]/input[1]";

	public static final String reverseEngineeringLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[2]/ul/li[4]/a/label";
	public static final String dataProfilingConfigurationLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[2]/ul/li[5]/a/label";

	public static final String userManagementLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[3]/a";
	public static final String userLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[3]/ul/li[1]/a/label";
	public static final String adduserbutton = "html/body/div[1]/div[2]/div/div/div/button";
	public static final String userAssignForm = "html/body/div[3]/md-dialog/md-content/form";

	public static final String authenticationLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[3]/ul/li[2]/a/label";
	public static final String changeAdminPasswordLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[3]/ul/li[3]/a/label";
	public static final String roleBasedAccessControlLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[3]/ul/li[4]/a/label";
	public static final String configureSchduledProcessLink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[3]/ul/li[5]/a/label";

	public static final String metadataLink = "/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/a";
	public static final String attributeLink = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[1]/a/label";
	public static final String da_addAttributeButton = "html/body/div[1]/div[2]/div/div[2]/div/div/button";
	public static final String da_addAttributeWindow = "md-default-theme"; // class
	public static final String da_logicalDataTypeCombo = "//*[@id='split-button']"; // id
	public static final String da_logicalDataTypeList = "dropdown-menu"; // class
	public static final String da_logicalAttributeName = "logicalName"; // name
	public static final String da_physicalAttributeName = "physicalName"; // name
	public static final String da_attributeDescription = "Description"; // name
	public static final String da_isSensitiveCB = "html/body/div[3]/md-dialog/md-content/form/div/div[7]/input[1]";
	public static final String da_sensitivityType = "sensitivityType"; // name
	public static final String da_summary = "summary"; // name
	public static final String da_save_layout = "//button[@aria-label='submitbtn']"; // xpath

	public static final String da_save = "md-button-inner"; // class

	public static final String da_attributeSearchText = "html/body/div[1]/div[2]/div/div[2]/div/table/thead/tr[2]/th[1]/input";
	public static final String da_attributeSearchTextClickhere = "html/body/div[1]/div[2]/div/div[2]/div/table/thead/tr[2]/th[3]/span[1]/span/a";
	public static final String da_attributesearchresult_create = "html/body/div[1]/div[2]/div/div[2]/div/table/tbody[2]/tr/td[1]";
	public static final String da_attributesearchresult_delete = "html/body/div[1]/div[2]/div/div[2]/div/table/tbody/tr/td";
	public static final String da_attributesearchCloseButton = "html/body/div[1]/div[2]/div/div[2]/div/table/thead/tr[2]/th[3]/span[2]/button";
	public static final String da_attributeEditButton = "/html/body/div[1]/div[2]/div/div[2]/div/table/tbody[2]/tr/td[12]/a[1]";
	public static final String da_attributeDeleteButton = "/html/body/div[1]/div[2]/div/div[2]/div/table/tbody[2]/tr/td[12]/a[2]";
	public static final String da_editLogicalDataTypeCombo = "html/body/div[1]/div[2]/div/div[2]/div/table/tbody[2]/tr/td[5]/select";
	public static final String da_editLogicalDataTypeOk = "html/body/div[1]/div[2]/div/div[2]/div/table/tbody[2]/tr/td[12]/button";
	public static final String da_editlogicalDataTypeDisplay = "html/body/div[1]/div[2]/div/div[2]/div/table/tbody[2]/tr/td[5]";

	public static final String forwardEngineering = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[6]/a";

	public static final String tableModeling = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[6]/ul/li[4]/a/label";
	// public static final String leftTree =
	// "//*[@id='OrganizationEntity']/div/div/div/div[1]/div/div[2]/ul/li";
	public static final String leftTree = "//*[@id=\"org-entity-tree\"]/ul/li";

	public static final String dt_orgEntityList = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/ul/li";
	public static final String dt_orgEntityList_selected = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/ul/li/span/span";
	public static final String dt_OrgTreeTab = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/ul/li[1]";
	public static final String dt_logicalTableTab = ".//*[@id='tabs']/ul/li[2]";
	public static final String dt_addlogicalTableButton = ".//*[@id='viewTwo']/div[2]/button";
	public static final String dt_addlogicalTableWindow = "logicalFormForm";
	public static final String dt_addlogicalTableWindowClose = "";
	public static final String dt_createlogicalTableNameText = "logicalFormName";
	public static final String dt_createlogicalTableDescText = "//*[@id='taTextElement6445748278721837']/p";

	public static final String dt_createlogicalTableSelectAttributeCombo = "//*[@id='selectac']/div/a";
	public static final String dt_createlogicalTableSelectAttributeListInput = "//*[@id='selectac']/div/div/div/input";
	public static final String dt_createlogicalTableSelectAttributeListSelected = "//*[@id='selectac']/div/div/ul/li[1]";
	public static final String dt_createlogicalTableSelectAttributeListDisplay = "html/body/div[5]/md-dialog/md-content/form/div[4]/div/table/tbody/tr/td[1]";
	public static final String dt_createlogicalWindow = "logicalFormForm";
	public static final String dt_createlogicalRichTextForm = "form-group";
	public static final String dt_createlogicalRichTextFormInner = "logicalFormcomment";
	public static final String dt_createlogicalRichTextFormInput = "//*[@id='taTextElement9334504280883060']";
	public static final String dt_createlogicalTableSaveCancelButtonForm = "md-actions";
	public static final String dt_createlogicalTableSaveCancelButton = "md-button-inner";
	public static final String dt_createlogicalTableCancelButton = "html/body/div[5]/md-dialog/md-content/form/div[5]/md-button[1]/button";
	public static final String dt_createlogicalTableSaveButton = ".//*[@id='logical-page']/md-dialog-actions/button[1]";

	public static final String dt_logicalTableSearchText = "//input[@placeholder='Logical Table Name']";
	public static final String dt_logicalTableSearchResult = "//*[@id='logical-table-grid']/tbody[1]/tr/td[1]/a";
	// *[@id="logical-table-grid"]/tbody[1]/tr[1]/td[1]/a
	public static final String dt_logicalTableSearchResultLink = ".//*[@id='viewTwo']/table/tbody[1]/tr[1]/td[1]/a";
	public static final String dt_logicalTableSearchResultTableBody = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div";
	public static final String dt_logicalTableSearchResultLinkDisplay = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[4]/div/div/div[2]";
	public static final String dt_logicalTableSearchResultLinkDisplayClose = "//*[@id='logicaTbl-dialog']/div/div/div/button";
	// "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[4]/div/div/div[1]/button";

	public static final String dt_logicalTableEditButton = "//*[@title='Add Column']";
	public static final String dt_logicalTableSettingButton = ".//*[@id='viewTwo']/table/tbody[1]/tr/td[5]/a[1]";
	public static final String dt_logicalTableEditWindow = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[5]/div/div/div[2]";

	// public static final String dt_editlogicalTableColumnCombo =
	// "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[5]/div/div/div[2]/table/thead/tr[2]/th/div[1]/div/div/a/div/b";
	public static final String dt_editlogicalTableColumnCombo = "//*[@id='selectac123']/div/a/span";

	public static final String dt_editlogicalTableColumnInput = "//*[@id='selectac123']/div/div/div/input";
	// public static final String dt_editlogicalTableColumnInputSelect =
	// "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[5]/div/div/div[2]/table/thead/tr[2]/th/div[1]/div/div/div/ul/li[1]";
	public static final String dt_editlogicalTableColumnInputSelect = "//*[@id='selectac123']/div/div/ul/li";
	// public static final String dt_editlogicalTableColumnUpdateButton =
	// "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[5]/div/div/div[2]/md-button[1]/button";
	public static final String dt_editlogicalTableColumnUpdateButton = "//*[@aria-label='submitbtn']";
	// public static final String dt_editlogicalTableColumnCancelButton =
	// "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[5]/div/div/div[2]/md-button[2]/button";
	public static final String dt_editlogicalTableColumnCancelButton = ".//*[@id='complete-dialog']/div/div/div[2]/md-button[2]/button";
	public static final String dt_removelogicalTableColumnSearchText = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[5]/div/div/div[2]/table/thead/tr[2]/th/div[2]/input";
	public static final String dt_removelogicalTableColumnButton = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[5]/div/div/div[2]/table/tbody/tr/td[3]/a";
	public static final String dt_moveLogicalTableIcon = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody[1]/tr/td[5]/a[3]";
	public static final String dt_moveLogicalTableWindow = "html/body/div[3]/md-dialog/md-content";
	public static final String dt_moveLogicalTableTargetEntity = "html/body/div[6]/md-dialog/md-content/div/div/div[2]/ul/li/div/ul/li[4]/span/span";
	public static final String dt_moveLogicalTableSaveButton = "html/body/div[3]/md-dialog/div/md-button[1]/button";
	public static final String dt_deleteLogicalTableIcon = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody[1]/tr/td[5]/a[1]";
	public static final String dt_lt_browseByTagsButton = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[3]/button";
	public static final String dt_lt_addTagsButton = "html/body/div[1]/div[2]/div[1]/div/button";
	public static final String dt_lt_at_window = "html/body/div[4]/div/div";
	public static final String dt_lt_at_tagName = "html/body/div[4]/div/div/div/div[3]/div[1]/input";
	public static final String dt_lt_at_tagDesc = "html/body/div[4]/div/div/div/div[3]/div[2]/textarea";
	public static final String dt_lt_at_addTagButton = "html/body/div[4]/div/div/div/div[3]/div[2]/button";
	public static final String dt_lt_at_addTagCloseButton = "html/body/div[4]/div/div/div/div[1]/a";
	public static final String dt_lt_bt_searchByLT = "html/body/div[1]/div[2]/div[2]/div/span[1]/input";
	public static final String dt_lt_bt_searchButton = "html/body/div[1]/div[2]/div[2]/div/button";
	public static final String dt_lt_bt_manageTagsButton = "html/body/div[1]/div[2]/div[2]/table/tbody[1]/tr/td[4]/span/button";
	public static final String dt_lt_bt_manageTagsTagList = "html/body/div[1]/div[2]/div[2]/table/tbody[1]/tr/td[4]/span/div/a/b";
	public static final String dt_lt_bt_manageTagsTagListInput = "html/body/div[1]/div[2]/div[2]/table/tbody[1]/tr/td[4]/span/div/div/div[1]/input";
	public static final String dt_lt_bt_manageTagsTagListInputSelect = "html/body/div[1]/div[2]/div[2]/table/tbody[1]/tr/td[4]/span/div/div/ul/li[1]/a";
	public static final String dt_lt_bt_manageTagsTagListInputSelectSave = "html/body/div[1]/div[2]/div[2]/table/tbody[1]/tr/td[4]/button[1]";
	public static final String dt_lt_bt_searchByTagsRadio = "html/body/div[1]/div[2]/div[2]/div/label[2]/input";
	public static final String dt_lt_bt_searchByTagsRadioList = "html/body/div[1]/div[2]/div[2]/div/span[2]/div/a/b";
	public static final String dt_lt_bt_searchByTagsRadioListInput = "html/body/div[1]/div[2]/div[2]/div/span[2]/div/div/div[1]/input";
	public static final String dt_lt_bt_searchByTagsRadioListInputSelect = "html/body/div[1]/div[2]/div[2]/div/span[2]/div/div/ul/li[1]/a";
	public static final String dt_lt_bt_searchResultTableNameSearchText = "html/body/div[1]/div[2]/div[2]/table/thead/tr[2]/th[2]/input";
	public static final String dt_lt_bt_searchResultTableNameSearchResult = "html/body/div[1]/div[2]/div[2]/table/tbody[1]/tr/td[2]";

	public static final String dt_physicalTableTab = ".//*[@id='tabs']/ul/li[3]";
	public static final String dt_physicalTableSearchText = "//*[@id='physical-table-grid']/thead/tr[2]/th[1]/input";
	public static final String dt_physicalTableDSSearchText = "//input[@placeholder='Data Store']";
	public static final String dt_physicalTableDBSearchText = "//input[@placeholder='Database']";
	public static final String dt_physicalTableSearchResult = "//*[@id='physical-table-grid']/tbody[1]/tr[1]/td[1]/a";
	public static final String dt_pt_createPhysicalTableButton = ".//*[@id='viewThree']/div[2]/button";
	public static final String dt_pt_exportInExcelButton = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div[3]/button[2]";
	public static final String dt_pt_deletePhysicalTableButton = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/table/tbody[1]/tr/td[8]/a";
	public static final String dt_pt_FirstResult = "//*[@id='viewFour']/table/tbody[1]/tr/td[1]";

	public static final String dt_pt_ct_window = "md-default-theme"; // class
	public static final String dt_pt_ct_dataStroreType = ".//*[@id='physical-page']/md-content/div/div/div/div/select";
	public static final String dt_pt_ct_dataStroreTypeSelect = "1"; // value;
	public static final String dt_pt_ct_dataStore = ".//*[@id='physical-page']/md-content/div/div/div[2]/div[1]/select";
	public static final String dt_pt_ct_dataStoreSelect = "2"; // value; cdh
	public static final String dt_pt_ct_database = ".//*[@id='physical-page']/md-content/div/div/div[2]/div[2]/select";
	public static final String dt_pt_ct_databaseSelect = "testdb1"; // value;
	public static final String dt_pt_ct_logicalTable = "//*[@placeholder='Select Logical Table']";
	// public static final String dt_pt_ct_logicalTableSearch =
	// "html/body/div[3]/md-dialog/md-content/div/div/div[2]/div[3]/div/div/div[1]/input";
	public static final String dt_pt_ct_logicalTableSearch = "//*[@placeholder='Search for Logical Table']";
	// public static final String dt_pt_ct_logicalTableSelect =
	// "html/body/div[3]/md-dialog/md-content/div/div/div[2]/div[3]/div/div/ul/li[1]/a";
	// public static final String logicalTableSelect = "//*[@placeholder='Select
	// Logical Table']";

	// public static final String dt_pt_ct_logicalTableSelect =
	// "html/body/div[5]/md-select-menu/md-content/md-optgroup/md-option[1]";
	public static final String dt_pt_ct_logicalTableSelect = "//*[@ng-value='logical.logicalTableID' and @tabindex='0']";
	public static final String dt_pt_ct_physicalTable = "physicalFormName"; // name
	// public static final String
	// dt_pt_ct_physicalTable="html/body/div[3]/md-dialog/md-content/div/div/div[2]/div[4]/input";
	public static final String dt_pt_ct_physicalTableDesc = "physicalFormDesc"; // name
	// public static final String dt_pt_ct_physicalTableDesc =
	// "html/body/div[3]/md-dialog/md-content/div/div/div[2]/div[5]/input";
	public static final String dt_pt_ct_TableTypeManaged = ".//*[@id='physical-page']/md-content/div/div/div[2]/div[6]/md-radio-group/div/div[1]/md-radio-button/div[1]/div[1]";
	public static final String dt_pt_ct_TableTypeExternal = ".//*[@id='physical-page']/md-content/div/div/div[2]/div[6]/md-radio-group/div/div[2]/md-radio-button";
	// public static final String dt_pt_ct_TableLocation = "Location"; // name
	public static final String dt_pt_ct_TableLocation = ".//*[@id='physical-page']/md-content/div/div/div[2]/div[7]/input";
	public static final String dt_pt_ct_ColumnName1 = "//*[@id='physical-page']/md-content/div/div/div[2]/table[1]/tbody/tr[1]/td[4]/md-checkbox/div[1]";
	public static final String dt_pt_ct_PartitionColumn1 = ".//*[@id='physical-page']/md-content/div/div/div[2]/table[1]/tbody/tr[1]/td[4]/md-checkbox/div[1]/div";
	public static final String dt_pt_ct_storageFormat = ".//*[@id='physical-page']/md-content/div/div/div[2]/div[8]/select";
	public static final String dt_pt_ct_storageFormatSelect = "";
	public static final String dt_pt_ct_fieldsDelimChar = ".//*[@id='physical-page']/md-content/div/div/div[2]/div[9]/input";
	public static final String dt_pt_ct_linesDelimChar = ".//*[@id='physical-page']/md-content/div/div/div[2]/div[11]/input";

	public static final String dt_pt_ct_saveButton = "//*[@id='physical-page']/md-dialog-actions/button[1]/span";

	public static final String dt_publishTableTab = ".//*[@id='tabs']/ul/li[4]";
	public static final String dt_publishTableSearchText = "//*[@placeholder='Physical Table Name']";
	public static final String dt_publishTableDSSearchText = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/thead/tr[2]/th[4]/input";
	public static final String dt_publishTableDBSearchText = "//*[@placeholder='Database']";
	public static final String dt_publishTableChkb = "//*[@id='viewFour']/table/tbody[1]/tr/td[8]/md-checkbox/div[1]";
	public static final String dt_publishTableButton = "//*[@id='viewFour']/div[2]/button";

	// menu links
	public static final String lineageLink = "html/body/div[1]/div[1]/div[1]/ul/li[4]/a/label";
	public static final String dataLineageLink = "html/body/div[1]/div[1]/div[1]/ul/li[4]/ul/li/a/label";
	public static final String profilingLink = "html/body/div[1]/div[1]/div[1]/ul/li[5]/a/label";

	public static final String configureDataProfiling = "html/body/div[1]/div[1]/div[1]/ul/li[5]/ul/li[1]/a/label";
	public static final String basicDataProfilingLink = "html/body/div[1]/div[1]/div[1]/ul/li[5]/ul/li[2]/a/label";
	public static final String advancedDataProfilingLink = "html/body/div[1]/div[1]/div[1]/ul/li[5]/ul/li[3]/a/label";
	public static final String reportsLink = "html/body/div[1]/div[1]/div[1]/ul/li[6]/a/label";
	public static final String deltaReportLink = "html/body/div[1]/div[1]/div[1]/ul/li[6]/ul/li[1]/a/label";
	public static final String customReportLink = "html/body/div[1]/div[1]/div[1]/ul/li[6]/ul/li[2]/a/label";
	public static final String topAccessedReportLink = "html/body/div[1]/div[1]/div[1]/ul/li[6]/ul/li[4]/a/label";
	public static final String lastAccessedReportLink = "html/body/div[1]/div[1]/div[1]/ul/li[6]/ul/li[3]/a/label";
	public static final String searchLink = "html/body/div[1]/div[1]/div[1]/ul/li[7]/a/label";
	public static final String keywordBasedLink = "html/body/div[1]/div[1]/div[1]/ul/li[7]/ul/li[1]/a/label";
	public static final String browseByTags = "html/body/div[1]/div[1]/div[1]/ul/li[7]/ul/li[2]/a/label";
	public static final String helpLink = "html/body/div[1]/div[1]/div[1]/ul/li[9]/a/label";
	public static final String metadataConfig = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[5]/a/label";
	public static final String metadataDefine = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[1]/a/label";

	public static final String searchData = "html/body/div[1]/div[2]/div/div/div[1]/span";
	public static final String helpGuide = "html/body/div[1]/div[2]/div/div/div[2]/div/div[1]/md-content/span[4]/a[2]";
	public static final String helpPageTitle = ".//*[@id='topic_header_text']";
	public static final String helpPageVersion = "/html/body/div[1]/div[2]/div/div/div[2]/div/div[1]/md-content/span[1]/h3/span";
	public static final String helpPageTitleMsg = "Help guide";
	// new added
	public static final String configureProfiling = "html/body/div[1]/div[1]/div[1]/ul/li[5]/ul/li[1]/a/label";

	// search
	public static final String searchDataMsg = "Search Data";
	public static final String searchinput = "html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[1]/input";
	public static final String searchinputButton = "html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[2]/a";
	public static final String searchContents = "airline3";
	public static final String searchOrganizationEntityType = "Enterprise";
	public static final String searchOrganizationEntityName = "Enterprise";
	public static final String dataStoreName = "hdp";
	public static final String dataStoreType = "hive";

	public static final String organizationEntityTypeXpath = "html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[1]/div";
	public static final String organizationEntityNameXpath = "html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[2]/div";
	public static final String dataStoreNameXpath = "html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[4]/div";
	public static final String dataStoreTypeXpath = "html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[3]/div";
	// html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[6]/span
	public static final String tableData = "html/body/div[1]/div[2]/div/div/div[2]/div[2]/div[6]/div";
	// Landingpage - Dashboard
	public static final String usedAttributes = "html/body/div[1]/div[2]/div/div[2]/ul/li[1]/div[1]/div[1]";
	public static final String usedAttributes_design_icon_link = "html/body/div[1]/div[2]/div/div[2]/ul/li[1]/div[1]/div[1]/a/span";
	public static final String UsedAttributes_design_icon_link = "html/body/div[1]/div[2]/div/div[2]/ul/li[2]/div[1]/div[1]/a/span";
	public static final String vennchart_link = "html/body/div[1]/div[2]/div/div[2]/ul/li[2]/div[1]/div[2]/div[1]/ul/li[2]";
	public static final String deltaReport_VennChart_Metadata = "//*[@id='piechartlist']/svg/g[2]/path";
	public static final String deltaReport_VennChart_eCat = "//*[@id='piechartlist']/svg/g[3]/path";
	public static final String deltaReport_PieChart_Label = "html/body/div[1]/div[2]/div/div[2]/ul/li[2]/div[1]/div[1]/span";
	public static final String piechart_link = "html/body/div[1]/div[2]/div/div[2]/ul/li[2]/div[1]/div[2]/div[1]/ul/li[1]";

	// CsvImport
	// public static final String metadata_link =
	// "html/body/div[1]/div[1]/div[1]/ul/li[3]/a/label";
	public static final String bulk_upload = "/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/ul/li[3]/a/label";
	public static final String downloadCsv = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div[2]/input";
	public static final String Browser = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div[3]/div[1]/label[2]";
	public static final String upload = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div[3]/div[3]/input";
	public static final String uploadmessage = "//*[@id='toasty-container']/div/div/span[2]";
	public static final String uploadmessage_close = "//*[@id='toasty-container']/div/button";
	public static final String notification_link = "/html/body/div[1]/div[1]/nav/div/ul[2]/li[1]/a[1]/noti-popup/span";
	public static final String notification_statusbar = "//*[@id='hoursChart3']/div/div";
	public static final String notification_message_link = "//*[@id='top-slider-content']/div[1]/div/div[3]";
	public static final String notification_message_read = "//*[@id='top-slider-content']/div[1]/div/div[3]/i";
	public static final String notification_message = "//*[@id='top-slider-content']/div/div/div[5]/span[4]";
	public static final String notification_message_close = "//*[@id='top-slider-content']/div/div/div[5]/span[1]";
	public static final String notification_acknowledge = "//*[@id='top-slider-content']/div/div/div[4]/i[1]";
	public static final String notification_clearall = "//*[@id='bottom-content']/div[1]/span[2]/a";
	public static final String uploadedfile = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div[3]/div[4]/div/table/tbody/tr[1]/td[1]";
	public static final String logicaltable = "//*[@id='tabs']/ul/li[2]";
	public static final String logicaltablewindow_close = "//*[@id='logicaTbl-dialog']/div/div/div/button";
	public static final String physicaltable = "//*[@id='tabs']/ul/li[3]";
	public static final String physicaltablewindow_close = "//*[@id='physicalTbl-dialog']/div/div/div[1]/button";
	public static final String publishtable = "//*[@id='tabs']/ul/li[4]/span[2]";
	// *[@id="tabs"]/ul/li[4]/span[2]
	public static final String createtable_button = "//*[@id='viewFour']/div[2]/button/svg";
	public static final String createtable = "//*[@id='dialogContent_3']/md-content/div[1]/a[3]/label";
	public static final String publishtable_searchtext = "//*[@id='publish-tables-grid']/thead/tr[2]/th[1]/input";
	public static final String publishtable_searchresult = "//*[@id='publish-tables-grid']/tbody[1]/tr/td[1]";
	public static final String selecttable = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody[1]/tr/td[8]/md-checkbox/div[1]/div";
	public static final String createtablebutton = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div[2]/md-button/button";

	public static final String createtable_message = "html/body/div[2]/div/div/div";
	public static final String dellogicaltable = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody[1]/tr/td[5]/a[1]";
	public static final String searchtable = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody[3]/tr[2]/td";
	public static final String userdefined_metadata_link = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[3]/a";
	public static final String property_mapping = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[3]/ul/li[1]/a/label";
	public static final String category_name = "//tbody/tr/td[1]/span";
	public static final String property_name = "//tbody/tr/td[1]/span";
	public static final String datastore_name_list = "html/body/div[1]/div[2]/div/div[2]/div[1]/entity-tree-menu/div/div/div/div/div/div/div/div/div/ul/li/span/md-button/button";
	public static final String category_name_metadata = "//tbody/tr/td[1]/span/div";

	public static final String prop_entity_map_link = "html/body/div[1]/div[2]/div[2]/div/div[2]/aside[1]/ul/li[2]/a";
	public static final String logical_link = "html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/ul/li[2]";
	public static final String entitieslist = "html/body/div[1]/div[2]/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/ul/li/span/md-button/button";

	public static final String create_physical_table = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/div[2]/md-button/button";
	public static final String metadatalink = "/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/a";
	public static final String definelink = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[1]/a/label";
	public static final String setuplink = "html/body/div[1]/div[1]/div[1]/ul/li[2]/a/label";
	public static final String metadata_configuration = "html/body/div[1]/div[1]/div[1]/ul/li[2]/ul/li[5]/a/label";
	public static final String forwardengineering = "html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/ul/li[6]/a";
	public static final String table_modelling = "html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/ul/li[6]/ul/li[4]/a/label";

	// metadata by aboli

	public static final String metadata_link = "/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/a";

	public static final String browse_link = "/html/body/div[1]/div[1]/nav/div/ul[1]/li[3]/ul/li[2]/a";

	public static final String expand_template = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/div[1]/multi-droplist/div/a";

	public static final String metadata_icon = "html/body/div[1]/div[2]/section/div[2]/div/div[3]/div[1]/div/div/div[2]/div[1]/ul/li[4]";
	public static final String prop_searcjh_textbox = "html/body/div[1]/div[2]/section/div[2]/div/div[3]/div[3]/div/h1/span/span[3]/input";

	public static final String prop_value = "html/body/div[1]/div[2]/section/div[2]/div/div[3]/div[3]/div/div/div/div/div[1]/div[3]/div[6]/div[2]/div/div[2]/div/div[1]/table/tbody/tr/td[2]/span[2]/div/span[2]";

	public static final String prop_value_edit = "//div[@class='ecat-metadata-accordion ecat-fadein']/div[5]/div[1]/div/div[2]/div[1]/a[1]/span";
                                                                  	//*[@id="mCSB_87_container"]/div[3]/div[6]/div[1]/div/div[2]/div[1]/a[1]/span[1]
	public static final String prop_value_textbox = "html/body/div[1]/div[2]/section/div[2]/div/div[3]/div[3]/div/div/div/div/div[1]/div[3]/div[6]/div[2]/div/div[2]/div/div[1]/table/tbody/tr/td[2]/span[1]/form/textarea";
	
	public static final String prop_value_save = "//div[@class='ecat-metadata-accordion ecat-fadein']/div[6]/div[1]/div/div[2]/div[1]/a[2]/span";
	//div[@class='ecat-metadata-accordion ecat-fadein']/div[5]/div[1]/div/div[2]/div[1]/a[2]/span
	// Titles/text
	// public static final String titleHomePage="eCat logo displayed";

	public static final String addedTagSearchfield = ".//*[@id='closeSide']/div[4]/table/thead/tr[2]/th[1]/input";
	public static final String displayedTagSearchfield = ".//*[@id='closeSide']/div[4]/table/tbody[1]/tr/td[1]";
	public static final String searchButton = ".//*[@id='searchAssignTags']/div/button";
	public static final String searchTextField = ".//*[@id='searchAssignTags']/div/span[1]/input";
	public static final String managetagsbutton = ".//*[@id='searchAssignTags']/table/tbody[1]/tr/td[4]/span/button";
	public static final String tableNameXpath = ".//*[@id='searchAssignTags']/table/tbody[1]/tr/td[2]";
	public static final String tagNameXpath = ".//*[@id='searchAssignTags']/table/tbody[1]/tr/td[3]/tag-manager/div/span";
	public static final String searchbytagName = ".//*[@id='searchAssignTags']/table/tbody[1]/tr/td[4]/span/div/a/b";
	public static final String radioButton = ".//*[@id='searchAssignTags']/div/label[2]/input";
	public static final String radioList = ".//*[@id='searchAssignTags']/div/label[2]/input";
	public static final String allSearchChkBox = ".//*[@id='allsearch']";

	public static final String searchOrgEntType = "html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[4]/label[1]/span";
	public static final String searchOrgEntName = "html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[4]/label[2]/span";
	public static final String searchdatStoreType = "html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[4]/label[3]/span";
	public static final String searchdataStoreName = "html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[4]/label[4]/span";
	public static final String searchDatabase = "html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[4]/label[5]/span";
	public static final String searchTable = "html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[4]/label[6]/span";
	public static final String searchColumn = "html/body/div[1]/div[2]/div/div/div[2]/div[1]/div[4]/label[7]/span";

	// data profiling
	public static final String nextButton = " html/body/div[1]/div[2]/div/div/div[3]/div/div/div/div[1]/div[2]/button";
	public static final String customSelect = "html/body/div[1]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/button";
	public static final String customSelectSearch = "html/body/div[3]/md-dialog/md-content/div/table/thead/tr/td[2]/input";
	public static final String projectSelect = "html/body/div[3]/md-dialog/md-content/div/table/tbody/tr[1]/td[1]/input";
	public static final String saveButton = "html/body/div[3]/md-dialog/div/md-button[1]/button";
	public static final String saveConfiguration = "html/body/div[1]/div[2]/div/div/div[3]/div/div/div[1]/div[1]/div[2]/button[2]";
	public static final String dataBaseBody = "html/body/div[1]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div[2]/table/tbody";

	// data Store
	public static final String datastoreName = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]";
	public static final String datastoreDescription = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]";
	public static final String warehouseDirectory = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[3]/td[2]";
	public static final String fileSystem = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[4]/td[2]";
	public static final String metastoreHost = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[5]/td[2]";
	public static final String metastorePort = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[6]/td[2]";
	public static final String jobHistoryServerUrl = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[7]/td[2]";
	public static final String databasesCount = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[8]/td[2]";
	public static final String databaseName = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]";
	public static final String databaseOwnerName = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]";
	public static final String databaseLocation = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[3]/td[2]";
	public static final String tableCount = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[4]/td[2]";

	public static final String hdpElement = "html/body/div[1]/div[2]/div/div/div[3]/div/div/div/div[2]/div[1]/div[1]/md-checkbox/div[1]/div";
	public static final String cdhElement = "html/body/div[1]/div[2]/div/div/div[3]/div/div/div/div[2]/div[2]/div[1]/md-checkbox/div[1]/div";
	public static final String hiveElement = "html/body/div[1]/div[2]/div/div/div[3]/div/div/div/div[2]/div[3]/div[1]/md-checkbox/div[1]/div";
	public static final String searchSchedular = "html/body/div[1]/div[2]/div/div/div[2]/div/div[1]/table/thead/tr[2]/th[2]/input";

	public static final String executeButton = "//button[@ng-click='executeSchedulerNow(scheduler)']";
	public static final String tableName = ".//*[@id='treeview']/ul/li[1]/span/strong/span";
	public static final String outPuttest_data_path = System.getProperty("user.dir")
			+ "//src//test//resources//data//BasicDataProfilingDataOutput.xlsx";

	// Dashboard
	public static final String technicalViewEnlarge = "html/body/div[1]/div[2]/div/div[2]/ul/li[4]/div/div[1]/span[2]/span[1]";
	public static final String technicalViewEnlargeClose = "html/body/div[1]/div[2]/div/div[2]/ul/li[4]/div/div[2]/div[1]/div/span[2]/a";

	// admin
	public static final String schedulerStatus = "html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/table/tbody/tr/td[5]/span";

	// notifications
	public static final String notificationIcon = "html/body/div[1]/div[1]/div[2]/noti-popup/span/i";
	public static final String notificationNotFoundMsg = "Notifications not found!";
	public static final String notificationWindow = "html/body/div[1]/div[1]/div[2]/noti-popup/span/div/div[3]/div";

	// reverse eng
	public static final String re_LeftPanel = "html/body/div[1]/div[2]/div/div/div/div[3]/div[1]/ul/li";
	public static final String re_selectTableSearch = "//*[@placeholder='Search for table']";
	// public static final String
	// re_selectTableSelect="html/body/div[4]/md-select-menu/md-content/md-optgroup/md-option[1]/div[1]";
	public static final String re_selectTableSelect = "//*[@ng-value='option.tableName' and @tabindex='0']";
	public static final String re_importTableButton = "//*[@id='schemaReverseEngineering']/div/div/div[2]/div/div[2]/div[2]/div[6]/div[2]/div/button";
	public static final String re_importTableButtonNz = "/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[6]/div[2]/div/button";
	public static final String re_importMsg = "//*[@id='schemaReverseEngineering']/div/div/div[2]/div/div[2]/div[2]/div[6]/div[2]/div/div[2]/span[1]";
	public static final String re_importMsgNz = "//*[@id='schemaReverseEngineering']/div/div/div[2]/div/div[2]/div[2]/div[6]/div[2]/div/div[2]/span[1]";
	public static final String re_importedTbl1 = "html/body/div[1]/div[2]/div/div/div/div[3]/div[3]/div[6]/div[2]/div/div[2]/ul/li/span";
	public static final String re_importedTbl1Nz = "html/body/div[1]/div[2]/div/div/div/div[3]/div[3]/div[6]/div[2]/div/div[2]/ul/li/span";

	// lineage
	public static final String lg_viewFirstButton = "html/body/div[1]/div[2]/div/div/section/ul/div/div[1]/div[1]/table/tbody/tr/td[3]/button";
	public static final String lg_viewFilterDataButton = "html/body/div[1]/div[2]/div/div/section/ul/div/div[2]/table/tbody/tr[2]/td[1]";
	public static final String lg_selectDataStore = "html/body/div[1]/div[2]/div/div/section/ul/div/div[1]/div[2]/table/tbody/tr[2]/td[1]/select";
	public static final String lg_selectDateChkb = "html/body/div[1]/div[2]/div/div/section/ul/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/md-checkbox/div[1]/div[1]";
	public static final String lg_BatchIdButton = "html/body/div[1]/div[2]/div/div/section/ul/div/div[1]/div[2]/table/tbody/tr[2]/td[3]/dropdown-ready/div/button[1]";
	public static final String lg_BatchIdSearch = "html/body/div[1]/div[2]/div/div/section/ul/div/div[1]/div[2]/table/tbody/tr[2]/td[3]/dropdown-ready/div/div/input";
	public static final String lg_BatchIdSelect = "html/body/div[1]/div[2]/div/div/section/ul/div/div[1]/div[2]/table/tbody/tr[2]/td[3]/dropdown-ready/div/div/span/ul/li";
	public static final String lg_viewButton = "html/body/div[1]/div[2]/div/div/section/ul/div/div[1]/div[2]/table/tbody/tr[2]/td[5]/button";
	public static final String lg_viewGraph = "html/body/div[1]/div[2]/div/div/section/ul/div/div[5]/svg/g/g[1]/path[1]";

	// Advance Profiling
	public static final String dataCompletenessConfig = "html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/div[1]/a/span";
	public static final String dataConformityConfig = "html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/a/span";
	public static final String accuracyConfig = "html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/div[1]/a/span";
	public static final String duplicationConfig = "html/body/div[1]/div[2]/div/div[2]/div/div/div[4]/div/div[1]/a/span";
	public static final String dataConsistencyConfig = "html/body/div[1]/div[2]/div/div[2]/div/div/div[5]/div/div[1]/a/span";
	public static final String createRuleButton = "html/body/div[4]/div/div/div/div[1]/div/div/table/tbody/tr[1]/td[4]/button";
	public static final String ruleName = ".//*[@id='viewOne']/form/div[1]/div/input";
	public static final String ruleDesc = ".//*[@id='viewOne']/form/div[2]/div/textarea";
	public static final String addNewRule = ".//*[@id='tabs']/ul/li[2]/span";
	public static final String isActiveButton = ".//*[@id='viewOne']/form/div[3]/table/tbody/tr[1]/td[2]/input";
	public static final String SaveRule = ".//*[@id='viewOne']/form/div[6]/div[2]/input[1]";
	public static final String toastyMessage = ".//*[@id='toasty-container']/div/div";
	public static final String columnNameselectdropdown = ".//*[@id='tagsSelect']/a/b";
	public static final String columnNameSearchBox = ".//*[@id='tagsSelect']/div/div[1]/input";
	public static final String selectColumn = ".//*[@id='tagsSelect']/div/ul/li[1]/a";
	public static final String operatorList = ".//*[@id='viewOne']/form/div[3]/table/tbody/tr[3]/td[3]/div[1]/input";
	public static final String addButton = ".//*[@id='viewOne']/form/div[4]/div/input";
	public static final String editRule = ".//*[@id='tabs']/ul/li[3]";
	public static final String selectRule = ".//*[@id='viewThree']/form/div[1]/div/span/a/b";
	public static final String searchRule = ".//*[@id='viewThree']/form/div[1]/div/span/div/div[1]/input";
	public static final String selectSearchedRule = ".//*[@id='viewThree']/form/div[1]/div/span/div/ul/li[1]/a";
	public static final String ruleNameTextBox = ".//*[@id='viewThree']/form/div[2]/div/input";
	public static final String saveEditedRule = ".//*[@id='viewThree']/form/div[7]/div[2]/input[1]";
	public static final String editRuleToastyMessage = ".//*[@id='toasty-container']/div/div/span[1]";
	public static final String viewRuleButton = ".//*[@id='viewOne']/form/div[1]/div/div/a/b";
	public static final String enterRuleName = ".//*[@id='viewOne']/form/div[1]/div/div/div/div[1]/input";
	public static final String selectApplyRule = ".//*[@id='viewOne']/form/div[1]/div/div/div/ul";
	public static final String applyRule = ".//*[@id='viewOne']/form/div[4]/div[2]/input[1]";
	public static final String SchedularStatus = "html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/table/tbody/tr/td[5]/span";
	public static final String dataCompletenesspointId = "chartprofile1";
	public static final String dataConfirmitypointId = "chartprofile2";
	public static final String dataAccuracypointId = "chartprofile3";
	public static final String dataDuplicationpointId = "chartprofile4";
	public static final String dataConsistencypointId = "chartprofile6";

	// pankaj
	// in design top menu
	public static final String categorizedMetadatalink = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[4]/a";

	public static final String metadataMappinglink = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[4]/ul/li[1]/a";
	public static final String metadataManagementlink = "html/body/div[1]/div[1]/div[1]/ul/li[3]/ul/li[4]/ul/li[2]/a";

	// in mapping page
	/*
	 * public static final String createNewCategoryButton =
	 * ".//*[@id='categoryMapping']/div[1]/div[2]/div/md-button/button"; public
	 * static final String newCategoryName =
	 * "html/body/div[3]/md-dialog/md-content/div[1]/div/div[1]/form/span[2]/input";
	 * public static final String newCategoryDesc =
	 * "html/body/div[3]/md-dialog/md-content/div[1]/div/div[2]/form/span[2]/textarea";
	 * public static final String newCategorySave =
	 * "html/body/div[3]/md-dialog/md-content/div[2]/md-button[1]/button";
	 * public static final String newCategoryCancel =
	 * "html/body/div[3]/md-dialog/md-content/div[2]/md-button[2]"; public
	 * static final String newPropertyName =
	 * "html/body/div[3]/md-dialog/md-content/div[1]/div[2]/form/span[2]";
	 * public static final String newPropertyType =
	 * "html/body/div[3]/md-dialog/md-content/div[1]/div[3]/form/span[2]/select";
	 * public static final String newPropertyRegex =
	 * "html/body/div[3]/md-dialog/md-content/div[1]/div[4]/form/span[2]/md-checkbox/div[1]";
	 * public static final String newPropertySave =
	 * "html/body/div[3]/md-dialog/md-content/div[2]/md-button[1]/button";
	 * public static final String newPropertyCancel =
	 * "html/body/div[3]/md-dialog/md-content/div[2]/md-button[2]/button";
	 * public static final String newCategoryClose =
	 * "html/body/div[3]/md-dialog/md-toolbar/div/span[2]"; public static final
	 * String newPropertyClose =
	 * "html/body/div[3]/md-dialog/md-toolbar/div/span[2]"; public static final
	 * String mappingEntitiyLink =
	 * ".//*[@id='categoryMapping']/div[2]/aside[1]/ul/li[2]/a"; //public static
	 * final String entityMappingSave =
	 * ".//*[@id='mainView']/div/div/div/table/tbody[6]/tr[2]/td/div[2]/md-button[1]/button";
	 * public static final String entityMappingCancel =
	 * ".//*[@id='mainView']/div/div/div/table/tbody[6]/tr[2]/td/div[2]/md-button[2]/button";
	 * public static final String unmappedPropertySearch =
	 * ".//*[@id='mainView']/div/div/div/table/tbody[6]/tr[2]/td/div[1]/ul/div[1]/table/tbody/tr/td/div[1]/input";
	 * public static final String propertySearchResult =
	 * ".//*[@id='mainView']/div/div/div/table/tbody[6]/tr[2]/td/div[1]/ul/div[1]/table/tbody/tr/td/div[2]/div/div/span/span";
	 */

	// xpath using placeholders
	public static final String createNewCategoryButton = ".//*[@id='categoryMapping']/div[1]/div[2]/div/md-button/button";
	public static final String newCategoryName = "//input[@placeholder='Category name']";
	public static final String newCategoryDesc = "//textarea[@placeholder='Category Description']";
	public static final String newCategorySave = "html/body/div[3]/md-dialog/md-content/div[2]/md-button[1]/button";
	public static final String newCategoryCancel = "html/body/div[3]/md-dialog/md-content/div[2]/md-button[2]";
	public static final String newPropertyName = "//input[@placeholder='Property name']";
	public static final String newPropertyType = "html/body/div[3]/md-dialog/md-content/div[1]/div[3]/form/span[2]/select";
	public static final String newPropertyRegex = "html/body/div[3]/md-dialog/md-content/div[1]/div[4]/form/span[2]/md-checkbox/div[1]";
	public static final String newPropertySave = "html/body/div[3]/md-dialog/md-content/div[2]/md-button[1]/button";
	public static final String newPropertyCancel = "html/body/div[3]/md-dialog/md-content/div[2]/md-button[2]/button";
	public static final String newCategoryClose = "html/body/div[3]/md-dialog/md-toolbar/div/span[2]";
	public static final String newPropertyClose = "html/body/div[3]/md-dialog/md-toolbar/div/span[2]";
	public static final String mappingEntitiyLink = ".//*[@id='categoryMapping']/div[2]/aside[1]/ul/li[2]/a";
	public static final String entityMappingCancel = ".//*[@id='mainView']/div/div/div/table/tbody[6]/tr[2]/td/div[2]/md-button[2]/button";
	public static final String unmappedPropertySearch = ".//*[@id='mainView']/div/div/div/table/tbody[6]/tr[2]/td/div[1]/ul/div[1]/table/tbody/tr/td/div[1]/input";
	public static final String propertySearchResult = ".//*[@id='mainView']/div/div/div/table/tbody[6]/tr[2]/td/div[1]/ul/div[1]/table/tbody/tr/td/div[2]/div/div/span/span";

	// in enrich page
	// public static final String enrichTableBody =
	// ".//*[@id='metadataMgmt']/div[2]/div[2]/common-metadata-mgmt-table/div/div/div/div/div/div/div[3]/table/tbody/";
	public static final String enrichTableBody = ".//*[@id='metadataMgmt']/div[2]/div[2]/common-metadata-mgmt-table/div/div/div/div/div/div/div[3]/table/";
	public static final String logicalTab = ".//*[@id='tabs1']/ul/li[2]";
	public static final String physicalTab = ".//*[@id='tabs1']/ul/li[1]";
	public static final String rootEntity = ".//*[@id='dataProfiling']/div/ul/li/span/md-button/button";
	public static final String rootEntityexpand = ".//*[@id='dataProfiling']/div/ul/li/a";
	public static final String entityLHN = ".//*[@id='dataProfiling']/div/ul/li/ul/li/span/md-button/button";

	// logical data
	/*
	 * public static final String entityTypeName =
	 * "html/body/div[1]/div[2]/div/div/div[2]/div[2]/table/tbody/tr[1]/td/input";
	 * public static final String entityTypeDesc =
	 * "html/body/div[1]/div[2]/div/div/div[2]/div[2]/table/tbody/tr[1]/td/input";
	 * public static final String entityTypeOwner =
	 * "html/body/div[1]/div[2]/div/div/div[2]/div[2]/table/tbody/tr[3]/td/input";
	 * public static final String entityTypeCreatedBy =
	 * "html/body/div[1]/div[2]/div/div/div[2]/div[2]/table/tbody/tr[4]/td";
	 */

	public static final String firstEntityNavigate = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/ul/li/div/ul/li[1]/span/span";
	public static final String secondEntityNavigate = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/ul/li/div/ul/li[2]/span/span";

	public static final String entityName = ".//*[@id='viewOne']/md-content/div/table/tbody/tr[1]/td/input";
	public static final String entityDesc = ".//*[@id='viewOne']/md-content/div/table/tbody/tr[2]/td/input";
	public static final String entityOwner = ".//*[@id='viewOne']/md-content/div/table/tbody/tr[3]/td/input";
	public static final String entityTypeName = ".//*[@id='viewOne']/md-content/div/table/tbody/tr[4]/td";
	public static final String entityCreatedBy = ".//*[@id='viewOne']/md-content/div/table/tbody/tr[5]/td";

	public static final String logicalLHNExpand = ".//*[@id='dataProfiling']/div/ul/li/a";

	// datastore
	public static final String mmdataStoreHost = "html/body/div[1]/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[3]/td/input";
	public static final String mmThriftServerPort = "html/body/div[1]/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[4]/td/input";
	public static final String mmdataStoreJdbcPort = "html/body/div[1]/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[5]/td/input";
	public static final String mmfileSystem = "html/body/div[1]/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[6]/td/input";
	public static final String mmwarehouseDir = "html/body/div[1]/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[7]/td/input";
	public static final String mmjobHistoryServerUrl = "html/body/div[1]/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[8]/td/input";
	public static final String mmadvancedSettings = "html/body/div[1]/div[2]/div/div/div[2]/div/form/div[2]/a";
	public static final String mmkerberos = "html/body/div[1]/div[2]/div/div/div[2]/div/form/div[2]/table/tbody/tr[1]/td/input";

	// table modeling
	public static final String physicalTableTab = ".//*[@id='tabs']/ul/li[3]";
	public static final String physicalTableSearch = ".//*[@id='viewThree']/table/thead/tr[2]/th[1]/input";
	public static final String tableDesc = ".//*[@id='viewThree']/table/tbody[1]/tr/td[5]";
	public static final String tableCreatedBy = ".//*[@id='viewThree']/table/tbody[1]/tr/td[6]";
	public static final String tableLink = ".//*[@id='viewThree']/table/tbody[1]/tr/td[1]/a";
	public static final String columnDataType = ".//*[@id='physicalTbl-dialog']/div/div/div[2]/table/tbody/tr[1]/td[2]";
	public static final String tableDialogClose = ".//*[@id='physicalTbl-dialog']/div/div/div[1]/button";

	// basic profiling
	public static final String dataStoreSelect = ".//*[@id='dataProfiling']/div[1]/select";
	public static final String firstDatabaseExpand = ".//*[@id='treeview']/ul/li[1]/a/span[1]";
	public static final String lhntable = ".//*[@id='treeview']/ul/li[1]/ul/li[2]/span/span";
	public static final String tableType = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[5]/td[2]";
	public static final String inputFormat = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[1]/td[4]";
	public static final String isPartitioned = ".//*[@id='mainView']/div/div/div/div[2]/div/table/tbody/tr[7]/td[4]";

	// maintenance
	public static final String closePopUp = "html/body/div[3]/md-dialog/md-toolbar/div/span[2]";

	// Setup -- UserManagement

	// Authentication
	// /html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/div/button
	public static final String editButton = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/div/button";
	public static final String host = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[1]/td/input";
	public static final String port = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[2]/td/input";
	public static final String domainComponent = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[3]/td/input";
	public static final String objectClass = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[4]/td/input";
	public static final String parameterBeforeBC = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[5]/td/input";
	public static final String UID_CN = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[6]/td/input";
	public static final String Bind_DN = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[7]/td/input";
	public static final String Bind_Passwd = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[8]/td/input";
	public static final String sslEnabled = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[9]/td/input";
	public static final String checkLdapConnection = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[1]/td/button/span[1]";
	// /html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[1]/td/button/span[1]
	public static final String checkLdapConnectionMsg = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[1]/td/span[1]";
	public static final String verifiedMessage = "//*[@id=\"toasty-container\"]/div/div/span[1]";
	public static final String done = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/form/table/tbody/tr[10]/td[2]/input[1]";

	public static final String connectionMessageTxt = "Verified";
	public static final String configurationSuccessMsg = "Success";
	public static final String errorConnectionPath = "/html/body/div[1]/div[2]/div/div[2]/div[3]/div/div[2]/div/span";

	// User
	public static final String allUsers = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/span[4]";
	public static final String Search_Id = "/html/body/div[1]/div[2]/div/div[2]/div/table/thead/tr[2]/th[2]/input";
	public static final String noRecordsXpath = "/html/body/div[1]/div[2]/div/div[2]/div/table/tbody/tr[2]/td";
	public static final String AddUser = "/html/body/div[1]/div[2]/div/div[2]/div/div/button/span[1]";
	                                      
	public static final String EnterpriseID = "//*[@id='inputEnterpriseID']";
	public static final String searchEnterpriseID = "//button[@class='btn btn-primary ']/i";
	public static final String Active_Inactive = ".//form[@name='userAssign']/div[6]/div/md-checkbox";
	                                                          //*[@id="dialogContent_6"]/md-content/div/form/div[6]/div/md-checkbox/div[1]/div
	public static final String submit = ".//*[starts-with(@id,'dialogContent')]/md-content/div/form/md-dialog-actions/button[1]/span";
	public static final String successMsgUserAdd = "//*[@id=\"toasty-container\"]/div/div";
	public static final String userPresentXpath = "/html/body/div[1]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]";
	public static final String activeUsers = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/span[2]";
	public static final String inactiveUsers = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/span[3]";

	// Access Control
	public static final String RoleName = "//*[@id=\"mainView\"]/div/div/div/div[1]/form/input[1]";
	public static final String RoleDesc = "//*[@id=\"mainView\"]/div/div/div/div[1]/form/input[2]";
	public static final String AddButton = "//*[@id=\"mainView\"]/div/div/div/div[1]/form/button";
	public static final String roleSuccess = "html/body/div[2]/div/div/div/span[1]";
	public static final String searchRole = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/thead/tr[2]/th[2]/input";
	public static final String searchedRole = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody[2]/tr/td[2]";

	public static final String UserGroupTab = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/ul/li[2]";
	public static final String GroupName = "//*[@id=\"mainView\"]/div/div/div/div[1]/form/input[1]";
	public static final String GroupDesc = "//*[@id=\"mainView\"]/div/div/div/div[1]/form/input[2]";
	public static final String AddGroup = "//*[@id=\"mainView\"]/div/div/div/div[1]/form/button";
	public static final String AssignRoleTab = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/ul/li[3]";
	public static final String AssignRole = "//*[@id=\"mainView\"]/div/div/button";
	public static final String searchUserGroup = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/thead[2]/tr/th[2]/input";
	public static final String searchedUserGroup = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody[2]/tr/td[2]";
	public static final String searchroleAssigned = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/thead[2]/tr/th[3]/input";
	public static final String userGrp = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[2]";
	public static final String role_userGrp = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr/td[3]";

	public static final String assignRolePopupSelectUsrGrp = ".//*[starts-with(@id,'dialogContent')]/md-content/form/div[1]/select";
	public static final String assignRolePopupSelectRole = ".//*[starts-with(@id,'dialogContent')]/md-content/form/div[2]/select";

	public static final String SaveButton = ".//*[starts-with(@id,'dialogContent')]/md-dialog-actions/button[1]/span";
	public static final String AssignUsers = "//*[@id='mainView']/div/div/div/div[3]/button";
	public static final String viewUsers = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody[2]/tr/td[5]/div/a";
	public static final String assignedUsers = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody[2]/tr/td[5]/div/div/table/tbody/tr/td[2]";

	public static final String assignUserSelectUserGroup = ".//*[starts-with(@id,'dialogContent')]/md-content/form/div[1]/select";
	public static final String assignUsersPopupUsers = ".//*[starts-with(@id,'dialogContent')]/md-content/form/div[2]/md-select";

	public static final String searchUser = ".//*[starts-with(@id,'select_container')]/md-select-menu/md-content/md-select-header/input";
	public static final String saveUsers = ".//*[starts-with(@id,'dialogContent')]/md-dialog-actions/button[1]/span";
	public static final String successUser = "html/body/div[2]/div/div/div/span[1]";
	public static final String Add_EditRoleTab = "//*[@id=\"tabs1\"]/ul/li[1]";
	public static final String Assign_EditPrivileges = "/html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[3]/button";
	public static final String StaticPrivileges = "//input[@value='Static Privileges']";
	public static final String RoleSelectforStaticPriviliges = "//form[@name='addRoleForm']/div[1]/select";
	public static final String SavePriviliges = "//*[@id='tbl1']/md-dialog-actions/button[2]";
	public static final String DynamicPriviliges = "//input[@value='Dynamic Privileges']";
	public static final String RoleSelectforDynamicPriviliges = ".//*[starts-with(@id,'tab-content')]/div/md-content/div[1]/select";
	public static final String SaveDynamicPriviliges = ".//*[starts-with(@id,'tab-content')]/div/md-dialog-actions/button[2]/span";

	public static final String SearchGroup = "//*[@id=\"mainView\"]/div/div/table/thead[2]/tr/th[2]/input";
	public static final String SearchRole_AddEditRolePage = "//*[@id=\"mainView\"]/div/div/table/thead/tr[2]/th[2]/input";
	public static final String staticPrivl_Datastore = "html/body/div[4]/div/div/div/div[4]/md-content/form/div[2]/section/div/table/tbody[13]/tr/td[2]/input";
	public static final String staticPrivl_logicalTable = "html/body/div[4]/div/div/div/div[4]/md-content/form/div[2]/section/div/table/tbody[11]/tr/td[2]/input";
	public static final String staticPrivl_OrgEntityType = "html/body/div[4]/div/div/div/div[4]/md-content/form/div[2]/section/div/table/tbody[11]/tr/td[2]/input";
	public static final String staticPrivl_OrgEntity = "html/body/div[4]/div/div/div/div[4]/md-content/form/div[2]/section/div/table/tbody[10]/tr/td[2]/input";
	public static final String staticPrivl_Link = "html/body/div[4]/div/div/div/div[4]/md-content/form/div[2]/section/div/table/tbody[14]/tr/td[2]/input";
	public static final String StaticPriv_moduleElements = "html/body/div[4]/div/div/div/div[4]/md-content/form/div[2]/section/div/table/tbody";
	public static final String staticPrivl_BeforeXpath = "//*[@id='tbl1']/section/div/table/tbody[";
	public static final String staticPrivl_AfterXpath = "]/tr/td[1]";
	public static final String staticPrivl_ChkBoxAfterPath = "]/tr/td[2]/input";

	// Admin Password
	public static final String oldPassword = "/html/body/div[1]/div[2]/div/form/div[1]/input";
	public static final String newPassword = "/html/body/div[1]/div[2]/div/form/div[2]/input";
	public static final String confirmNewPassword = "/html/body/div[1]/div[2]/div/form/div[3]/input";
	public static final String savePasswordButton = "/html/body/div[1]/div[2]/div/form/div[4]/button[1]/span";
	public static final String successMessage = "//*[@id=\"toasty-container\"]/div/div/span[2]";
	public static final String successMessageText = " Success";

	// Business Rules
	// public static final String createTab = ".//*[contains(text(),'Create')]";
	public static final String createTab = ".//*[@id='businessRules']/div[2]/div/ul/li[1]/a";
	public static final String bussruleName = "//*[@name='ruleName']";
	public static final String bussruleDesc = "//*[@name='ruleDescription']";
	public static final String ruleCat = "//*[@name='businessRuleCategory']";
	public static final String DSLruleType = ".//*[@name='DSL_RULE']";
	public static final String DSLProfileCat = "//*[@name='profilingRuleCategory']";
	public static final String ruleExp = "//*[@name='ruleExpression']";
	public static final String DSLShowApplicability = ".//*[@name='showRuleApplicabilityButton']/a";
	public static final String DSLValidateInfo = ".//*[@id='businessRules']/div/div/div/div/div/div[3]/div/div/form/div[8]/div/div/span[2]";
	public static final String addRuleProperty = ".//*[@name='addRuleLevelPropertyButton']";
	// *[@id="addRuleLevelPropertyButton"]
	// public static final String addPropBefore = "//button[contains(text(),'Add
	// property'";
	public static final String propName = "//*[@name='ruleLevelPropertyNameInput']";
	public static final String propNameList = "//*[@name='ruleLevelPropertyNameInputSelect']";
	public static final String propValue = "//*[@name='ruleLevelPropertyValueInput']";
	public static final String propValueList = "//*[@name='ruleLevelPropertyValueInputSelect']";
	public static final String saveRuleProperty = ".//*[@name='ruleLevelPropertyInputSaveCheckButton']";
	public static final String ruleSave = ".//*[@name='saveRuleButton']";

	// property page
	public static final String propTab = "//*[@id='businessRules']/div[2]/div/ul/li[2]/a";
	public static final String propAdd = "//*[@title='Add Property' and @role='button']";
	public static final String propPageName = "//input[@ng-model='selectedProperty.propName']";
	public static final String propPageType = "//select[@ng-model='selectedProperty.selectedDataType']";
	public static final String addOption = "//span[@name='addOption']";

	public static final String zeroOptioninput = ".//*[@id='optionNameInput-0']";
	public static final String firstOptioninput = ".//*[@id='optionNameInput-1']";
	public static final String zeroOptionSave = ".//*[@id='optionSave-0']";
	public static final String firstOptionSave = ".//*[@id='optionSave-1']";
	public static final String secondOptioninput = ".//*[@id='optionNameInput-2']";
	public static final String secondOptionSave = ".//*[@id='optionSave-2']";
	public static final String thirdOptioninput = ".//*[@id='optionNameInput-3']";
	public static final String thirdOptionSave = ".//*[@id='optionSave-3']";

	public static final String saveBRProperty = ".//*[@id='saveProperty']";
	// *[@id="saveProperty"]/span
	// Business Rule mapping page//*[@id="businessRules"]/div[2]/div/ul/li[4]/a
	public static final String mapTab = ".//*[@id='businessRules']/div[2]/div/ul/li[4]/a";
	public static final String expandBussmetadata = "//*[@id='businessRuleCategoryToggleButton-0']";// *[@id="businessRuleCategoryToggleButton-0"]
	public static final String ruleTree = ".//*[@id='tagTreeStructure']/div/ul/li/ul";// *[@id="businessRuleName-2"]
	public static final String getRuleName = "/span/span[2]";
	public static final String ruleCheckBox = "/div/md-checkbox/div[1]";
	public static final String mapRule = ".//*[@id='mapButton']";// *[@id="mapButton"]/span
	// public static final String firstEntityMapped =
	// ".//a[@name='entityName-0']";
	public static final String firstEntityMapped = ".//*[@id='tagAssociation']/div[3]/div[2]/div[2]/div[5]/div/div/div[1]/div/div";
	public static final String queryResolution = ".//*[@name='toggleQueryResolution']";
	public static final String firstConstant = ".//*[@name='constantValue-0']";
	public static final String setMapping = ".//*[@name='setMappingOkayButton']";

	public static final String consistencyFirstTable = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div[3]/ul/li[1]/span[2]/span[2]/select";
	public static final String consistencyFirstColumn = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div[3]/ul/li[1]/ul/li/span[2]/span[2]/select";
	public static final String consistencySecondTable = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div[3]/ul/li[2]/span[2]/span[2]/select";
	public static final String consistencySecondColumn = "html/body/div[1]/div[2]/div/div[2]/div/div/div/div/div[3]/div[2]/div[4]/div[3]/div/div/div[2]/div[1]/div[3]/ul/li[2]/ul/li/span[2]/span[2]/select";

	// Schedulers
	public static final String schedulerBody = ".//*[starts-with(@id,'mCSB')]/table/tbody/tr";
	public static final String datastore = "html/body/div[1]/div[2]/section/div[2]/div/div[1]/div[1]/div/ul/li";
	// public static final String database =
	// "html/body/div[1]/div[2]/section/div[2]/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div[1]/table/tbody"
	// ;
	// public static final String database =
	// ".//*[@id='mCSB_5_container']/table/tbody" ;
	public static final String database1 = "html/body/div[1]/div[2]/section/div[2]/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/input";
	public static final String tableSearch = "html/body/div[4]/md-dialog/md-dialog-content/div/input";

	public static final String tableSelect = "html/body/div[4]/md-dialog/md-dialog-content/div/div[2]/table/tbody/tr[1]/td[1]/input";
	public static final String saveTable = "/html/body/div[4]/md-dialog/md-dialog-actions/button[2]/span";

	public static final String saveConf = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/div/div/button";

	// Advanced Profiling
	public static final String profilingBox = ".//*[@id='advancedDataProfile']/div[3]/div/div[1]/div";
	public static final String queryValue = ".//*[@id='advancedDataProfile']/div[3]/div/div[2]/div[3]/div[1]/div/div[2]/div/table/tbody/tr[2]/td[5]";
	public static final String totalValue = ".//*[@id='advancedDataProfile']/div[3]/div/div[2]/div[3]/div[1]/div/div[2]/div/table/tbody/tr[2]/td[6]";

	// Search
	public static final String searchText = "//input[@name='searchText']";
	public static final String searchResultRow = "//*[@class='searchItemBox row']/div";
	public static final String searchMsg = ".//*[@id='metadataSearch']/div[3]/div[2]/div/div[1]/div/div[1]/div/p";
	public static final String searchDropdown = "//button[@ng-click='toggleDropdown()']";
	public static final String tagSearch = "html/body/div[1]/div[2]/div/div/div[1]/div/div[2]/div[2]/md-radio-group/md-radio-button[2]/div[1]/div[1]";

	// Tag by abn
	public static final String addNewRoot = "//*[@id='createTags']/div[2]/div[1]/div/div/h2/a/i";
	public static final String tagName = "//input[@placeholder='Root tag name']";
	public static final String tagDesc = "//textarea[@placeholder='Description']";
	public static final String tagSave = "//*[@id='createTags']/div[2]/div[1]/div/div/div[1]/div/div[3]/span[1]/button/i";
	public static final String tagList = ".//*[@id='createTags']/div[2]/div[1]/div/div/div[1]/ul/li";

	public static final String tagApproveList = ".//*[@id='tree-root-tags']/ol/li";
	public static final String devRole = ".//*[@id='tagRoleManagement']/div/div[2]/div/div[1]/div/div/label";
	public static final String approveTag = ".//*[@id='tmplArea']/div/div/div[1]/div/div[2]/a[2]";

	public static final String tagAssociateList = ".//*[@id='tagTreeStructure']/div[1]/ul/li";
	public static final String dataStoreList = ".//*[@id='treeStructure']/ul/li";// *[@id="columnCheckBoxItem-0"]/div[1]/div[1]
	public static final String dataBaseList = ".//*[@id='treeStructure']/ul/li[1]/div[4]/ul/li";
	public static final String TableList = ".//*[@id='treeStructure']/ul/li[1]/div[4]/ul/li[4]/div[4]/ul/li";
	public static final String columnList = ".//*[@id='treeStructure']/ul/li[1]/div[4]/ul/li[1]/div[4]/ul/li/div[4]/ul/li";

	public static final String getName = "/div[3]/span[2]";
	public static final String Expand = "/div[1]/a[1]";
	public static final String checkBoxTick = "/div[2]/md-checkbox/div[1]";

	public static final String mapButton = ".//*[@class='submitButton']/button";

	public static final String Click_here_To_Approval = "//*[@id='top-slider-content']/div[1]/div/div[2]/div[2]/a";

	// Lineage Filters
	public static final String LineageDatastoreSelect = "html/body/div[1]/div[2]/div/div/section/ul/div/div[2]/table/tbody/tr[2]/td[1]/md-select/md-select-value/span[2]";
	public static final String LineageDatastoreID = "html/body/div[8]/md-select-menu/md-content/md-option[3]";
	// public static final String BatchIDSelect =
	// ".//*[@id='select_value_label_1']/span[2]";
	public static final String BatchIDSearch = "//input[@placeholder='Search for Batch Identifier']";
	public static final String BatchIDSelect = "html/body/div[1]/div[2]/div/div/section/ul/div/div[2]/table/tbody/tr[2]/td[3]/md-select/md-select-value/span[2]";
	// html/body/div[1]/div[2]/div/div/section/ul/div/div[2]/table/tbody/tr[2]/td[3]/md-select/md-select-value/span[2]
	public static final String DateSelect = "html/body/div[1]/div[2]/div/div/section/ul/div/div[2]/table/tbody/tr[2]/td[2]/div[1]";
	public static final String SelectToday = "html/body/div[3]/div[3]/ul/li[1]";

	// Node select filter

	public static final String selectNode = "html/body/div[1]/div[2]/div/div/section/ul/div/div[3]/div/table/tbody/tr/td[2]/md-select";
	public static final String EnterNodeId = "html/body/div[6]/md-select-menu/md-content/md-select-header/input";
	public static final String SearchNode = "html/body/div[6]/md-select-menu/md-content/md-select-header/a[1]/i";

	public static final String ClickonselectedNode = "html/body/div[6]/md-select-menu/md-content/md-optgroup/md-option[1]";
	public static final String ViewNode = "html/body/div[1]/div[2]/div/div/section/ul/div/div[3]/div/table/tbody/tr/td[3]/button[1]";

	public static final String BatchID = "//la[@class='md-text ng-binding']";
	//
	// public static final String BatchID =
	// "html/body/div[8]/md-select-menu/md-content/md-option[1]";
	public static final String viewButton = "html/body/div[1]/div[2]/div/div/section/ul/div/div[2]/table/tbody/tr[2]/td[5]/button";
	public static final String lineageLine = ".//*[@id='link-0']";
	public static final String MultiScriptLineageLine = ".//*[@id ='link-0']";
	public static final String LineageSrcDestination = "//*[@id=\"lineage-dialog\"]/div/div/div[2]/div/div[1]/span[2]";

	// public static final String LineageSrcDestination =
	// "html/body/div[1]/div[2]/div/div/section/ul/div/div[7]/div/div/div[2]/div/div[1]/span[2]";
	public static final String LineageScriptOwner = "html/body/div[1]/div[2]/div/div/section/ul/div/div[7]/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]";
	public static final String LineageScript = "html/body/div[1]/div[2]/div/div/section/ul/div/div[7]/div/div/div[2]/div/div[2]/table/tbody/tr[3]/td[2]";
	public static final String LineageScriptType = "html/body/div[1]/div[2]/div/div/section/ul/div/div[7]/div/div/div[2]/div/div[2]/table/tbody/tr[2]/td[2]";
	public static final String LineagedialogClosebutton = ".//*[@id='lineage-dialog']/div/div/div[1]/button[1]";
	public static final String LineageRecordsRead = "html/body/div[1]/div[2]/div/div/section/ul/div/div[7]/div/div/div[2]/div/div[2]/table/tbody/tr[9]/td[2]";
	public static final String LineageRecordsWrite = "html/body/div[1]/div[2]/div/div/section/ul/div/div[7]/div/div/div[2]/div/div[2]/table/tbody/tr[10]/td[2]";
	public static final String NoDSConfiguredMessage = "html/body/div[1]/div[2]/div/div/section/ul/div/div[1]/span";
	public static final String showFailedJobs = "html/body/div[1]/div[2]/div/div/section/ul/div/div[2]/table/tbody/tr[2]/td[4]/md-checkbox/div[1]";
	public static final String filterSelect = "html/body/div[1]/div[2]/div/div/section/ul/div/div[3]/div/table/tbody/tr/td[6]/select";
	public static final String applyFilterSelect = "html/body/div[1]/div[2]/div/div/section/ul/div/div[3]/div/table/tbody/tr/td[8]/select";
	public static final String filterView = "html/body/div[1]/div[2]/div/div/section/ul/div/div[3]/div/table/tbody/tr/td[9]/button";
	public static final String EntityDisplayPanel = "html/body/div[1]/div[2]/div/div/section/ul/div/div[3]/div/table/tbody/tr/td[10]/ul/li[2]";
	public static final String FrequencyDisplayPanel = "html/body/div[1]/div[2]/div/div/section/ul/div/div[3]/div/table/tbody/tr/td[10]/ul/li[1]";
	public static final String multiPopupBackButton = ".//*[@id='checkBackPoint']";
	public static final String lineagePopupID = "popLineageGen";
	public static final String FrequencyList = "html/body/div[1]/div[2]/div/div/section/ul/div/div[3]/div/table/tbody/tr/td[10]/ul/li";

	// Tagging by aboli
	// Tagging
	// CreateTag

	public static final String tagcreatedmessage = "//*[@id='toasty-container']/div/div/span[2]";
	public static final String tagnameicon = "//*[@id='tagTreeStructure']/div/ul/li/div[1]/span[1]/span[1]";
	public static final String editbutton = "//*[@id='tagTreeStructure']/div/ul/li/div[1]/span[1]/span[3]/button[1]/i";
	public static final String tagname_textbox = "//*[@id='tagTreeStructure']/div/ul/li/div[1]/span[2]/span[2]/table/tbody/tr[1]/td[2]/input";
	public static final String save_icon = "//*[@id='tagTreeStructure']/div/ul/li/div[1]/span[2]/span[2]/table/tbody/tr[3]/td[2]/button[1]/i";
	public static final String delete_icon = "//*[@id='tagTreeStructure']/div/ul/li/div[1]/span[1]/span[3]/span/button/i";
	public static final String delete_button = "/html/body/div[5]/div/div/div/div[2]/div/div/button[1]";
	public static final String edit_heirarchy_button = "//*[@id='tagTreeStructure']/div/ul/li/div[1]/span[1]/span[3]/button[2]/i";
	public static final String childtagname_textbox = "//*[@id='tagTreeStructure']/div/ul/li/ul/li/div[2]/span/span[2]/input";
	public static final String save_childtagname = "//*[@id='tagTreeStructure']/div/ul/li/ul/li/div[2]/span/span[4]/button[1]/i";

	// ManageTag
	public static final String addnewTag = "//*[@id='mainViewIcon1']/div/span/i";
	public static final String Tagname_textbox = "//*[@id='tree-root-tags']/ol/li[1]/div/input";
	public static final String Tag_save = "//*[@id='tree-root-tags']/ol/li[1]/div/i[8]";
	public static final String opentag_checkbox = "//*[@id='tagRoleManagement']/div/div[1]/span[4]/input";
	public static final String opentag_approvebutton = "//*[@id='tmplArea']/div/div/div[1]/div/div[2]/a[2]";
	public static final String tag_roles_textbox = "//*[@id='tagRoleManagement']/div/div[1]/div[2]/span[1]";

	// AssociatePage

	public static final String tag_alias_link = "//*[@id='alias-bottom-content']/div[2]/div/div[2]/div[2]/div/span";

	// Chargeback

	public static final String scheduler_message = "//*[@id='toasty-container']/div/div/span[1]";
	public static final String configuration = "//*[@id='chargeback-util-summary-dashboard']/div[1]/a/span";
	public static final String vCore_Weight = "//*[@id='chargeback-util-summary-dashboard']/div[1]/div/div/div/div[2]/table/tbody/tr[4]/td[2]/input";

	public static final String Memory_Weight = "//*[@id='chargeback-util-summary-dashboard']/div[1]/div/div/div/div[2]/table/tbody/tr[4]/td[4]/input";
	public static final String ok_button = "//*[@id='chargeback-util-summary-dashboard']/div[1]/div/div/div/div[2]/div[4]/button[1]/span";

	// DeltaReport by aboli

	public static final String select_entity = "/html/body/div[1]/div[2]/div/div/div[2]/div/div[1]/div/ul/li/div/ul/li[2]/span/span";
	public static final String select_entity2 = "/html/body/div[1]/div[2]/div/div/div[2]/div/div[1]/div/ul/li/div/ul/li[1]/span/span";
	public static final String scheduler_search = "html/body/div[1]/div[2]/div/div/div[2]/div/div[1]/table/thead/tr[2]/th[2]/input";

	public static final String scheduler_execute = "//table[@class='table table-bordered table-striped table-condensed']/tbody/tr[1]/td[8]/button";
	// table[@class='table table-bordered table-striped
	// table-condensed']/tbody/tr[1]/td[8]/button
	public static final String scheduler_status = "//table[@class='table table-bordered table-striped table-condensed']/tbody/tr/td[5]/span";

	public static final String datastore_expand = "html/body/div[1]/div[2]/section/div[2]/div/div[1]/div[4]/div[2]/div/div[1]/div/div/div[2]/a/span";
	// *[@id="mCSB_1_container"]/div/div/div[2]/a/span
	public static final String database_expand = "//div[@class='ePL10 layout-wrap ng-scope layout-row flex']/div[6]/a/span";
	// div[@class='ePL10 layout-wrap ng-scope layout-row flex']/div[6]/a/span

	public static final String tablecheckbox = "/html/body/div[1]/div[2]/section/div[2]/div/div[1]/div[4]/div[2]/div/div/div/div/div[2]/md-checkbox/div[1]";
	// *//div/[@class="mCSB_container mCS_y_hidden
	// mCS_no_scrollbar_y"]/div/div/div[2]/md-checkbox/div[1]/div
	// *[@id="mCSB_1_container"]/div/div/div[2]/md-checkbox/div[1]
	public static final String table_sync = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/table/tbody/tr/td[2]";

	public static final String table_notinsync = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/table/tbody/tr/td[3]";
	public static final String table_ecatlessc = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/table/tbody/tr/td[5]";
	public static final String table_ecatextra = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/table/tbody/tr/td[4]";

	public static final String syncview = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div/div/div[2]/md-switch/div[2]";
	public static final String selectallcheckbox = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div/div/div[3]/div[1]/table/thead/tr/th[1]/md-checkbox/div[1]";

	public static final String sync = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div/div/div[2]/div/a";
	public static final String summary_dashboard = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[1]/span";

	public static final String expand_table = "html/body/div[1]/div[2]/section/div[2]/div/div[1]/div[4]/div[2]/div/div[1]/div/div/div[2]/a/span";

	public static final String columncheckbox = "html/body/div[1]/div[2]/section/div[2]/div/div[1]/div[4]/div[2]/div/div[1]/div/div/div[2]/md-checkbox/div[1]";
	// *[@id="mCSB_5_container"]
	public static final String column_sync = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/table/tbody/tr/td[2]";

	public static final String column_notinsync = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/table/tbody/tr/td[3]";

	public static final String column_ecatextra = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/table/tbody/tr/td[4]";

	public static final String column_ecatless = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[1]/table/tbody/tr/td[5]";
	public static final String column_selectall_checkbox = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[2]/div/div/div/div/div[3]/div[1]/table/thead/tr/th[1]/md-checkbox/div[1]";

	public static final String search_table_text = "//*[@id='viewTwo']/table/thead/tr[2]/th[1]/input";
	public static final String edit_column = "//*[@id='logical-table-grid']/tbody[1]/tr[1]/td[5]/a[1]/span";
	// *[@id="logical-table-grid"]/tbody[1]/tr[1]/td[5]/a[1]/span
	public static final String expand_column = "//*[@id='selectac123']/div/a/span";
	// *[@id="selectac123"]/div/a/span
	public static final String search_column = "//*[@id='selectac123']/div/div/div/input";

	public static final String select_column = "//*[@id='selectac123']/div/div/ul/li[1]";

	public static final String save_column = "//*[@id='complete-dialog']/div/div/div[2]/div/button[1]/span";

	public static final String search_physical_table = "//*[@id='viewThree']/table/thead/tr[2]/th[1]/input";

	public static final String update_physical_table = "//*[@id='viewThree']/table/tbody[1]/tr/td[8]/a[2]";

	// DFD by aboli
	// dfd0 metadata
	public static final String cat_prop_map = "//*[@id='categoryMapping']/div[2]/aside[1]/ul/li[2]/a";

	public static final String test_cat = "html/body/div[1]/div[2]/div[2]/div/div[2]/aside[2]/div/div/div/div/table/tbody[10]/tr/td[1]/a/span/i";

	public static final String test1_prop = "/html/body/div[1]/div[2]/div[2]/div/div[2]/aside[2]/div/div/div/div/table/tbody[10]/tr[2]/td/div[1]/ul/div[2]/table[1]/tbody/tr/td/div[2]/div/div/div";

	public static final String dfd_checkox1 = ".//*[starts-with(@id,'dialogContent')]/md-content/div[2]/table/tbody[10]/tr[1]/td[1]/span/md-checkbox/div[1]";

	public static final String dfd_checkox2 = ".//*[starts-with(@id,'dialogContent')]/md-content/div[2]/table/tbody[10]/tr[1]/td[5]/md-checkbox/div[1]/div";
	public static final String dfd_checkox3 = ".//*[starts-with(@id,'dialogContent')]/md-content/div[2]/table/tbody[10]/tr[1]/td[6]/md-checkbox/div[1]/div";
	public static final String dfdnode_checkox1 = ".//*[starts-with(@id,'dialogContent')]/md-content/div[2]/table/tbody[11]/tr[1]/td[1]/span/md-checkbox/div[1]/div";

	public static final String dfdnode_checkox2 = ".//*[starts-with(@id,'dialogContent')]/md-content/div[2]/table/tbody[11]/tr[1]/td[5]/md-checkbox/div[1]/div";
	public static final String dfdnode_checkox3 =".//*[starts-with(@id,'dialogContent')]/md-content/div[2]/table/tbody[11]/tr[1]/td[6]/md-checkbox/div[1]/div";
	public static final String savebutton = ".//*[starts-with(@id,'dialogContent')]/div/button[1]";

	public static final String dfdlevel0_selection = "//*[@id='dfdContextualMenu']/ul/li[3]/div[1]/span/img";

	public static final String dfd0_metadata = "//*[@id='dfdContextualMenu']/ul/li[6]/div[1]/span/img";
	public static final String test_expand = ".//*[starts-with(@id,'mCSB')]/div[3]/div/div[1]/div/div[2]/div[2]";
	public static final String edit_icon = ".//*[starts-with(@id,'mCSB')]/div[3]/div/div[1]/div/div[2]/div[1]/a[1]/span[1]";
	public static final String metadata_textbox = ".//*[starts-with(@id,'mCSB')]/table/tbody/tr/td[2]/span[1]/form/textarea";

	public static final String metadata_save = ".//*[starts-with(@id,'mCSB')]/div[3]/div/div[1]/div/div[2]/div[1]/a[2]/span";

	public static final String metadata_value = ".//*[starts-with(@id,'mCSB')]/table/tbody/tr/td[2]/span[2]/div/span[2]";
	// dfd1 metadata//*[@id="mCSB_85_container"]                              /table/tbody/tr/td[2]/span[2]/div/span[2]
	public static final String dfd1_metadaat = "//*[@id='dfdContextualMenu']/ul/li[5]/div[1]/span/img";

	public static final String edit_node1 = "//*[@id='dataFlowDiagram']/div[2]/div[2]/div/div/div/div[5]/button[1]/span";
	public static final String enterprise_entity = ".//*[starts-with(@id,'mCSB')]/div[2]/ul/li/span/span";

	public static final String expand_datatable = "//*[@id='dataFlowDiagram']/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[3]/td[2]/div/div/div[2]/tab-droplist/div/a/i";

	public static final String search_datatable = ".//*[starts-with(@id,'mCSB')]/li[1]/input";

	public static final String select_datatable = ".//*[starts-with(@id,'mCSB')]/li[2]";

	public static final String save_datatable = "//*[@id='dataFlowDiagram']/div[2]/div[2]/div/div/div/div[4]/div[2]/button[2]/span";

	public static final String node1_metadata = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[5]/button[4]";

	public static final String prop_searchtext = "html/body/div[4]/md-dialog/div/div[2]/md-content/div/div/h1/span/span[3]/input";

	public static final String edit_button = "html/body/div[4]/md-dialog/div/div[2]/md-content/div/div/div/div/div/div[1]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]";

	public static final String node_metadata_text = "html/body/div[4]/md-dialog/div/div[2]/md-content/div/div/div/div/div/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/table/tbody/tr/td[2]/span[1]/form/textarea";

	public static final String node_metadata_save = "html/body/div[4]/md-dialog/div/div[2]/md-content/div/div/div/div/div/div[1]/div[3]/div/div[1]/div/div[2]/div[1]/div[2]";
	public static final String node_metadata_value = "html/body/div[4]/md-dialog/div/div[2]/md-content/div/div/div/div/div/div[1]/div[3]/div/div[2]/div/div[2]/div/div[1]/table/tbody/tr/td[2]/span[2]/div/span[2]";

	// Basic Profiling View Profiling Constants
	public static final String basicProfiling_datastore = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/ul/li[1]/input";
	public static final String basicProfiling_datastoreName = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]";
	public static final String basicProfiling_MetastoreHost = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/table/tbody/tr[7]/td[2]";
	public static final String basicProfiling_JobHistoryUrl = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/table/tbody/tr[9]/td[2]";
	public static final String basicProfiling_dataBaseName = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]";
	public static final String basicProfiling_dataBaseOwnerName = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]";
	public static final String basicProfiling_dataBaseLocation = " html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[3]/td[2]";
	public static final String basicProfiling_tableCount = " html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[4]/td[2]";
	public static final String basicProfiling_tableName = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[2]";
	public static final String basicProfiling_recordsCount = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]";
	public static final String basicProfiling_tableType = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[5]/td[2]";
	public static final String basicProfiling_searchedtableName = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/ul/li[2]/div/ul/li[2]/span/span/button";
	public static final String basicProfiling_tableSeach = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/input";
	public static final String basicProfiling_tableInputFormat = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[4]";
	public static final String basicProfiling_tablePartitions = "html/body/div[1]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div[2]/div/table/tbody/tr[7]/td[4]";
	public static final String basicProfiling_expandtableIcon = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/ul/li[2]/a/span[1]";
	public static final String basicProfiling_tableNameIcon = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/ul/li[2]/span/span/strong/span/span";
	public static final String basicProfiling_expandTable = "html/body/div[1]/div[2]/div/div/div[1]/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a/span[2]";

	// Technical View
	public static final String addFirstTemplate = "//*[@id='metadataSideBar']/div[1]/div/span[3]/span[1]/a/span";
                                                	
	public static final String addSubsqTemplate = "//*[@id='metadataSideBar']/div[1]/div/span[3]/span[1]/a/span";

	public static final String firstSystemTemplateCheckBox = ".//*[starts-with(@id,'dialogContent')]/div/div[2]/md-content/div[2]/div[2]/md-checkbox/div[1]";
	public static final String subsqSystemTemplateCheckBox = ".//*[starts-with(@id,'dialogContent')]/div/div[2]/md-content/div[2]/div[2]/md-checkbox/div[1]";
	                                                       
	public static final String firstSelectSystemTemplate = ".//*[starts-with(@id,'dialogContent')]/div/div[2]/md-content/div[1]/span[2]/select";
	public static final String subsqSelectSystemTemplate = ".//*[starts-with(@id,'dialogContent')]/div/div[2]/md-content/div[1]/span[2]/select";
	public static final String firstTemplateDesc = ".//*[starts-with(@id,'dialogContent')]/div/div[2]/md-content/div[1]/span[5]/textarea";
	public static final String subsqTemplateDesc = ".//*[starts-with(@id,'dialogContent')]/div/div[2]/md-content/div[1]/span[5]/textarea";
	public static final String saveButtonForFirstSystemTemplate = ".//*[starts-with(@id,'dialogContent')]/md-dialog-actions/button[2]/span";
	public static final String saveButtonForSubsqSystemTemplate = ".//*[starts-with(@id,'dialogContent')]/md-dialog-actions/button[2]/span";

	public static final String azkabanDesc = ".//*[starts-with(@id,'dialogContent')]/div/div[2]/md-content/div[1]/span[5]/textarea";
	public static final String azkabanURL = ".//*[starts-with(@id,'dialogContent')]/div/div[6]/md-content/div[1]/span[2]/input";
	public static final String azkabanUserName = ".//*[starts-with(@id,'dialogContent')]/div/div[6]/md-content/div[2]/span[2]/input";
	public static final String azkabanPwd = ".//*[starts-with(@id,'dialogContent')]/div/div[6]/md-content/div[3]/span[2]/input";
	public static final String azkabanProject = ".//*[starts-with(@id,'dialogContent')]/div/div[6]/md-content/div[4]/span[2]/input";
	public static final String azkabanProjectAdd = ".//*[starts-with(@id,'dialogContent')]/div/div[6]/md-content/div[4]/span[2]/a/i";
	public static final String azkabanSave = ".//*[starts-with(@id,'dialogContent')]/md-dialog-actions/button[2]";

	public static final String selectView = ".//*[@id='browseMetadata']/div[2]/div/div[2]/div[1]/multi-droplist/div/a";
	public static final String selectViewList = ".//*[@id='browseMetadata']/div[2]/div/div[2]/div[1]/multi-droplist/div/span/ul/li[2]/ul/li";

	public static final String contextualMenuList = ".//*[@id='browseMetadataContextualMenu']/ul/li";
	public static final String openContextualMenu = ".//*[@id='openCloseContextMenuPopup']/i";
	public static final String containerList = ".//*[@id='contextMenuContainer']/ul/li";

	public static final String leftHandMenu1 = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/div[5]/div/div/div[1]/div/ul/li";
	public static final String leftHandMenu2 = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/div[6]/div[4]/div/div[1]/div/ul/li";
	// public static final String leftHandMenu =
	// "html/body/div[1]/div[2]/section/div[2]/div/div[1]/div[5]/div/div/div[1]/div/ul/li";

	public static final String leftHandMenuTree = "html/body/div[1]/div[2]/section/div[2]/div/div[2]/div[5]/div/div/div[1]/div/ul/li";

	public static final String nextLevelEntity = ".//*[@id='browseMetadataContextualMenu']/ul/li[3]";
	public static final String clickAttributes = ".//*[@id='browseMetadataContextualMenu']/ul/li[4]";
	public static final String nextLevelFile = ".//*[@id='browseMetadataContextualMenu']/ul/li[5]";

	public static final String browseMainSection = "html/body/div[1]/div[2]/section/div[2]/div/div[3]/";

	// General information
	public static final String heading = browseMainSection + "div[3]/div/div[1]/h1";
	public static final String subHeading = browseMainSection + "div[3]/div/div[1]/h1/div/span[2]/span";
	public static final String gi_entityName = browseMainSection
			+ "div[3]/div/div[3]/div/div/div[1]/div[3]/div/table/tbody/tr/td/span[1]";
	public static final String gi_entityType = browseMainSection
			+ "div[3]/div/div[3]/div/div/div[1]/div[4]/div/table/tbody/tr/td/span[1]";

	// Basic profiling
	public static final String basicProfilingTable = browseMainSection
			+ "div[3]/div/div/div/div[1]/div/div/div[2]/div/table/tbody/tr";
	public static final String columnBasicProfilingTable = browseMainSection
			+ "div[3]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/ul/li";

	// Comment
	public static final String addComment = browseMainSection + "div[3]/div/div/div/div/div[1]/span/div/a";
	public static final String commmentBox = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[1]/div[1]/text-angular/div[2]/div[3]";
	public static final String enterComment = browseMainSection + "div[3]/div/div/div/div/div[1]/div[1]/div[2]/span";
	public static final String like = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[2]/div/ul/li/div/div[3]/a[1]";
	public static final String afterLike = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[2]/div/ul/li/div/div[3]/a[2]";
	public static final String replyLink = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[2]/div/ul/li/div/div[3]/a[3]";
	public static final String replyBox = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[2]/div/ul/li/div/div[3]/form/div/text-angular/div[2]/div[3]";
	public static final String afterReplyLink = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[2]/div/ul/li/div/div[3]/form/a[1]";
	public static final String replyText = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[2]/div/ul/li/div/div[4]/ul/li/div/div[2]/p[2]/p";
	public static final String editLink = ".//*[starts-with(@id,'mCSB')]/div[2]/div/ul/li/div/div[3]/a[4]/span/i";// *[@id="mCSB_13_container"]/div[2]/div/ul/li/div/div[3]/a[4]/span
	public static final String editBox = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[2]/div/ul/li/div/div[2]/p[3]/text-angular/div[2]/div[3]";
	public static final String editSave = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[2]/div/ul/li/div/div[2]/p[3]/a[1]";
	public static final String commentText = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[2]/div/ul/li/div/div[2]/p[2]/p";

	// Document
	public static final String addDocument = browseMainSection + "div[3]/div/div/div/div/div[1]/div[1]/div/a[1]";
	public static final String browseDocument = browseMainSection + "div[3]/div/div/div/div/div[1]/div[2]/div[1]/input";
	public static final String documentUploadButton = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[2]/div[4]/button";
	public static final String firstDocumentUploaded = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[6]/div/div[2]/div/div[1]/table/tbody/tr[2]/td[1]/span";
	public static final String secondDocumentUploaded = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[6]/div/div[2]/div/div[1]/table/tbody/tr[3]/td[1]/span";
	public static final String secondDocumentDelete = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[6]/div/div[2]/div/div[1]/table/tbody/tr[3]/td[5]/a/i";
	public static final String firstDocumentDelete = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[6]/div/div[2]/div/div[1]/table/tbody/tr[2]/td[5]/a/i";
	public static final String documentDeleteConfirm = "html/body/div[4]/div/div/div/div[2]/div/div/button[1]";
	public static final String documentsTable = browseMainSection
			+ "div[3]/div/div/div/div/div[1]/div[6]/div/div[2]/div/div[1]/table/tbody/tr";

	// business Rule
	public static final String ruleTable = browseMainSection
			+ "div[3]/div/div[1]/div[3]/div/div[1]/div/div[2]/div/div[1]/table/tbody/tr";
	public static final String recursiveCheckBox = browseMainSection
			+ "div[3]/div/div[1]/div[1]/label[1]/md-checkbox/div[1]";
	public static final String noRuleFound = browseMainSection
			+ "div[3]/div/div[1]/div[3]/div/div[1]/div/div[2]/div/div[1]/table/tbody/tr/td";

	// advanced profiling
	public static final String advProfilingTable = browseMainSection
			+ "div[3]/div/div[1]/div[4]/div/div[1]/div/div[2]/div/div[1]/table/tbody/tr";
	public static final String advProfRecursive = browseMainSection
			+ "div[3]/div/div[1]/div[3]/label/md-checkbox/div[1]";
	public static final String noRowsAvailable = browseMainSection
			+ "div[3]/div/div[1]/div[4]/div/div[1]/div/div[2]/div/div[1]/table/tbody/tr/td";
	public static final String advProfRuleName = browseMainSection
			+ "div[3]/div/div[1]/div[4]/div/div[1]/div/div[2]/div/div[1]/table/tbody/tr/td[2]";
	public static final String advProfTotalRecs = browseMainSection
			+ "div[3]/div/div[1]/div[4]/div/div[1]/div/div[2]/div/div[1]/table/tbody/tr/td[4]";
	public static final String advProfQualRecs = browseMainSection
			+ "div[3]/div/div[1]/div[4]/div/div[1]/div/div[2]/div/div[1]/table/tbody/tr/td[5]";
	public static final String advProfPercent = browseMainSection
			+ "div[3]/div/div[1]/div[4]/div/div[1]/div/div[2]/div/div[1]/table/tbody/tr/td[6]";
	public static final String changeProfilingLink = browseMainSection + "div[3]/div/div[1]/div[2]/span[";

	// DFD
	public static final String addProject = "//*[@id='dfdSideBar']/div[4]/div/span/a";
	public static final String projectName = ".//*[@id='projectname']";
	public static final String projectDesc = ".//*[@id='pwd']";
	public static final String projectSave = "html/body/div[1]/div[2]/section/div[2]/div/div[3]/div/div/div[3]/div/div/div[1]/div[3]/div/form/div[3]/div/button";
	// *[@id="mCSB_33_container"]/div[3]/div/form/div[3]/div/button
	public static final String projectList = "//*[@id='dfdSideBar']/div[4]/ul/li";

	public static final String dfdSystemMenu = "//*[@id='dfdContextualMenu']/ul/li[5]/div[1]/span/img";
	public static final String addDfdSystem = "//*[@id='addNewSystem']/span[1]";
	public static final String dfdSystemTypeDropdown = ".//*[starts-with(@id,'tab-content')]/div/md-content/table/tbody/tr[1]/td[2]/div/div/div[2]/dfd-droplist/div/a";
	public static final String dfdSystemTypeSearch = ".//*[starts-with(@id,'mCSB')]/li[1]/input";
	public static final String dfdSystemTypeFirstSelect = ".//*[starts-with(@id,'mCSB')]/li[2]";
	public static final String dfdSystemName = ".//*[starts-with(@id,'tab-content')]/div/md-content/table/tbody/tr[2]/td[2]/div/input";
	public static final String dfdSystemSave = "/html/body/div[5]/md-dialog/md-dialog-actions/button[2]";
	public static final String dfdSystemTypeEdit = ".//*[starts-with(@id,'tab-content')]/div/md-content/table/tbody/tr[1]/td[2]/div/div/div[2]/i";
	                                                                                                                                    
	public static final String dfdSystemTypeInput = ".//*[starts-with(@id,'tab-content')]/div/md-content/table/tbody/tr[1]/td[2]/div/div/div[1]/span/input";

	public static final String dfdSystemTable = ".//*[starts-with(@id,'mCSB')]/div[3]/div/div[2]/table/tbody/tr";

	public static final String dfdSystemClose = "html/body/div[4]/md-dialog/md-toolbar/div/button";

	public static final String dfdZeroMenu = "//*[@id='dfdContextualMenu']/ul/li[3]/div[1]/span/img";
	public static final String dfdZeroAdd = "//*[@id='dfdSideBar']/div[4]/div/span/a";
	public static final String dfdZeroName = "//*[@id='stmname']";
	public static final String dfdZeroDesc = "//*[@id='pwd']";
	public static final String dfdZeroSave = ".//*[starts-with(@id,'mCSB')]/div[3]/div/form/div[3]/div/button";
	public static final String dfdZeroList = "//*[@id='dfdSideBar']/div[4]/ul/li";

	public static final String dfdZeroOpenMenu = "//*[@id='dfdContextualMenu']/ul/li[4]/div[1]/span/img";

	// dfd diagram
	public static final String dfd0SystemIcon = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[6]/div[2]/span[1]";
	public static final String dfd0OperatorIcon = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[6]/div[2]/span[2]";
	public static final String dfd1CopyIcon = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[6]/div[2]/span[3]";
	public static final String dfd0SystemClick = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[1]/td[2]/div/div/div[2]/dfd-droplist/div/a/i";
	public static final String dfd0SystemSearch = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[1]/td[2]/div/div/div[2]/dfd-droplist/div/span/ul/div/div[1]/li[1]/input";
	public static final String dfd0SystemSelect = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[1]/td[2]/div/div/div[2]/dfd-droplist/div/span/ul/div/div[1]/li[2]";
	public static final String dfd0FirstEntitySelect = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[2]/td[2]/div/div/div[1]/div[2]/ul/li/div/ul/li[1]/span/span";
	public static final String dfd0SecondEntitySelect = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[2]/td[2]/div/div/div[1]/div[2]/ul/li/div/ul/li[2]/span/span";
	public static final String dfd0SystemSave = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[4]/div[2]/button[2]";

	public static final String dfd0OperatorLabel = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[3]/table/tbody/tr[1]/td[2]/input";
	public static final String dfd0OperatorDesc = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[3]/table/tbody/tr[2]/td[2]/md-input-container/div[1]/textarea";
	public static final String dfd0OperatorSave = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[3]/div[2]/button[2]";

	public static final String firstConnector = ".//*[@id='connect1']";
	public static final String secondConnector = ".//*[@id='connect2']";
	public static final String thirdConnector = ".//*[@id='connect3']";
	public static final String fourthConnector = ".//*[@id='connect4']";
	public static final String dfd0LinkName = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[3]/table/tbody/tr[1]/td[2]/input";
	public static final String dfd0LinkDesc = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[3]/table/tbody/tr[2]/td[2]/md-input-container/div[1]/textarea";
	public static final String dfd0LinkSave = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div/div[3]/div[2]/button[2]";
	public static final String dfd0WorkflowSave = "//*[@id='dataFlowDiagram']/div[2]/div[2]/div/div/div/div[1]/h1/span[2]/a[3]";

	// dfd-1
	public static final String dfdOneMenu = "//*[@id='dfdContextualMenu']/ul/li[3]/div[1]/span/img";
	public static final String dfdOneAdd = "//*[@id='dfdSideBar']/div[4]/div/span/a/span";
	public static final String dfdOneName = "html/body/div[1]/div[2]/section/div[2]/div/div[3]/div/div/div[3]/div/div/div[1]/div[3]/div/form/div[1]/div[1]/input";
	public static final String dfdOneOpenMenu = "//*[@id='dfdContextualMenu']/ul/li[3]/div[1]/span/img";

	// dfd-1 diagram
	public static final String dfdFirstSystemNode = ".//*[@id='node1']";
	public static final String dfdSecondSystemNode = ".//*[@id='node2']";
	public static final String dfdThirdSystemNode = ".//*[@id='node3']";
	public static final String dfdSystemNodeEdit = "//*[@id='dataFlowDiagram']/div[2]/div[2]/div/div/div/div[5]/button[1]/span";
	public static final String dfdTableOpen = "//*[@id='dataFlowDiagram']/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[3]/td[2]/div/div/div[2]/tab-droplist/div/a/i";

	public static final String dfdTableSearch = ".//span[@class='droplistbody show']/ul/div/div/li[1]/input";
	public static final String dfdFirstTableSelect = ".//span[@class='droplistbody show']/ul/div/div/li[2]";
	public static final String dfdTableSave = "//*[@id='dataFlowDiagram']/div[2]/div[2]/div/div/div/div[4]/div[2]/button[2]/span";
	
	public static final String dfdAddInlineTable = "//*[@id='dataFlowDiagram']/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[3]/td[2]/div/div/div[2]/i";
	public static final String dfdInlineTableInput = "//*[@id='dataFlowDiagram']/div[2]/div[2]/div/div/div/div[4]/table/tbody/tr[3]/td[2]/div/div/div[1]/input";

	// STM
	public static final String dfdSystemNodeSTMbutton = "//*[@id='dataFlowDiagram']/div[2]/div[2]/div/div/div/div[5]/button[2]/span";
	public static final String stmHeading = "//*[@id='dataFlowDiagram']/div[1]/div/h4/span[1]";
	public static final String stmSourceTableList = ".//*[starts-with(@id,'mCSB')]/ul/li/a/span";
	public static final String stmDestTableList = ".//*[starts-with(@id,'mCSB')]/ul/li";
	public static final String stmDestTableColumnList = ".//*[starts-with(@id,'mCSB')]/ul/li/ul/li";

	// STM operations
	public static final String stmDestColumnAdd = "//*[@id='dataFlowDiagram']/div/div/div[3]/span/span[6]/a/span";
	public static final String stmDestLogicalDataType = ".//*[starts-with(@id,'select_value_label']/span[1]";

	public static final String stmDestDataTypeThirdOption = "html/body/div[5]/md-select-menu/md-content/md-option[3]";
	//*[@id="select_option_36"]/div
	public static final String stmDestLogicalName = "html/body/div[4]/md-dialog/div/div[2]/md-content/table/tbody/tr[2]/td[2]/input";
	public static final String stmDestPhysicalName = "html/body/div[4]/md-dialog/div/div[2]/md-content/table/tbody/tr[3]/td[2]/input";
	public static final String stmDestDesc = "html/body/div[4]/md-dialog/div/div[2]/md-content/table/tbody/tr[4]/td[2]/textarea";
	public static final String stmDestSecured = "html/body/div[4]/md-dialog/div/div[2]/md-content/table/tbody/tr[5]/td[2]/md-select/md-select-value";
	public static final String stmDestSave = "html/body/div[4]/md-dialog/md-dialog-actions/button[2]";
	public static final String stmDestDelete = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div[2]/div/div/section/div/div/div[3]/span/span[8]/a/img";

	// STM mapping
	public static final String stmSourceBody = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div[2]/div/div/section/div/div/div[1]/div[5]/div/div[1]/ul/";
	public static final String stmDestBody = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div[2]/div/div/section/div/div/div[3]/div[5]/div/div[1]/ul/li/ul/";
	public static final String stmMappingBody = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div[2]/div/div/section/div/div/div[2]/div/div[3]/div[3]/div/div/div[2]/div/div[1]/table/tbody/";

	public static final String stmSourceT1C1 = stmSourceBody + "li[1]/ul/li[1]/a/span";
	public static final String stmSourceT1C2 = stmSourceBody + "li[1]/ul/li[2]/a/span";
	public static final String stmSourceT1C3 = stmSourceBody + "li[1]/ul/li[3]/a/span";
	public static final String stmSourceT2C1 = stmSourceBody + "li[2]/ul/li[1]/a/span";
	public static final String stmSourceT2C2 = stmSourceBody + "li[2]/ul/li[2]/a/span";
	public static final String stmSourceT2C3 = stmSourceBody + "li[2]/ul/li[3]/a/span";
	public static final String stmDestC1 = stmDestBody + "li[1]/a/span";
	public static final String stmDestC2 = stmDestBody + "li[2]/a/span";
	public static final String stmDestC3 = stmDestBody + "li[3]/a/span";

	public static final String stmSourceBox1 = stmMappingBody + "tr/td[1]/div/div/div[1]/ul";
	// public static final String stmSourceBox1 = stmMappingBody +
	// "tr[1]/td[1]/div/div/div[1]/ul";
	public static final String stmSourceBox2 = stmMappingBody + "tr[2]/td[1]/div/div/div[1]/ul";
	public static final String stmSourceBox3 = stmMappingBody + "tr[3]/td[1]/div/div/div[1]/ul";
	public static final String stmLogicBox1 = stmMappingBody + "tr/td[2]/textarea";
	public static final String stmLogicBox2 = stmMappingBody + "tr[2]/td[2]/textarea";
	public static final String stmLogicBox3 = stmMappingBody + "tr[3]/td[2]/textarea";
	public static final String stmDestBox1 = stmMappingBody + "tr/td[3]/div/div/div[1]/ul";
	public static final String stmDestBox2 = stmMappingBody + "tr[2]/td[3]/div/div/div[1]/ul";
	public static final String stmDestBox3 = stmMappingBody + "tr[3]/td[3]/div/div/div[1]/ul";

	public static final String addMappingColumn = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div[2]/div/div/section/div/div/div[2]/div/div[3]/div[1]/div/div[3]/div[1]/a/div";
	public static final String exportSTM = "html/body/div[1]/div[2]/section/div[2]/div[2]/div/div/div[2]/div/div/section/div/div/div[2]/div/div[3]/div[1]/div/div[3]/div[3]/div/a";

}