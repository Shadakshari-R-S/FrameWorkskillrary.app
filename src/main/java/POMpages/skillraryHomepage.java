package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryHomepage 
{
	//declaration
	@FindBy(xpath="//img[@alt='SkillRary']") private WebElement logo;
	@FindBy(xpath="//input[@placeholder='Search for Courses']")private WebElement searchtf;
	@FindBy(xpath="//input[@value='go']")private WebElement searchbutton;
	@FindBy(xpath="//a[text()=' GEARS ']") private WebElement gears;
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[text()=' SkillRary Demo APP']")private WebElement skillrarydemoapp;
	
	
	//Initialization
	public skillraryHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public WebElement getLogo()
	{
		return logo;
	}
	
	public void searchFor(String data)
	{
		searchtf.sendKeys(data);
		searchbutton.click();
	}
	public void clickGears()
	{
		gears.click();
	}
	public void clickSkillraryDemoapp()
	{
		skillrarydemoapp.click();
	}
}
