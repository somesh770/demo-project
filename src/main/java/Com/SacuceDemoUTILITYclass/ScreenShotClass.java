package Com.SacuceDemoUTILITYclass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass 
{
	 
	  public static void TakeScreenShot(String filename , WebDriver driver ) throws IOException
	{
		
		
		TakesScreenshot TSS = (TakesScreenshot) driver ;
		File source = TSS.getScreenshotAs(OutputType.FILE);
		File destination = new File ("./ScreenshotsFolder/SauceDemo"+filename+".jpg");
		FileHandler.copy(source, destination);
		
		

	}

}
