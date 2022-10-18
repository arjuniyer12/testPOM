package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private WebDriver driver;
	
	
	
	public static WebDriver setChromeBrowser() {
		WebDriverManager.chromedriver().setup();

		return new ChromeDriver();
	}


	
	
	public static WebDriver setFirefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();

		return new FirefoxDriver();
	}
	
	public static WebDriver setEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		
		return new EdgeDriver();
		
	}
	
	
	public static WebDriver setOperaBrowser() {
		WebDriverManager.operadriver().setup();
		return new OperaDriver();
	}
}
