package setups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
    private static WebDriver webDriver; 

    String browserName= System.getProperty("browser") == null ? "chrome" : System.getProperty("browser"); 

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

