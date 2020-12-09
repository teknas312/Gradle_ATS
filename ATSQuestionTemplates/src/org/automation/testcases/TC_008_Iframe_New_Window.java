package org.automation.testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.automation.Reporting.ExtentReportsWithTestNG;
import org.automation.base.BaseClass;
import org.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_008_Iframe_New_Window extends BaseClass
{
	@Test

	public void WindowHandleDemo() throws InterruptedException, IOException
	{
		ExtentReportsWithTestNG.reportGenerationMethod("TC_009_Iframe_New_Window", "TC_009_Iframe_New_Window");
		elementClick("xpath",Utility.fetchLocatorValue("applicants_tab"));
		mouseHover(Utility.fetchLocatorValue("applicant_positions_link"));
		iFrameSwitch(1);
		Thread.sleep(4000);
		we.findElement(By.xpath("//td[contains(text(),'QCEngineer4398')]")).click();
		String parent=we.getWindowHandle();
		windowHandles("apply_to_position");
		elementSendText("xpath", Utility.fetchLocatorValue("email_field"), "test67554801@gmail.com");
		elementClick("xpath",Utility.fetchLocatorValue("next_button_1"));
		elementSendText("xpath", Utility.fetchLocatorValue("first_name_field"), "Teknas");
		elementSendText("xpath", Utility.fetchLocatorValue("last_name_field"), "D");
		elementSendText("xpath", Utility.fetchLocatorValue("phone_number_fied"), "9820353599");
		elementClick("xpath", Utility.fetchLocatorValue("common_next_button"));
		elementClick("xpath", Utility.fetchLocatorValue("common_next_button"));
		elementClick("xpath", Utility.fetchLocatorValue("common_next_button"));
		elementClick("xpath", Utility.fetchLocatorValue("common_next_button"));
		elementClick("xpath", Utility.fetchLocatorValue("common_next_button"));
		elementClick("xpath", Utility.fetchLocatorValue("agree_button"));
		we.switchTo().window(parent);
		Thread.sleep(3000);
	}

}
