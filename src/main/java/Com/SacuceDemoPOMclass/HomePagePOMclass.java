package Com.SacuceDemoPOMclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMclass 
{

	private WebDriver driver;
	private Select filter;
 
//---------------------------------------------------------------
//setting button	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement seetingbutton;
	
	public void clicksettingbutton()
	{
		seetingbutton.click();
	}
//-----------------------------------------------------------------
// logout botton
   @FindBy(xpath="//a[text()='Logout']")
   private WebElement logoutbutton;
   
   public void clicklogoutbutton()
   {
	   logoutbutton.click(); 
	   
   }
   
//----------------------------------------------------------------
   
   @FindBy(xpath="//a[@id='about_sidebar_link']")
   private WebElement Aboutbutton;
   
   public void clickAboutbutton()
   {
	   Aboutbutton.click(); 
   }
//----------------------------------------------------------
   @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
   private WebElement productaddtocard;
   
   public void clickOneProductAddtoCard()
   {
	   productaddtocard.click();   
   }
   
//----------------------------------------------------------------   
   @FindBy(xpath="//span[@class='shopping_cart_badge']")
   private WebElement addtocardbutton ;
   
   public void clickaddtocard()
   {
	   addtocardbutton.click();
	   
   }
//-------------------------------------------------------------------------------  
   @FindBy(xpath="//span[@class='shopping_cart_badge']")
   private WebElement GatTextFromCardButton ;
   
   public String GetTextaddtocard()
   {
	   String TotleProduct=GatTextFromCardButton.getText();
	   return TotleProduct ;
	   
   }
   
//--------------------------------------------------------------------------   
   
   @FindBy(xpath="//select[@class='product_sort_container']")
   private WebElement filterDropDown;
   
   public void clickOnFilterbutton()
   {
	   filterDropDown.click();  
	   
	   filter.selectByVisibleText("Price (low to high)");
	   
   }
   
   @FindBy(xpath="//option[@value='lohi']")
   private WebElement GetTextFilter; 
   
   public String GetTextFilterApplied()
   {
	   String gettextfilter = GetTextFilter.getText();
	   return gettextfilter;
   }
   
//------------------------------------------------------------
// AddToCart-multiple product
   @FindBy(xpath="//button[text()='Add to cart']")
   private List<WebElement> MultipleProductInCart;
   
   public void AddToCartMultipleProduct() 
   {
	for(WebElement Multiproduct : MultipleProductInCart) 
	{
		Multiproduct.click();
		
	}
	
	
   }
//--------------------------------------------------------------
   public HomePagePOMclass(WebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);	
	   
	   filter = new Select (filterDropDown);
   }
			
}
