package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefintions.baseclass;
import utilities.BrowserUtilities;


public class checkoupageobjects {

	
	
	private baseclass base;

	public checkoupageobjects(baseclass base)
	{
		this.base=base;
		PageFactory.initElements(base.getDriver(),this);
		
	}




	@FindBy(xpath="//button[@id='button-payment-address']")
	WebElement BillingAddressConfirm;


	@FindBy(xpath="//button[@id='button-shipping-address']")
	WebElement ShippingAddressConfirm;

	@FindBy(xpath="//button[@id='button-shipping-method']")
	WebElement ShippingMethodConfirm;

	@FindBy(xpath="//input[@name='agree']")
	WebElement Agreeterms;

	@FindBy(xpath="//button[@id='button-payment-method']")
	WebElement PaymentMenthodConfirm;



	public void clickonbillingaddressconfirm() {
		try {
			BrowserUtilities.waitforelement(base.getDriver(),BillingAddressConfirm);
			BrowserUtilities.clickElement(BillingAddressConfirm);	
		} catch (Exception e)
		{
			System.out.println("Direct clicking doesnt work, trying with javascript");
			BrowserUtilities.javaScriptWithArguments(base.getDriver(),BillingAddressConfirm);

		}
	}
	
	public void clickonshippingaddressconfirm() {
		try {
			BrowserUtilities.waitforelement(base.getDriver(),ShippingAddressConfirm);
			BrowserUtilities.clickElement(ShippingAddressConfirm);
		} catch (Exception e)
		{
			System.out.println("Direct clicking doesnt work, trying with javascript");
			BrowserUtilities.javaScriptWithArguments(base.getDriver(),ShippingAddressConfirm);

			
		}

		
	}

	
	public void clickonshippingmethodconfirm() {
		try {
			BrowserUtilities.waitforelement(base.getDriver(),ShippingMethodConfirm);
			BrowserUtilities.clickElement(ShippingMethodConfirm);
		} catch (Exception e)
		{
			System.out.println("Direct clicking doesnt work, trying with javascript");
			BrowserUtilities.javaScriptWithArguments(base.getDriver(),ShippingMethodConfirm);

			
		}

	}
	
	public void clickonagreeterms() {
		try {
			BrowserUtilities.waitforelement(base.getDriver(),Agreeterms);
			BrowserUtilities.clickElement(Agreeterms);
		} catch (Exception e)
		{
			System.out.println("Direct clicking doesnt work, trying with javascript");
			BrowserUtilities.javaScriptWithArguments(base.getDriver(),Agreeterms);
			
		}

	}

	public void clickonpaymentmethodconfirm() {
		try {
			BrowserUtilities.waitforelement(base.getDriver(),PaymentMenthodConfirm);
			BrowserUtilities.clickElement(PaymentMenthodConfirm);
		} catch (Exception e)
		{
			System.out.println("Direct clicking doesnt work, trying with javascript");
			BrowserUtilities.javaScriptWithArguments(base.getDriver(),PaymentMenthodConfirm);
			
			
		}

	}

}
