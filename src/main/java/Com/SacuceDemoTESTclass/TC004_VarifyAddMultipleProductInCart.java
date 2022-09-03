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

public class TC004_VarifyAddMultipleProductInCart extends TEST_BASE_CLASS
{
	
	@Test
	public void multipleProductAddTOCard() throws IOException 
	{

// homepage
		HomePagePOMclass homepage = new HomePagePOMclass(driver);
		homepage.AddToCartMultipleProduct();
		ScreenShotClass.TakeScreenShot("TC001-multiple product add to card", driver);
		log.info("multiple product added to card");
//------------------------------------------------------------------------------
// validation
		String ActualText = homepage.GetTextaddtocard();
		String ExpectedText = "6";
		
		Assert.assertEquals(ActualText, ExpectedText);
		
	}
				
}


