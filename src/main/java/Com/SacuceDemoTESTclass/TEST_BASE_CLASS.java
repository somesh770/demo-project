package Com.SacuceDemoTESTclass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.SacuceDemoPOMclass.LoginPagePOMclass;
import Com.SacuceDemoUTILITYclass.ScreenShotClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST_BASE_CLASS 
{
 WebDriver driver;
 Logger log = Logger.getLogger("SauceDemoMavenProject");

 @Parameters("BrowserName")
 @BeforeMethod
 public void setUp(String BrowserName) throws InterruptedException, IOException
 {
	 if(BrowserName.equals("chrome"))
	 {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	 }
	 else if(BrowserName.equals("edge"))
	 {
	  WebDriverManager.edgedriver().setup();	
	  driver = new EdgeDriver();
		
	 }
	 else if (BrowserName.equals("firefox"))
	 {
		 WebDriverManager.firefoxdriver().setup();
	     
	     WebDriver driver = new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 }
	 else
	 {
		 System.out.println("broser opening error");
	 }
	 
	 PropertyConfigurator.configure("log4j.properties");
	 
		 
		log.info("browser is opened");
		Thread.sleep(1000);
//=================================================================================
		driver.manage().window().maximize();
		log.info("window is maximized");
//=================================================================================
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		log.info("20 sec implicit wait is applied");
//=========================================================================	
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		log.info("URL is opened");
		
//==============================================================================
//login page
		LoginPagePOMclass loginpage = new LoginPagePOMclass(driver);
		
		loginpage.SendUserName();
		Thread.sleep(1000);
		ScreenShotClass.TakeScreenShot("-1-username", driver);
		log.info("username is entered");
		
		loginpage.SendPassword();
		Thread.sleep(1000);
		ScreenShotClass.TakeScreenShot("-2-password", driver);
		log.info("password is entered");
		
		
		loginpage.ClicklogIn();
		Thread.sleep(1000);
		ScreenShotClass.TakeScreenShot("-3-homepage", driver);
		log.info("clicked on login button and successfully login is done");
		
  }
		
///////////////////////////////////////////////////////////////////////////////////////////////
		

		@AfterMethod
		public void tearDown()
		{			
			driver.quit();
			log.info("browser is closed");
		}
 
 }
 

