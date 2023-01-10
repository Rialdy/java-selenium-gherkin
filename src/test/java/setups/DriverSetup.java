package setups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
    // driver web yang akan kita pake, cuman bisa d rubah di class ini. tp bisa consume dengan getBrowser
    private static WebDriver webDriver; 
    // membuat variable untuk menyimpan nilai dari browser pada argumen CLI
    // dengan default value "chrome"
    String browserName= System.getProperty("browser") == null ? "chrome" : System.getProperty("browser"); 

    // membuat method yang mengembalikan tipedata webDriver
    public static WebDriver getBrowser() {
        return webDriver;
    }

    // membuat method yang accessible d luar class untuk mengakses setupBrowser
    // public void browserStart() {
    //     setupBrowser();
    // }

    // protected void browserStart() {
    //     if (browserName.equalsIgnoreCase("chrome")) {
    //         System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
    //         webDriver = new ChromeDriver();
    //     } else if (browserName.equalsIgnoreCase("firefox")) {
    //         System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
    //         webDriver = new FirefoxDriver();
    //     } else {
    //         throw new IllegalArgumentException("Invalid browser name: " + browserName);
    //     }
    // }

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

