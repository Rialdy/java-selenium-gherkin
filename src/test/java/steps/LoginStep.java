package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.LoginPage;
import pages.ProductPage;

public class LoginStep {

    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    @Given("^User go to login page$")
    public void userGoToLoginPage() throws Throwable {
        loginPage.goToPage();
    }
    @And("^User input username \"([^\"]*)\"$")
    public void inputUsername(String email) throws Throwable {
        loginPage.inputEmail(email);
    }
   
    @And("^User input password \"([^\"]*)\"$")
    public void inputPassword(String password) throws Throwable {
        loginPage.inputPassword(password);
    }

    @And("^User click login button$")
    public void clickLoginButton() throws Throwable {
        loginPage.clickLoginButton();
    }

    @Given("^User verify the product page$")
    public void verifyProductPage() throws Throwable {
        productPage.checkSwagLabsIcon();
    }
}
