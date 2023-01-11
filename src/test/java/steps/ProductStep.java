package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartPage;
import pages.ProductPage;

public class ProductStep {

    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @And("^User add backpack to cart \"([^\"]*)\"$")
    public void userAddSauceLabsBackpack(String text) throws Throwable {
        productPage.addBackpackToCart(text);
    }

    @And("^User add shirt to cart \"([^\"]*)\"$")
    public void userAddSauceLabsShirt(String text) throws Throwable {
        productPage.addShirtToCart(text);
    }

    @And("^User click cart icon$")
    public void userClickCartIcon() throws Throwable {
        productPage.clickCartIcon();
    }

    @Then("^User verify Your Cart Text$")
    public void userVerifyYourCartText() throws Throwable {
        cartPage.yourCartTextDisplayed();
    }
}
