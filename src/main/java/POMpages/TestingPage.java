package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{	
	//declaration
	@FindBy(xpath="//h1[text()=\"Testing\"]") private WebElement pageheader;
	@FindBy(id="Selenium Training")private WebElement selenuimImage;
	@FindBy(id="cartArea")private WebElement cartarea;
	@FindBy(xpath="//footer[@class=\"main-footer\"]/descendant::i[@class=\"fa fa-facebook\"]")private WebElement facebookicon;
	
	
	
	//Initialization
	public  TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getpageheader()
	{
		return pageheader;
	}
	public WebElement getseleniumImage()
	{
		return selenuimImage;
	}
	public WebElement getcartArea()
	{
		return cartarea;
		
	}
	public WebElement getFacebookIcon()
	{
		return facebookicon;
	}
	public void clickFaceBookicon()
	{
		facebookicon.click();
	}
}
