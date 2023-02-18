package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUspage 
{
	//declaration
			@FindBy(xpath="//img[contains(@src,\"contactus\")]") private WebElement pageheader;
			@FindBy(name="name")private WebElement nametf;
			@FindBy(name="sender")private WebElement emailtf;
			@FindBy(name="subject")private WebElement subjecttf;
			@FindBy(name="message")private WebElement messagetf;
			@FindBy(xpath="//button[text()=\"Send us mail\"]")private WebElement sendusmailbutton;
			
			
			
			//Initialization
			public ContactUspage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//utilization
			public String getpageheader()
			{
				return pageheader.getTagName();
			}
			public void submitDetails(String name, String email, String subject, String message)
			{
				nametf.sendKeys(name);
				emailtf.sendKeys(email);
				subjecttf.sendKeys(subject);
				messagetf.sendKeys(message);
				sendusmailbutton.click();
			}
}
