package Testscript;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.Baseclass;

public class FourthTest extends Baseclass
{
	@Test
	public void fourthTest()
	{
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickSkillraryDemoapp();
		web.handlechildBrowser();
		
		soft.assertTrue(skillrarydemo.getPageHeader().isDisplayed());
		
		web.scrollToElement(skillrarydemo.getConatctUs());
		skillrarydemo.cliCkcontactus();
		
		soft.assertTrue(contact.getpageheader().equals("a"));
		
		List<String> data=excel.fetchDataFromExecl("Sheet1");
		contact.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));
		
		soft.assertAll();
	}
	
	
}
