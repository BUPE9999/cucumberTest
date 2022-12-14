package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AddCartStepdefs extends AbstractStepDefs{
    @Given("user starts shopping for the product")
    public void goToShopping() throws InterruptedException {
        driver.navigate().to("https://www.saucedemo.com/inventory.html");
        Thread.sleep(1000);
    }

    @When("user click ADD TO CARD")
    public void userClickADD() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("AddCart should be unsuccessful and open Shopping Car")
    public void addcartShouldBeUnsuccessful() throws InterruptedException {
        //check if remove works normally
        if (driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed()) {
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Failed");
        }
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        //stop here for observing
        Thread.sleep(2000);
    }
}
