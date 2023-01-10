package helper;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import setups.DriverSetup;

public class CommonStep {

    // WebDriverWait wait = new WebDriverWait(DriverSetup.getBrowser(),Duration.ofSeconds(30));
    WebDriverWait wait = new WebDriverWait(DriverSetup.getBrowser(),Duration.ofSeconds(GlobalVariable.TIMEOUT));

    public void delay(int delay) throws InterruptedException {
        Thread.sleep(delay);
    }

    public void goToUrl(String url) {
        DriverSetup.getBrowser().manage().window().maximize();
        DriverSetup.getBrowser().navigate().to(url);
    }

    public void clear(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).clear();
    }

    public void click(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
    }

    public void sendKeys(By element, String Text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).sendKeys(Text);
    }

    public void isDisplayed(By element) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).isDisplayed();
    }

    public void findRead(By element, String text) {
        List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
        if(list.size() > 0){
            System.out.println(text);
        }
    }

    public void findClick(By element, String text) {
        List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
        for(WebElement alist : list){
            if(alist.getText().contains(text)){
                alist.click();
                break;
            }
        }
    }
}

