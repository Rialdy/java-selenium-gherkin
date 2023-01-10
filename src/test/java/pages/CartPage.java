package pages;

import org.openqa.selenium.By;

import helper.CommonStep;

public class CartPage {
    private By yourCartText = By.xpath("//span[text()='Your Cart']");
    private By checkoutButton = By.id("checkout") ;
    
    CommonStep commonStep = new CommonStep();

    public void yourCartTextDisplayed() throws InterruptedException {
        commonStep.isDisplayed(yourCartText);
    }

    public void clickCheckoutButton() throws InterruptedException {
        commonStep.click(checkoutButton);
    }
}
