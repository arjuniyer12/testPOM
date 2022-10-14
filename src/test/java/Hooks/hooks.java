package Hooks;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import StepDefintions.baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {
	
	//public WebDriver driver;
	baseclass base;
	
	public hooks(baseclass base) {
		this.base=base;
	}
	
	
	
	
	@Before
	public void setup() {
		try {
			base.setDriver();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@After(order = 0)
	public void teardown() {
	  base.getDriver().quit();	
		
	}
	
	@After(order = 1)
		public void screenshotforfailed(Scenario sc) {
			if(sc.isFailed()) {
				TakesScreenshot ts=(TakesScreenshot)base.getDriver();
				byte[] src=ts.getScreenshotAs(OutputType.BYTES);
				sc.attach(src, "image/png", "screenshot");
				
			}
		}
	}
	
	

