package setups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import helper.GlobalVariable;

public class DriverSetup {
    private static WebDriver webDriver; 

    // String browserName = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser"); 
    // private String defaultBrowser = System.getProperty("browser");
    // String browserName = defaultBrowser != null ? defaultBrowser : "chrome";
    String browserName = GlobalVariable.DEFAULTBROWSER != null ? GlobalVariable.DEFAULTBROWSER : "chrome";

    public static WebDriver getBrowser() {
        return webDriver;
    }

    protected void browserStart() {
        switch (browserName.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
                webDriver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
                webDriver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser name: " + browserName);
        }
    }

    protected void browserStop() {
            webDriver.close();
        }
    }