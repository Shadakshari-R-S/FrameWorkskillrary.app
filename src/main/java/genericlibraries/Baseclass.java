package genericlibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POMpages.ContactUspage;
import POMpages.CorejavaVideopage;
import POMpages.Corejavaseleniumpage;
import POMpages.SeleniumTrainingpage;
import POMpages.TestingPage;
import POMpages.skillraryHomepage;
import POMpages.skillrarydemoappPage;

public class Baseclass 
{
	protected PropertyFileUtility property;
	protected Excelutility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected skillraryHomepage home;
	protected skillrarydemoappPage skillrarydemo;
	protected SeleniumTrainingpage selenium;
	protected TestingPage testing;
	protected Corejavaseleniumpage corejava;
	protected CorejavaVideopage javavideo;
	protected ContactUspage contact;
	protected long time;
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void ClassConfiguration()
	{
		 property=new PropertyFileUtility();
		 excel=new Excelutility();
		 web=new WebDriverUtility();
		 
		 property.propertyFileInitialization(Iconstantpath.PROPERTIES_FILE_PATH);
		 excel.excelInitialtion(Iconstantpath.EXCEL_FILE_PATH);
		 
	}
	
	
	@BeforeMethod
	public void methodConfiguration()
	{
		time=Long.parseLong(property.fetchProperty("timeouts"));
		 web.openApplication(property.fetchProperty("browser"),property.fetchProperty("url"), time);
		 
		 home=new skillraryHomepage(driver);
		// Assert.assertTrue(home.getLogo().isDisplayed());
		 skillrarydemo=new skillrarydemoappPage(driver);
		 selenium=new SeleniumTrainingpage(driver);
		 testing=new TestingPage(driver);
		 corejava=new Corejavaseleniumpage(driver);
		 javavideo=new CorejavaVideopage(driver);
		 contact=new ContactUspage(driver);
		 
	}
	
	
	@AfterMethod
	public void methodTearDown()
	{
		web.quitBrowser();
	}
	@AfterClass
	public void classTearDown()
	{
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite
}
