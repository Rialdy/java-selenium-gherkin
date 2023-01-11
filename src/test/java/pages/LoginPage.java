package pages;

import org.openqa.selenium.By;

import helper.CommonStep;

public class LoginPage {
    private String webAddress = "https://www.saucedemo.com/";
    private By loginButton = By.id("login-button");
    private By emailField = By.id("user-name");
    private By passwordField = By.id("password");
    private By errorMessage = By.xpath("//h3[@data-test='error']");

    CommonStep commonStep = new CommonStep();


    public void goToPage() throws InterruptedException {
        commonStep.goToUrl(webAddress);
    }

    public void clickLoginButton() throws InterruptedException {
        commonStep.click(loginButton);
    }

    public void inputEmail(String username) throws InterruptedException {
        commonStep.sendKeys(emailField, username);
    }

    public void inputPassword(String password) throws InterruptedException {
        commonStep.sendKeys(passwordField, password);
    }

    public void verifyErrorMessage(String message) throws InterruptedException {
        commonStep.verifyText(errorMessage, message);
    }
}
