package Testscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.Baseclass;

public class ThirdTest  extends Baseclass
{
	@Test
	public void thirdTest() throws InterruptedException
	{
		SoftAssert soft=new SoftAssert();
		home.searchFor("core java for selenium");
		soft.assertEquals(corejava.getPageHeader(), "COare java FOR SELENIUM");
		
		corejava.clickCoreJavaForSelenium();
		soft.assertEquals(javavideo.getpageheader(), "Core Java For Selenium TRaining");
		web.switchtoFrame();
		javavideo.clickPlayButton();
		Thread.sleep(2000);
		javavideo.clickPauseButton();
		
		web.switchbackfromFrame();
		
		javavideo.clickAddToWishlist();
		
		soft.assertAll();
	}
}
