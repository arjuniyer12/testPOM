package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefintions.baseclass;
import utilities.BrowserUtilities;

public class productpageobjects {

	public productpageobjects(baseclass base)
	{
	
		PageFactory.initElements(base.getDriver(),this);
	}

	@FindBy(xpath="//div[@id='entry_205455']//button[@title='Add to Cart'][normalize-space()='Add to Cart']")
	WebElement addtocartbutton;
	
	@FindBy(xpath="//div[@id='entry_205454']//input[@id='input-quantity']")
	WebElement qtyfield;
	
	@FindBy(xpath="//button[@title='Buy now']")
	WebElement buynowbutton;
	
	
	
	public void clickonaddtocart() {
		BrowserUtilities.clickElement(addtocartbutton);
	}
	
	public void clickonbuynow() {
		BrowserUtilities.clickElement(buynowbutton);
	}
	
	public void setquantity(int qty) {
		String qtyvalue = Integer.toString(qty);
		BrowserUtilities.clearField(qtyfield);
		BrowserUtilities.enterText(qtyfield, qtyvalue);
	}
	
	
	
	
	
	
	
	

}
