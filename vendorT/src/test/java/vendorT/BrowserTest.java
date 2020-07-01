package vendorT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir"); // ProjectPath
		
		String firefoxdriverLocation = projectPath +"\\Drivers\\geckodriver\\geckodriver.exe"; // firefox driver location in the project
		String chromedriverLocation = projectPath + "\\Drivers\\Chromedriver\\chromedriver2.exe"; // chrome driver location in the project
		String internetexplorerLocation = projectPath + "\\Drivers\\IEdriver\\IEDriverServer.exe"; // internet exploere location in the project
		
		// This is the method for setting the things manually.
		//System.setProperty("webdriver.gecko.driver", firefoxdriverLocation); // adding firefox driver to the project
		System.setProperty("webdriver.chrome.driver",chromedriverLocation); // adding chrome driver to the project
		//System.setProperty("webdriver.ie.driver", internetexplorerLocation); // adding internet explorer driver to the project
		
		
		//WebDriver driver = new FirefoxDriver(); // Driver for firefox
		WebDriver driver = new ChromeDriver();  //  Driver for Chrome
		//WebDriver driver = new InternetExplorerDriver(); // Driver for Internet Explorer
		
		// Automatically adding the drivers
		//WebDriverManager.chromedriver().browserVersion("2.36").setup(); // for a specific version
		//WebDriverManager.chromedriver().setup(); // for the latest version
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close(); // to close the current chromedriver
		//driver.quit(); // to close all the chromedriver
		
	}
}
