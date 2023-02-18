package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverUtility;

public class skillrarydemoappPage
{
	//declaration
		@FindBy(xpath="//div[@class=\"navbar-header\"]") private WebElement pageheader;
		@FindBy(id="course")private WebElement coursebutton;
		@FindBy(xpath="//span[@class=\"wrappers\"]/a[text()=\"Selenium Training\"]")private WebElement seleniumtraing;
		@FindBy(name="addresstype") private WebElement categorydropdown;
		@FindBy(xpath="//a[text()=\"Contact Us\"]")private WebElement contactuslink;
		
		
		//Initialization
		public  skillrarydemoappPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public WebElement getPageHeader()
		{
			return pageheader;
		}
		public void mouseHoverTocourse(WebDriverUtility web)
		{
			web.mouseHover(coursebutton);
		}
		
		public void clickSeleniumTraining()
		{
			seleniumtraing.click();
		}
		public void selectCategory(int index, WebDriverUtility web)
		{
			web.dropdown(categorydropdown,index);
		}
		public void cliCkcontactus()
		{
			contactuslink.click();
		}

		public WebElement getConatctUs()
		{
			
			return contactuslink;
		}
		
}
