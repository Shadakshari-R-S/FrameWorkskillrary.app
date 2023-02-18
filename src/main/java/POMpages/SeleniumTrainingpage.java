package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.WebDriverUtility;

public class SeleniumTrainingpage 
{
	//declaration
			@FindBy(xpath="//h1[text()=\"Selenium Training\"]") private WebElement pageheader;
			@FindBy(id="add")private WebElement plusbutton;
			@FindBy(xpath="//button[text()=\" Add to Cart\"]")private WebElement addtocartbutton;
			@FindBy(id="callout")private WebElement itemAddMesseage;
			
			
			
			//Initialization
			public  SeleniumTrainingpage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//utilization
			public WebElement getpageheader()
			{
				return pageheader;
			}
			public void doubleclickplusbutton(WebDriverUtility web)
			{
				web.doubleclickOnElment(plusbutton);
			}
			public void clickaddtocart()
			{
				addtocartbutton.click();
			}
			public WebElement getitemAddedMessage()
			{
				return itemAddMesseage;
				
			}
}
