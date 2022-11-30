package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CheckOutStepdefs extends AbstractStepDefs{
    @Given("user open Shopping Card And click CHECKOUT")
    public void userClickCHECKOUT() throws InterruptedException {
        //点击打开购物车页面
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(1000);
        //点击结账
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);
    }

    @When("user enter FirstName as {string} and LastName as {string} and Zip\\/PostalCode as {string}")
    public void userEnter(String arg0, String arg1, String arg2) throws InterruptedException {
        driver.findElement(By.id("first-name")).sendKeys(arg0);
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(arg1);
        driver.findElement(By.id("postal-code")).sendKeys(arg2);
        Thread.sleep(1000);
        driver.findElement(By.id("continue")).click();
    }

    @Then("Whether the payment was successful")
    public void ThePaymentSuccessful() throws InterruptedException {
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.saucedemo.com/checkout-step-two.html")){
            System.out.println("Test Pass");
            Thread.sleep(1000);
            //没有问题，点击完成finish
            driver.findElement(By.id("finish")).click();
        }
        else {
            System.out.println("Test Failed");
        }
        //强制暂停，一个场景结束调用一次，便于观察
        Thread.sleep(2000);
    }
}
