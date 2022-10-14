package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefintions.baseclass;
import utilities.BrowserUtilities;


public class loginpageobjects extends baseclass {


	private baseclass base;

	public loginpageobjects (baseclass base)
	{
		this.base=base;
		PageFactory.initElements(base.getDriver(),this);

	}



	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailuname;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement emailpwd;

	@FindBy(xpath="//button[@id='button-login']")
	WebElement loginbtn;





	public void setuname(String uname) {
		BrowserUtilities.waitforelement(base.getDriver(),emailuname);
		BrowserUtilities.clearField(emailuname);
		BrowserUtilities.enterText(emailuname, uname);
	}

	public void setpwd(String pwd) {
		BrowserUtilities.waitforelement(base.getDriver(),emailpwd);
		BrowserUtilities.clearField(emailpwd);
		BrowserUtilities.enterText(emailpwd, pwd);
	}

	public void clickonlogin() {
		try {
			BrowserUtilities.waitforelement(base.getDriver(),loginbtn);
			BrowserUtilities.clickElement(loginbtn);
		} catch (Exception e) {
			BrowserUtilities.javaScriptWithArguments(base.getDriver(), loginbtn);


		}
	}
	}












