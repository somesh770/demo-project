package Com.SacuceDemoPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOMclass 
{
	  private  WebDriver driver ;
	  private Actions act;
//---------------------------------------------------------------
// 1 username
	           @FindBy(xpath ="//form//div[1]//input")
	           private WebElement username;
	           
	           public void SendUserName()
	           {
	         	  username.sendKeys("standard_user");  
	           }
	           
//----------------------------------------------------------------
// 2 password          
	           @FindBy(xpath="//form//div[2]//input")
	           private WebElement password;
	           
	           public void SendPassword()
	           {
	         	  password.sendKeys("secret_sauce");  
	           }
	           
//------------------------------------------------------------------
// 3 login page
	           @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")
	           private WebElement loginbutton ;
	           
	           public void ClicklogIn()
	           {
	         	  act.click(loginbutton).perform();
	           }
//-----------------------------------------------------------------
// constructor declaration
	           
	           public LoginPagePOMclass(WebDriver driver)
	           {
	         	 this.driver = driver ;
	         	 
	         	 PageFactory.initElements(driver, this);
	         	 
	         	 act = new Actions(driver);
	           }
	           
	 

}
