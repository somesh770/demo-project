package Com.SacuceDemoPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPagePOMclass 
{
	private WebDriver driver;
//---------------------------------------------------
	
	@FindBy(xpath="//button[@id='cancel']")
	private WebElement cancelbutton1;
	
	public void clickCancelButton1()
	{
		cancelbutton1.click();
	}
	
//-------------------------------------------
	@FindBy(xpath="//button[@id='finish']")
	private WebElement FinishButton;
	
	public void clickFinishButton()
	{
		FinishButton.click();
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
	
//-------------------------------------------
	public OverviewPagePOMclass(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
}
