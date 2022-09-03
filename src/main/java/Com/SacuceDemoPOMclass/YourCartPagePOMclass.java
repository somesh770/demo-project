package Com.SacuceDemoPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPagePOMclass 
{
	private WebDriver driver ;

//----------------------------------
	   @FindBy(xpath="//button[text()='Checkout']")
	   private WebElement checkoutbutton ;
	   
	   public void clickcheckoutbutton()
	   {
		   checkoutbutton.click();  
	   }
//-------------------------------------------------
	   @FindBy(xpath="//button[@id='continue-shopping']")
	   private WebElement ContinueShoppingButton ;
	   
	   public void clickContinueShoppingButton()
	   {
		   ContinueShoppingButton.click();  
	   }
//---------------------------------------------------  
	   @FindBy(xpath="//a[text()='Twitter']")
	   private WebElement tweeterbutton ;
	   
	   public void clicktweeterbutton()
	   {
		   tweeterbutton.click();  
	   }
//---------------------------------------------------   
	   @FindBy(xpath="//a[text()='Facebook']")
	   private WebElement facebookbutton ;
	   
	   public void clickfacebookbutton()
	   {
		   facebookbutton.click();  
	   }
//---------------------------------------------------   
	   @FindBy(xpath="//a[text()='LinkedIn']")
	   private WebElement linkedinbutton ;
	   
	   public void clicklinkedinbutton()
	   {
		   linkedinbutton.click();  
	   }
//--------------------------------------------------- 
	  public YourCartPagePOMclass(WebDriver driver)
	  {
		  this.driver = driver ;
		  PageFactory.initElements(driver, this);
				  
	  }
//-----------------------------------------------------------	   

}



