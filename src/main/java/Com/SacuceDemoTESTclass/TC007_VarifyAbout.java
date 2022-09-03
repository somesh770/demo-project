package Com.SacuceDemoTESTclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SacuceDemoPOMclass.HomePagePOMclass;
import Com.SacuceDemoPOMclass.LoginPagePOMclass;
import Com.SacuceDemoUTILITYclass.ScreenShotClass;

public class TC007_VarifyAbout extends TEST_BASE_CLASS  
{

@Test
public void aboutFunctionality() throws InterruptedException, IOException
{
// home page
		HomePagePOMclass hp = new HomePagePOMclass(driver);
		hp.clicksettingbutton();
		Thread.sleep(1000);
		ScreenShotClass.TakeScreenShot("TC007-setting", driver);
		log.info("clicked on setting button");
	 	
		hp.clickAboutbutton();
		log.info("clicked on about button");
		Thread.sleep(3000);
		ScreenShotClass.TakeScreenShot("TC007-about", driver);
		
//=============================================================================================
// validation
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}

}
