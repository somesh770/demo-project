package Com.SacuceDemoPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComplatePagePOMclass 
{
  public WebDriver driver ;
  
//-------------------------------------------
//THANK YOU FOR YOUR ORDER   
  @FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
  private WebElement THANKYOUtext;
  
  public void ThankyouTmessage()
  {
	  String tankyoutext = THANKYOUtext.getText(); 
	  System.out.println(tankyoutext);
  }
  
// gettext
  @FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']")
  private WebElement GetTextThankYou;
  
  public String GetThankYouMessage()
  {
	  String ThankYouText = GetTextThankYou.getText(); 
	  return ThankYouText;
	  
  }
  
//---------------------------------------------------------------
// Back To Home
  @FindBy(xpath="//button[text()='Back Home']")
  private WebElement BackToHome;
  
  public void clickBackToHome()
  {
	  BackToHome.click();  
  }
//---------------------------------------------------
// Twitter
  @FindBy(xpath="//a[text()='Twitter']")
  private WebElement tweeterbutton ;
  
  public void clicktweeterbutton()
  {
	   tweeterbutton.click();  
  }
//---------------------------------------------------
// Facebook 
  @FindBy(xpath="//a[text()='Facebook']")
  private WebElement facebookbutton ;
  
  public void clickfacebookbutton()
  {
	   facebookbutton.click();  
  }
//---------------------------------------------------
// LinkedIn 
  @FindBy(xpath="//a[text()='LinkedIn']")
  private WebElement linkedinbutton ;
  
  public void clicklinkedinbutton()
  {
	   linkedinbutton.click();  
  }
//---------------------------------------------------------
// constructor
  public ComplatePagePOMclass(WebDriver driver)
  {
	  this.driver = driver ;
	  PageFactory.initElements(driver, this);
  }
  
  
  
}
