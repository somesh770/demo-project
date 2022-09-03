package Com.SacuceDemoTESTclass;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SacuceDemoPOMclass.CheckoutPagePOMclass;
import Com.SacuceDemoPOMclass.ComplatePagePOMclass;
import Com.SacuceDemoPOMclass.HomePagePOMclass;
import Com.SacuceDemoPOMclass.LoginPagePOMclass;
import Com.SacuceDemoPOMclass.OverviewPagePOMclass;
import Com.SacuceDemoPOMclass.YourCartPagePOMclass;
import Com.SacuceDemoUTILITYclass.ScreenShotClass;

public class TC003_VarifyAbleToBuyProduct extends TEST_BASE_CLASS 
{
	
	@Test
	public void buyBagFuctionality() throws InterruptedException, IOException
	{

// home page 
		HomePagePOMclass hp = new HomePagePOMclass(driver);

		hp.clickOneProductAddtoCard();
		Thread.sleep(1000);
		log.info("product is added to card");
		ScreenShotClass.TakeScreenShot("6-bag add to cart", driver);
//-------------------------------------------------------------------------
		hp.clickaddtocard();
		Thread.sleep(1000);
		log.info("click on add to card symbol");
		ScreenShotClass.TakeScreenShot("7-your cart page", driver);
		
//=====================================================================================
// your card page
		YourCartPagePOMclass YC = new YourCartPagePOMclass(driver);
		YC.clickcheckoutbutton();
		Thread.sleep(1000);
		ScreenShotClass.TakeScreenShot("8-checkout page", driver);
		log.info("clicked on check out button");
//================================================================================
// Checkout page
		CheckoutPagePOMclass COP = new CheckoutPagePOMclass(driver);
		COP.sendFirstName();
		Thread.sleep(1000);
		ScreenShotClass.TakeScreenShot("9-first name", driver);
		log.info("first name is entered");
		
		COP.sendLastName();
		Thread.sleep(1000);
		ScreenShotClass.TakeScreenShot("10-last name", driver);
		log.info("last name is entered");
		
		COP.sendzipCode();
		Thread.sleep(1000);
		ScreenShotClass.TakeScreenShot("11-zip code", driver);
		log.info("zip code is entered");
		
		COP.ClickConinuebutton();
		Thread.sleep(1000);
		log.info("clicked on continue button");
		ScreenShotClass.TakeScreenShot("12-overview page", driver);
		
		log.info("overview page is opened");
		
		
//========================================================================
// overview page
		OverviewPagePOMclass OVP = new OverviewPagePOMclass(driver);
		OVP.clickFinishButton();
		Thread.sleep(1000);
		log.info("clicked on finish button");
		
		log.info("complete page is opened");
		ScreenShotClass.TakeScreenShot("13-complate page ", driver);
	
//=========================================================================
	
// COMPLETE page
	
		ComplatePagePOMclass comPage = new ComplatePagePOMclass(driver);
		comPage.ThankyouTmessage();
		
		String Actualresult = comPage.GetThankYouMessage();
		String Expectedresult = "THANK YOU FOR YOUR ORDER";
		
		Assert.assertEquals(Actualresult, Expectedresult);
	}
	
		
 }


