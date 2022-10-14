package StepDefintions;

import Hooks.hooks;
import PageObjects.HomepageObjects;
import PageObjects.checkoupageobjects;
import PageObjects.loginpageobjects;
import PageObjects.productpageobjects;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class orderplacingsteps extends baseclass {



	private baseclass base;
	
	public orderplacingsteps(baseclass base) {
		this.base=base;
	}

	

	@When("user click on a product")
	public void user_click_on_a_product() {
		ho=new HomepageObjects(base);
		ho.clickoncategorypage();
		ho.clickonproduct();
	}



	@When("click on Buy now button")
	public void click_on_Buy_now_button() {

		po=new productpageobjects(base);
		po.clickonbuynow();
	}



	@Then("login using username as {string} and password as {string}")
	public void login_using_username_as_and_password_as(String username, String password) {
		lo=new loginpageobjects(base);
		lo.setuname(username);
		lo.setpwd(password);


	}
	@Then("click on login")
	public void click_on_login() {
		lo.clickonlogin();
	}

	@Then("user should be able to view checkout page with title {string}")
	public void user_should_be_able_to_view_checkout_page_with_title(String exptitle) {
		Assert.assertEquals(ho.getPageTitle(), exptitle);
	}


	@When("user fill details and click on checkout submit")
	public void user_fill_details_and_click_on_checkout_submit() {
		co=new checkoupageobjects(base);
		co.clickonbillingaddressconfirm();
		co.clickonshippingaddressconfirm();
		co.clickonshippingmethodconfirm();
		co.clickonagreeterms();

	}

	@Then("order should be placed and thank you page should be displayed")
	public void order_should_be_placed_and_thank_you_page_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}



}
