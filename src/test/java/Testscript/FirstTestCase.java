package Testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POMpages.ContactUspage;
import POMpages.skillrarydemoappPage;
import genericlibraries.Baseclass;

public class FirstTestCase extends Baseclass
{
	@Test
	public void firstTest()
	{
		SoftAssert soft=new SoftAssert();
		home.clickSkillraryDemoapp();
		web.handlechildBrowser();
		
		soft.assertTrue(skillrarydemo.getPageHeader().isDisplayed());
		
		skillrarydemo.mouseHoverTocourse(web);
		skillrarydemo.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getpageheader(), "selenium Training");
		
		selenium.doubleclickplusbutton(web);
		selenium.clickaddtocart();
	    selenium.getitemAddedMessage();
	    web.handleAlert();
	    web.explicitywait(time, selenium.getitemAddedMessage());
	    
	    soft.assertTrue(selenium.getitemAddedMessage().isDisplayed());
	    
	    soft.assertAll();
	}
	
	
	
}
