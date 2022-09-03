package Com.SacuceDemoPOMclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPagePOMclass 
{
	private WebDriver driver ;
	
//-------------------------------------------
//firstname
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname ;
	
	public void sendFirstName()
	{
		firstname.sendKeys("somesh");
	}
	
//---------------------------------------------
//lastname 	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname ;
	
	public void sendLastName()
	{
		lastname.sendKeys("landge");
	}
	
//---------------------------------------------	
// zip code	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement Zipcode ;
	
	public void sendzipCode()
	{
		Zipcode.sendKeys("413520");
	}
//--------------------------------------------------
// cancel
	@FindBy(xpath="//input[@id='cancel']")
	private WebElement cancelbutton ;
	
	public void ClickCancelbutton()
	{
		cancelbutton.click();
	}
//------------------------------------------------
// continue
	@FindBy(xpath="//input[@id='continue']")
	private WebElement Coninuebutton ;
	
	public void ClickConinuebutton()
	{
		Coninuebutton.click();
	}
//------------------------------------------------
// twitter
	 @FindBy(xpath="//a[text()='Twitter']")
	   private WebElement tweeterbutton ;
	   
	   public void clicktweeterbutton()
	   {
		   tweeterbutton.click();  
	   }
//--------------------------------------------------- 
// facebook
	   @FindBy(xpath="//a[text()='Facebook']")
	   private WebElement facebookbutton ;
	   
	   public void clickfacebookbutton()
	   {
		   facebookbutton.click();  
	   }
//---------------------------------------------------
// linkedin
	   @FindBy(xpath="//a[text()='LinkedIn']")
	   private WebElement linkedinbutton ;
	   
	   public void clicklinkedinbutton()
	   {
		   linkedinbutton.click();  
	   }
//----------------------------------------------------
// constructor
	public CheckoutPagePOMclass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}