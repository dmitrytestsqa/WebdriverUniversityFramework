package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.BasePage;
import pageObjects.ClickButtonsPage;
import pageObjects.ContactUs_Page;
import pageObjects.IndexPage;
import pageObjects.Products_Page;

public class DriverFactory {

	public static WebDriver driver;
	public static Products_Page productsPage;
	public static ContactUs_Page contactusPage;
	public static BasePage basePage;
	public static ClickButtonsPage clickButtonsPage;
	public static IndexPage indexPage;

	public WebDriver getDriver() {
		try {
			
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser");
			
			switch (browserName) {
			
			case "chrome": {
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;

			}
			
			case "firefox": {
				if (driver == null) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;
			}
			
			case "ie": {
				if (driver == null) {
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					capabilities.setCapability("ignoreZoomSettings", true);
					driver = new InternetExplorerDriver(capabilities);
					driver.manage().window().maximize();
				}
				break;
			}
			}

		} catch (Exception e) {
			System.out.println("unable to load browser = " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			productsPage = PageFactory.initElements(driver, Products_Page.class);
			contactusPage = PageFactory.initElements(driver, ContactUs_Page.class);
			basePage = PageFactory.initElements(driver, BasePage.class);
			clickButtonsPage = PageFactory.initElements(driver, ClickButtonsPage.class);
			indexPage = PageFactory.initElements(driver, IndexPage.class);
		}
		
		return driver;
	}
	
}