package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaVideopage 
{
	//declaration
		@FindBy(xpath="//h1") private WebElement pageheader;
		@FindBy(xpath="//button[@aria-label=\"Play\"]")private WebElement playbutton;
		@FindBy(xpath="//button[@aria-label=\"pause\"]")private WebElement pausebutton;
		@FindBy(xpath="//span[text()=\"Add To Wishlist\"]")private WebElement addtowishlisttab;
		
		
		
		//Initialization
		public CorejavaVideopage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public String getpageheader()
		{
			return pageheader.getTagName();
		}
		
		public void clickPlayButton()
		{
			playbutton.click();
		}
		public void clickPauseButton()
		{
			pausebutton.click();
		}
		public void clickAddToWishlist()
		{
			addtowishlisttab.click();
		}
}
