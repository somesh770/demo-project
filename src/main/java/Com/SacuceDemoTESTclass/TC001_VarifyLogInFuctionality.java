package Com.SacuceDemoTESTclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.SacuceDemoPOMclass.LoginPagePOMclass;
import Com.SacuceDemoUTILITYclass.ScreenShotClass;

public class TC001_VarifyLogInFuctionality  extends TEST_BASE_CLASS
{
 			
  @Test
  public void logInfunctionality()
  {
	  String ActualTitle = driver.getTitle();
	  String ExpectedTitle = "Swag Labs";
	  
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
  }


}

	
   

