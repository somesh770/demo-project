package Com.SacuceDemoTESTclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SacuceDemoPOMclass.HomePagePOMclass;
import Com.SacuceDemoPOMclass.LoginPagePOMclass;
import Com.SacuceDemoUTILITYclass.ScreenShotClass;

public class TC005_VarifyFilterDropdownFunctionality extends TEST_BASE_CLASS 
{

	@Test
	public void filterDropDownFunctionality() throws InterruptedException, IOException
	{
//---------------------------------------------------------------------------------------------
		HomePagePOMclass hp = new HomePagePOMclass(driver);
		hp.clickOnFilterbutton();
		Thread.sleep(1000);
		ScreenShotClass.TakeScreenShot("TC005 drop down", driver);
		log.info("filter is applied");
		
		
//-----------------------------------------------------------------
		
// validation 
		String ActualText = hp.GetTextFilterApplied();
		System.out.println(ActualText);
		String ExpectedText = "Price (low to high)";
		
		Assert.assertEquals(ActualText, ExpectedText);
	}	

}


