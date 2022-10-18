package StepDefintions;

import java.io.IOException;
import org.junit.Assert;
import PageObjects.HomepageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomepageSteps extends baseclass{
	private baseclass base;

	public HomepageSteps(baseclass base) throws IOException {
		this.base=base;
	}


	@Given("user is on homepage")
	public void user_is_on_homepage() {
		
		base.getDriver().get(url);
	}


	@When("User gets title of the page")
	public void user_gets_title_of_the_page() {
		ho=new HomepageObjects(base);
		pagetitle=ho.getPageTitle();
	}

	@Then("homepage title should be {string}")
	public void homepage_title_should_be(String expectedtitle) {
		Assert.assertTrue("Title does not match",pagetitle.contains(expectedtitle));
	}

}


