package Com.SacuceDemoTESTclass;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.SacuceDemoPOMclass.HomePagePOMclass;
import Com.SacuceDemoPOMclass.LoginPagePOMclass;
import Com.SacuceDemoUTILITYclass.ScreenShotClass;

public class TC002_VarifyLogOutFuctionality extends TEST_BASE_CLASS
{
	 																				
  @Test
  public void logOutfuctionality() throws InterruptedException, IOException
  {
	HomePagePOMclass homepage = new HomePagePOMclass(driver);
	homepage.clicksettingbutton();
	Thread.sleep(1000);
	log.info("clicked on setting button");
	ScreenShotClass.TakeScreenShot("4-setting", driver);
	
	homepage.clicklogoutbutton();
	Thread.sleep(1000);
	log.info("clicked on log out button");
	ScreenShotClass.TakeScreenShot("5-logout", driver);
	
	
//-------------------------------------------------------------------------------
 
	String ExpectedTitle = "Swag Labs";
	String ActualTitle = driver.getTitle();
	
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	
  }


	
	
}
