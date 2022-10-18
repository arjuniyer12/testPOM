package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefintions.baseclass;
import utilities.BrowserUtilities;

public class HomepageObjects{
	private baseclass base;
	public HomepageObjects(baseclass base)
	{
		this.base=base;
		PageFactory.initElements(base.getDriver(),this);
	}



	@FindBy(xpath="//div[@class='figure-caption']//h4[normalize-space()='Trays']")
	WebElement cattraylink;

	@FindBy(linkText="Mango Wooden Round Trays")
	WebElement productlink;
	
	//a[text()='Dinnerware Spoons Set']





	public String getPageTitle() {
		return base.getDriver().getTitle();
		
	}
	public void clickoncategorypage() {
		BrowserUtilities.waitforelement(base.getDriver(), cattraylink);
		BrowserUtilities.clickElement(cattraylink);
	}


	public void clickonproduct() {
		BrowserUtilities.waitforelement(base.getDriver(), productlink);
		BrowserUtilities.clickElement(productlink);
	}


	public void clickOnAddCartPopup() {
		String command="cart.add('165');";
		BrowserUtilities.javascriptWithoutArguments(base.getDriver(),command);
		
	}
}
