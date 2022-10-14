package StepDefintions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.HomepageObjects;
import PageObjects.checkoupageobjects;
import PageObjects.loginpageobjects;
import PageObjects.productpageobjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.PropertiesReader;

public class baseclass {

	public static WebDriver driver;
	public checkoupageobjects co;
	public HomepageObjects ho;
	public loginpageobjects lo;
	public productpageobjects po;
	public String pagetitle;
	protected static String productname;
	protected static String browsername;
	protected static String url;
	public static PropertiesReader pr;


	public static void initializeProperties() {
		pr=new PropertiesReader();
		pr.init();
		productname=pr.getproductname();
		browsername=pr.getbrowser();
		url=pr.geturl();
		//System.out.println(browsername);

	}
	public void setDriver() throws IOException {
		initializeProperties();
		if (browsername.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			
				driver=new ChromeDriver();
		}

		else if (browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			
				driver=new FirefoxDriver();

		}
		else {
			System.out.println("invalid browser name");
		}
		driver.manage().window().maximize();
		//return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

		
	
	
}
