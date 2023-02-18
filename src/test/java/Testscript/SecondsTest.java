package Testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.Baseclass;

public class SecondsTest extends Baseclass
{
	@Test
	public void secondTest ()
	{
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickSkillraryDemoapp();
		web.handlechildBrowser();
		
		soft.assertTrue(skillrarydemo.getPageHeader().isDisplayed());
		
		skillrarydemo.selectCategory(1, web);
		soft.assertEquals(testing.getpageheader(), "testing");
		
		web.draganddrop(testing.getseleniumImage(), testing.getcartArea());
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFaceBookicon();
		
		soft.assertAll();
	}
}
