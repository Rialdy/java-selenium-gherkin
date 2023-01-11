package pages;

import org.openqa.selenium.By;

import helper.CommonStep;

public class ProductPage {
    private By swagLabsIcon = By.xpath("//div[@class='app_logo']");
    private By productsText = By.xpath("//span[text()='Products']");
    private By addToCartSauceLabsBackpack = By.id("add-to-cart-sauce-labs-backpack");
    private By addToCartSauceLabsBoltShirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By cartIcon = By.id("shopping_cart_container") ;
    
    CommonStep commonStep = new CommonStep();

    public void checkSwagLabsIcon() throws InterruptedException {
        commonStep.isDisplayed(swagLabsIcon);
    }

    public void checkProductsIcon() throws InterruptedException {
        commonStep.isDisplayed(productsText);
    }

    public void addBackpackToCart(String text) throws InterruptedException {
        commonStep.click(addToCartSauceLabsBackpack);
    }

    public void addShirtToCart(String text) throws InterruptedException {
        commonStep.click(addToCartSauceLabsBoltShirt);
    }

    public void clickCartIcon() throws InterruptedException {
        commonStep.click(cartIcon);
    }
}

