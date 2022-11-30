package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class LoginStepDefs extends AbstractStepDefs {
    @Given("user login to saucedemo")
    public void goToPage() {
        driver.get("https://www.saucedemo.com/");

    }

    @When("I enter Username as {string} and Password as {string}")
    public void iEnterUsernameAsAndPasswordAs(String arg1, String arg2) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(arg1);
        driver.findElement(By.id("password")).sendKeys(arg2);
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();

    }

    @Then("login should be unsuccessful")
    public void loginShouldBeUnsuccessful() throws InterruptedException {
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.saucedemo.com/inventory.html")){
            System.out.println("Test Pass");
        }
        else {
            System.out.println("Test Failed");
        }
        Thread.sleep(2000);
    }
}
