package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartPage;
import pages.ProductPage;

public class ProductStep {

    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @And("User add to cart Sauce Labs Backpack")
    public void userAddSauceLabsBackpack() throws Throwable {
        productPage.addSauceLabsBackpackToCart();
    }

    @And("User add to cart Sauce Labs Bolt T-Shirt")
    public void userAddSauceLabsShirt() throws Throwable {
        productPage.addSauceLabsBoltShirtToCart();
    }

    @And("User click cart icon")
    public void userClickCartIcon() throws Throwable {
        productPage.clickCartIcon();
    }

    @Then("User verify Your Cart Text")
    public void userVerifyYourCartText() throws Throwable {
        cartPage.yourCartTextDisplayed();
    }
}
