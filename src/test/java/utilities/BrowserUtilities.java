package utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefintions.baseclass;

public class BrowserUtilities extends baseclass {
	
	
	//public WebDriver driver;
	
	public static void clickElement(WebElement ele) {
		ele.click();
	}
	
	public static void enterText(WebElement ele,String data) {
		ele.sendKeys(data);
	}
	
	public static void clearField(WebElement ele) {
		ele.clear();
		
		
	}
	
	public static void waitforelement(WebDriver driver,WebElement element) {

		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	
	public static void javascriptWithoutArguments(WebDriver driver,String jscommand) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript(jscommand);
	}
	
	public static void javaScriptWithArguments(WebDriver driver,WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",ele);
	}
	
	
	}
	

