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

public class TC006_VarifyoneProductAddedTocart extends TEST_BASE_CLASS 
{

	@Test 
	public void oneProductAddToCard() throws InterruptedException, IOException
	{
//--------------------------------------------------------------------------------------------
		HomePagePOMclass hp = new HomePagePOMclass(driver);
		hp.clickOneProductAddtoCard();
		Thread.sleep(1000);
		ScreenShotClass.TakeScreenShot("TC006-one product add to card", driver);
		log.info("clicked on add to card for one product");
		
		String AtualText=hp.GetTextaddtocard();
		String ExpectedText = "1";
		
		Assert.assertEquals(AtualText, ExpectedText);
	   
		
	}

}
